package stepdefinitions.us_04;

import baseurls.BaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.internal.mapping.Jackson2Mapper;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.openqa.selenium.devtools.Message;
import pojos.us_04.DeanPojo;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class DeanApiStepDefinition {

    private Response response;
    private DeanPojo deanPojo;
    Faker faker = new Faker();


    RequestSpecification requestSpecification;

    @Given("the user enters new dean credentials as {string}")
    public void theAdminUserEntersNewDeanCredentials(String userType) {
        requestSpecification = BaseUrl.setUpApi(userType);

        Date birthday = faker.date().birthday();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedBirthday = dateFormat.format(birthday);
        String birthPlace = faker.address().city();
        String name = faker.name().firstName();
        String surname = faker.name().lastName();
        String password = (faker.name().firstName()).toLowerCase(Locale.ROOT).concat(faker.number().digit()).concat(faker.name().lastName().toUpperCase(Locale.ROOT));
        String phoneNumber = faker.numerify("###").concat("-").concat(faker.numerify("###")).concat("-")
                .concat(faker.numerify("####"));
        String ssn = faker.numerify("###").concat("-").concat(faker.numerify("##")).concat("-")
                .concat(faker.numerify("####"));
        String username = faker.name().username();

        deanPojo = new DeanPojo(formattedBirthday, birthPlace, "MALE", name, password, phoneNumber, ssn, username, surname);
        response = given(requestSpecification).body(deanPojo).when().post("dean/save");
        //   response.prettyPrint();
    }

    @Then("the admin user see the dean has been created")
    public void theAdminUserSeeTheDeanHasBeenCreated() {
        int actualStatusCode = response.getStatusCode();
        assertEquals(200, actualStatusCode);
        String message = response.jsonPath().getString("httpStatus");
        assertEquals("CREATED", message);
    }

    @When("the user enters new unvalid dean credentials as {string}")
    public void theUserEntersNewUnvalidDeanCredentialsAsAdmin(String userType) {
        requestSpecification = BaseUrl.setUpApi(userType);

        Date birthday = faker.date().birthday();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedBirthday = dateFormat.format(birthday);
        String birthPlace = dateFormat.format(birthday);
        String name = faker.name().firstName();
        String surname = faker.name().lastName();
        String password = (faker.name().firstName()).toLowerCase(Locale.ROOT).concat(faker.number().digit()).concat(faker.name().lastName().toUpperCase(Locale.ROOT));
        String phoneNumber = faker.numerify("###").concat("-").concat(faker.numerify("###")).concat("-")
                .concat(faker.numerify("####"));
        String ssn = faker.numerify("###").concat("-").concat(faker.numerify("##")).concat("-")
                .concat(faker.numerify("####"));
        String username = faker.name().username();

        deanPojo = new DeanPojo(formattedBirthday, birthPlace, "MALE", name, password, phoneNumber, ssn, username, surname);
        response = given(requestSpecification).body(deanPojo).when().post("dean/save");
        response.prettyPrint();
    }

    @Then("the admin user should not see the dean has been created")
    public void theAdminUserShouldNotSeeTheDeanHasBeenCreated() {
        assertEquals(400, response.getStatusCode());
    }
}
