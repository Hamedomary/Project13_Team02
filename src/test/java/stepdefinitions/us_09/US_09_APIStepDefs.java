package stepdefinitions.us_09;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.us_09.LessonObjectPojo;
import pojos.us_09.LessonPojo;
import static baseurls.BaseUrl.setUp;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static baseurls.BaseUrl.spec;

public class US_09_APIStepDefs {
    Response response;

    LessonObjectPojo object;

    LessonPojo expectedData;
    @Given("User authorised with the credentials {string}_{string}SC")
    public void userAuthorisedAsViceDeanAndTheCredentialsAre_(String username, String password) {
        setUp(username,password);
    }
    @When("User send request to create a lessonSC")
    public void userSendRequestToCreateALesson() {
        //set the url
        spec.pathParams("first", "lessons", "second", "save");
        //set the expected data
        object = new LessonObjectPojo(FakerUtils.creditScoreFaker(), FakerUtils.lessonFaker(), true);
        expectedData = new LessonPojo(object, "Lesson Created", "OK");
        System.out.println("object = " + object);
        System.out.println("expectedData = " + expectedData);

        System.out.println("JsonUtils.convertJavaObjectToJson(expectedData) = " + JsonUtils.convertJavaObjectToJson(expectedData));

        //send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();
    }
    @Then("validate the status code should be {int}")
    public void validate_the_status_code_should_be(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("validate that response data is the same with created lesson credentialsSC")
    public void validate_that_response_data_is_the_same_with_created_lesson_credentials() {
        LessonPojo actualData = response.as(LessonPojo.class);
        System.out.println("actualData = " + actualData);
        assertEquals(expectedData.getObject().getLessonName(),actualData.getObject().getLessonName());

        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
    }



}
