package stepdefinitions.us_11;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.us_11.LessonProgramPostDTO;
import pojos.us_11.LessonProgramResponseDTO;
import pojos.us_11.ObjectDTO;
import utilities.ConfigReader;

import java.util.ArrayList;
import java.util.List;


import static baseurls.BaseUrl.setUp;
import static baseurls.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US11_API_ViceDeanStepDefinitions {

    LessonProgramPostDTO payload;
    Response response;

    @Given("user is authorized as {string} {string}")
    public void userIsAuthorizedAs(String us11_username, String us11_password) {

        String username = ConfigReader.getProperty(us11_username);
        String password = ConfigReader.getProperty(us11_password);

        setUp(username, password);
    }

    @And("user sets Url for lesson program create")
    public void userSetsUrlForLessonProgramCreate() {
        spec.pathParams("first","lessonPrograms","second","save");
    }

    @And("sets the payload for creating lesson program")
    public void setsThePayloadForCreatingLessonProgram() {

        List<Integer> lessonIdList = new ArrayList<>();
        lessonIdList.add(1845);

        payload = new LessonProgramPostDTO("MONDAY","16", lessonIdList, "12:00", "15:00");

    }

    @When("sends post request and get response")
    public void sendsPostRequestAndGetResponse() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();

    }

    @Then("verify status code is {int}")
    public void verifyStatusCodeIs(int arg0) {
        Assert.assertEquals(200, response.statusCode());
    }

    @And("verify response body")
    public void verifyResponseBody() {
        LessonProgramResponseDTO lessonProgramResponseDTO = response.as(LessonProgramResponseDTO.class);

        ObjectDTO responseData = lessonProgramResponseDTO.getObject();

        Assert.assertEquals(payload.getDay(), responseData.getDay());
        Assert.assertEquals(
                Integer.parseInt(payload.getEducationTermId()), responseData.getEducationTerm().getId());

    }
}
