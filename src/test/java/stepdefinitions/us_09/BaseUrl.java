package stepdefinitions.us_09;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseUrl {
    public static RequestSpecification spec;
    static public void adminSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", generateTokenAdmin()).
                setBaseUri(ConfigReader.getProperty("apiUrl")).build();
    }
    static   String url = ConfigReader.getProperty("authenticationURL");
    //admin
    public static String generateTokenAdmin(){
        Map<String, Object> body = new HashMap<>();
        body.put("username",ConfigReader.getProperty("US_24_admin_username"));
        body.put("password",ConfigReader.getProperty("US_24_admin_password"));
        body.put("rememberMe",true);
        Response response = given().contentType(ContentType.JSON).body(body).post(url);
        return  response.jsonPath().getString("token");
    }
    //vice dean
    public static String generateTokenViceDean() {
        Map<String, Object> body = new HashMap<>();
        body.put("username", ConfigReader.getProperty("US_09_viceDean_username"));
        body.put("password", ConfigReader.getProperty("US_09_viceDean_password"));
        body.put("rememberMe",true);
        Response response = given().contentType(ContentType.JSON).body(body).post(url);
        return response.jsonPath().getString("token");
    }
}
