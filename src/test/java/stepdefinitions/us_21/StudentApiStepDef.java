package stepdefinitions.us_21;

import baseurls.BaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class StudentApiStepDef {

    private Response response;
    private RequestSpecification requestSpecification;

    @Given("the user go to lessons program list as {string}")
    public void theStudentGoToLessonsProgramList(String userType) {
        requestSpecification = BaseUrl.setUpApi(userType);
        response = given(requestSpecification)
                .when().get("lessonPrograms/getAll");
        // response.prettyPrint();
    }


    @Then("the student should be able to see the details")
    public void theStudentShouldBeAbleToSeeTheDetails(List<String> lessonsProgramList) {
        List<String> actualList = response.jsonPath().getList(".");
        assertTrue(actualList.contains(lessonsProgramList));
    }

    @Given("the user select lesson from student controller as {string}")
    public void theStudentSelectLessonFromStudentController(String userType) {
        String body = "{\n" +
                "  \"lessonProgramId\": [\n" +
                "    1942\n" +
                "  ]\n" +
                "}";
        requestSpecification = BaseUrl.setUpApi(userType);
        response = given(requestSpecification).body(body)
                .when().post("students/chooseLesson");
        response.prettyPrint();
    }

    @Then("the student should be able to lesson details")
    public void theStudentShouldBeAbleToLessonDetails() {
        assertEquals(200, response.getStatusCode());
        assertEquals("Lesson added to Student", response.jsonPath().getString("message"));
    }


    @Given("the user go to grades as {string}")
    public void theUserGoToGradesAs(String userType) {
        String studentId = "2687";
        requestSpecification = BaseUrl.setUpApi(userType);
        response = given(requestSpecification)
                .when().get("/studentInfo/getByStudentId/" + studentId);
        response.prettyPrint();

    }

    @Then("the user should be able to see the grades")
    public void theUserShouldBeAbleToSeeTheGrades() {
        assertEquals(200, response.getStatusCode());
        assertNotNull("no grades given", response.jsonPath().getString("note"));
    }

    @Given("the user go to meetings as {string}")
    public void theUserGoToMeetingsAs(String userType) {
        String studentId = "2687";
        requestSpecification = BaseUrl.setUpApi(userType);
        response = given(requestSpecification)
                .when().get("/studentInfo/getByStudentId/" + studentId);
        response.prettyPrint();

    }

    @Then("the user should be able to see the meetings details")
    public void theUserShouldBeAbleToSeeTheMeetingsDetails() {
    }
}
