package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.us_17.ObjectDTO;
import pojos.us_17.StudentInfoPostDTO;
import pojos.us_17.StudentInfoResponseDTO;


import static baseurls.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US17_API_TeacherStepDefinitions {

    StudentInfoPostDTO payload;
    Response response;

    @And("user sets Url for saving grades")
    public void userSetsUrlForSavingGrades() {
        spec.pathParams("first","studentInfo","second","save");
    }

    @And("sets the payload for saving grades")
    public void setsThePayloadForSavingGrades() {
        payload = new StudentInfoPostDTO(3,15,90,"BASARILI BIR YIL GECIRDI",1853,90,2224);

    }

    @When("sends post request for saving grades and get response")
    public void sendsPostRequestForSavingGradesAndGetResponse() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("verify status code for saving grades is {int}")
    public void verifyStatusCodeForSavingGradesIs(int arg0) {
        Assert.assertEquals(200, response.statusCode());
    }

    @And("verify response body of saving grades")
    public void verifyResponseBodyOfSavingGrades() {
        StudentInfoResponseDTO studentInfoResponseDTO = response.as(StudentInfoResponseDTO.class);
        ObjectDTO responseData = studentInfoResponseDTO.getObject();

        Assert.assertEquals(payload.getAbsentee(), responseData.getAbsentee());
        Assert.assertEquals(payload.getFinalExam(), responseData.getFinalExam());
        Assert.assertEquals(payload.getEducationTermId(), responseData.getEducationTermId());
        Assert.assertEquals(payload.getInfoNote(), responseData.getInfoNote());
        Assert.assertEquals(payload.getMidtermExam(), responseData.getMidtermExam());
        Assert.assertEquals(payload.getStudentId(), responseData.getStudentResponse().getUserId());
        Assert.assertEquals(payload.getLessonId(), responseData.getLessonId());
    }
}
