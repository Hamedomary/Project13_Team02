package baseurls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static stepdefinitions.us_09.Authentication.generateToken;

public class BaseUrl {
    public static RequestSpecification spec;
    public static String baseUrl = "https://managementonschools.com/app";

    public static void setUp(String username , String password){
        spec = new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", generateToken(username,password))
                .build();
    }
}
