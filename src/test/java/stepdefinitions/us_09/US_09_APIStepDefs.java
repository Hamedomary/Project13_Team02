package stepdefinitions.us_09;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.us_09.ObjectPojo;
import pojos.us_09.ViceDeanPojo;

import static baseurls.BaseUrl.setUp;
import static baseurls.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US_09_APIStepDefs {

    Response response;
    ObjectPojo objectPojo;


    @Given("User is authorized as {string}")
    public void userIsAuthorizedAs(String role) {
        role = role.trim().toLowerCase();

        switch (role) {
            case "admin":
                setUp("SabihaAdmin","Mahraba123");
                break;
            case "ViceDean":
                setUp("Sabiha ViceDean","Mahraba123");
                break;
            default:
                System.out.println("Please enter with valid Role");
        }
    }

    @When("User send request to get all lessons")
    public void userSendRequestToGetAllLessons() {
        spec.pathParams("first","lessons","second","getAll");
       response = given(spec).when().get("{first}/{second}");
     objectPojo = response.as(ObjectPojo.class);
    }

    @Then("verify status code is {int}")
    public void verifyStatusCodeIs(int code) {
        assertEquals(code,response.statusCode());

    }

    @And("verify Lesson Name is visible")
    public void verifyLessonNameIsVisible() {
        assertFalse(objectPojo.getLessonName().isEmpty());
    }
    @And("verify Compulsory is visible")
    public void verifyCompulsoryIsVisible() {
        assertFalse(objectPojo.getCompulsory().toString().isEmpty());
    }
    @And("verify Credit Score is visible")
    public void verifyCreditIsVisible() {
        assertFalse(String.valueOf(objectPojo.getCreditScore()).isEmpty());
    }

    @When("User send request to update a lesson")
    public void userSendRequestToUpdateALesson() {

    }

    @Then("verify {string} is changed")
    public void verifyIsChanged(String arg0) {
    }
}
