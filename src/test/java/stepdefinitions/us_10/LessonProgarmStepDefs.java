package stepdefinitions.us_10;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.us_10._pojos.*;

import java.util.ArrayList;
import java.util.List;

import static baseurls.BaseUrl.setUp;
import static baseurls.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;

public class LessonProgarmStepDefs {
    Response response;
    Object01Pojo object01;
    PostPojo1pojo payLoad ;
    LessonProgramPojo expectedData;
    LessonNamePojo lessonName;

//    @Given("user is authorised as_Ho {string}")
//    public void userIsAuthorisedAs_Ho(String role) {
//        role = role.trim().toLowerCase();
//
//       if(role.equals("vice")){
//           setUp("ViceDeanHamed","Nargis211400");
//       }else {
//           System.out.println("enter correct tole");
//       }
//    }

//    @Given("user is authorised as_Ho {string}_{string}_{string}")
//    public void userIsAuthorisedAs_Ho__(String role, String username, String password) {
//        if(role.equals("Vice")){
//            setUp(username,password);
//        }else{
//            System.out.println("Enter correct credentials");
//        }
//    }
@Given("user is authorised as vice Dean and the credentials are {string}_{string}")
public void userIsAuthorisedAsViceDeanAndTheCredentialsAre_(String username, String password) {
    setUp(username,password);
}
    @When("user set Base url for vice Dean_Ho")
    public void userSetBaseUrlForViceDean_Ho() {
        spec.pathParams("first","lessonPrograms","second","save");
    }
    @And("sets the expected data for lesson program creation_Ho")
    public void setsTheExpectedDataForLessonProgramCreation_Ho() {
        // set expected data
      /*
      {
    "object": {
        "lessonProgramId": 2737,
        "startTime": "12:12:00",
        "stopTime": "14:13:00",
        "lessonName": [
            {
                "lessonId": 1845,
                "lessonName": "selenıum",
                "creditScore": 12,
                "compulsory": true
            }
        ],
        "day": "FRIDAY"
    },
    "message": "Created Lesson Program",
    "httpStatus": "CREATED"
}
       */
        lessonName = new LessonNamePojo(1845,"selenıum",12,true);
        List<LessonNamePojo> lessonList = new ArrayList<>();
        lessonList.add(lessonName);
        object01= new Object01Pojo(0,"12:14:00","13:14:00",lessonList,"FRIDAY");
        expectedData = new LessonProgramPojo(object01,"Created Lesson Program","CREATED");
        List<Integer> lesson = new ArrayList<>();
        lesson.add(1845);
        LessonListPOJO lessonList1 = new LessonListPOJO(lesson);
        payLoad = new PostPojo1pojo("FRIDAY",20,lesson,"12:14","13:14");
    }
    @And("Sends post request and gets response_HO")
    public void sendsPostRequestAndGetsResponse_HO() {
       response = given(spec).body(payLoad).when().post("{first}/{second}");

        response.prettyPrint();
    }
    @Then("verifies status code is {int}")
    public void verifiesStatusCodeIs(int code) {
        assertEquals(200,response.getStatusCode());
    }
    @And("verifies the lesson program is created_HO")
    public void verifiesTheLessonProgramIsCreated_HO() {
        LessonProgramPojo actualData = response.as(LessonProgramPojo.class);
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
        assertEquals(expectedData.getObject().getDay(),actualData.getObject().getDay());
        assertEquals(expectedData.getObject().getDay(),actualData.getObject().getDay());
        assertEquals(expectedData.getObject().getStartTime(),actualData.getObject().getStartTime());
        assertEquals(expectedData.getObject().getStopTime(),actualData.getObject().getStopTime());
        assertEquals(lessonName.getLessonName(),actualData.getObject().getLessonName().get(0).getLessonName());
        assertEquals(lessonName.getLessonId(),actualData.getObject().getLessonName().get(0).getLessonId());
        assertEquals(lessonName.getCreditScore(),actualData.getObject().getLessonName().get(0).getCreditScore());
        assertEquals(lessonName.toString(),actualData.getObject().getLessonName().get(0).toString());
    }



}