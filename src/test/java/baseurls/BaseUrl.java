package baseurls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.Authentication;
import utilities.ConfigReader;

import static utilities.Authentication.generateToken;

public class BaseUrl {

    public static RequestSpecification spec;

    public static RequestSpecification setUp(String username, String password) {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", generateToken(username, password))
                .build();
    }

    public static RequestSpecification setUpApi(String userType) {
        String username = null;
        String password = null;
        if (userType.equals("student")) {
            username = ConfigReader.getProperty("student_username");
            password = ConfigReader.getProperty("student_password");
        } else if (userType.equals("admin")) {
            username = ConfigReader.getProperty("admin_username");
            password = ConfigReader.getProperty("admin_password");
        }
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", Authentication.generateToken(username, password))
                .build();
    }
}
