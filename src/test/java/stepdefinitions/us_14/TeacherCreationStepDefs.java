package stepdefinitions.us_14;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.us_10._pojos.LessonListPOJO;
import pojos.us_10._pojos.LessonNamePojo;
import pojos.us_14.*;
import pojos.us_14._update.LessonIdpojo;
import pojos.us_14._update.UpdateLessonsIdListPojo;
import pojos.us_14._update.UpdateTeacher1Pojo;
import pojos.us_14.get.GetTeacherPojo_us14;
import pojos.us_14.get.LessonPojoUs14;
import pojos.us_14.get.LessonsProgramListPojoUs14;
import pojos.us_14.get.ObjectPojo_us14;

import java.util.ArrayList;
import java.util.List;

import static baseurls.BaseUrl.setUp;
import static baseurls.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.put;
import static junit.framework.TestCase.assertEquals;

public class TeacherCreationStepDefs {
    Response deleteResponse;
    UpdateTeacher1Pojo putExpectedData;
    GetTeacherPojo_us14 expectedData;
    ObjectPojo_us14 objectPojo;
    List<LessonsProgramListPojoUs14> lessonProgramList;
    List<LessonPojoUs14> lessons;
    TeacherCreationPojo_HO payLoad;
    Response response;
    Response response1;
    public static Integer userId;

    // (Creating teacher)
    @Given("user is authorised as vice Dean Hamed and the credentials are {string}_{string}")
    public void user_is_authorised_as_vice_dean_hamed_and_the_credentials_are(String username, String password) {
        if(2==2){
           setUp(username,password);
        }
    }
    @And("user sets the base url for teacher creation_HO")
    public void user_sets_the_base_url_for_teacher_creation_ho() {
       spec.pathParams("first","teachers","second","save");
    }
    @And("user sets the expected data_HO")
    public void user_sets_the_expected_data_ho() {

       List<Integer> lessonIdList = new ArrayList<>();
       lessonIdList.add(1932);
        LessonListPOJO lessonId = new LessonListPOJO(lessonIdList);

         payLoad = new TeacherCreationPojo_HO("1978-12-12","Mazar","Nargis01@gmail.com",
                "FEMALE",true,lessonIdList,"Nargis","Nargis2400","907-972-1530",
                "653-65-8965","Katozi","NargisSadaat");
    }
    @And("user sends post request and get response_HO")
    public void user_sends_post_request_and_get_response_ho() {
         response = given(spec).body(payLoad).when().post("{first}/{second}");
     response.prettyPrint();
    }
    @And("verifies status code is {int}_HO")
    public void verifiesStatusCodeIs_HO(int code) {
        assertEquals(code,response.statusCode());
    }

///////////////////////////////////////////////////////////////////////
    // Get the teacher info using its username
    @And("user gets all teacher id using teacher username_HO {string}")
    public void user_gets_all_teacher_id_using_teacher_username_ho(String username) {
     spec.pathParams("first","teachers","second","getAll");
      response1 = given(spec).when().get("{first}/{second}");
      List<Integer> teacherIdList = response1.jsonPath().getList("findAll{it.username=='"+username+"'}.userId");
       userId = teacherIdList.get(0);
        System.out.println(userId);
    }
    @And("user sets base url to get the created teacher by id_HO")
    public void user_sets_base_url_to_get_the_created_teacher_by_id_ho() {
     spec.pathParams("first","teachers","second","getSavedTeacherById","third",""+userId+"");
    }
    @And("user sets expected data using teacher id_HO")
    public void user_sets_expected_data_using_teacher_id_ho() {

        LessonPojoUs14 lesson = new LessonPojoUs14(1842,"Cypress",10,true);
         lessons = new ArrayList<>();
        lessons.add(lesson);
       LessonsProgramListPojoUs14 lessonPrograms = new LessonsProgramListPojoUs14(1932,"MONDAY","06:00:00","06:17:00",lessons);
         lessonProgramList = new ArrayList<>();
        lessonProgramList.add(lessonPrograms);

        objectPojo=  new ObjectPojo_us14( 4204,"NargisSadaat","Nargis","Katozi","Nargis01@gmail.com","FEMALE","Mazar","907-972-1530",
              "653-65-8965","1978-12-12",true,lessonProgramList );

        expectedData =  new GetTeacherPojo_us14(objectPojo,"Teacher successfully found","OK");

    }
    @And("user sends get request and gets response_HO")
    public void user_sends_get_request_and_gets_response_ho() {
     response = given(spec).when().get("{first}/{second}/{third}");
     response.prettyPrint();
    }
    @Then("verifies the response body_HO0")
    public void verifies_the_response_body_ho0() {
    GetTeacherPojo_us14 actualData = response.as(GetTeacherPojo_us14.class);
    assertEquals(expectedData.getMessage(),actualData.getMessage());
    assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
    assertEquals(objectPojo.getEmail(),actualData.getObject().getEmail());
    assertEquals(lessonProgramList.get(0).getLesson().get(0).isCompulsory(),actualData.getObject().getLessonsProgramList().get(0).getLesson().get(0).isCompulsory());
    assertEquals(lessons.get(0).getLessonName(),actualData.getObject().getLessonsProgramList().get(0).getLesson().get(0).getLessonName());

    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // update the teacher info
    @And("user sets base url to update teacher info_HO")
    public void user_sets_base_url_to_update_teacher_info_ho() {
     spec.pathParams("first","teachers","second","update","third",""+userId+"");
    }
    @And("user sets the expected data to update teacher info_HO")
    public void user_sets_the_expected_data_to_update_teacher_info_ho() {
           List<Integer>lessonId = new ArrayList<>();
           lessonId.add(1727);

         putExpectedData = new UpdateTeacher1Pojo("1991-12-03","Mazar","omaryhamed100@gmail.com",
                 "MALE",true,lessonId,"Hamed10","Nargis2f33",
                 "609-552-2500","409-85-3620","omarii","OmariHamed01");
    }
    @And("user sends put request and gets response_HO")
    public void user_sends_put_request_and_gets_response_ho() {
    response = given(spec).body(putExpectedData).when().put("{first}/{second}/{third}");
    response.prettyPrint();

    }
    @And("verifies statusCode is {string}_for put request")
    public void verifiesStatusCodeIs_forPutRequest(String arg0) {
        assertEquals(200,response.statusCode());
    }

//////////////////////////////////////////////////////////////////////////////////////////
    // user gets the updated teacher info using userId
    @And("user sets expected data by using teacher id_HO")
    public void userSetsExpectedDataByUsingTeacherId_HO() {
        LessonPojoUs14 lesson = new LessonPojoUs14(1842,"Cypress",10,true);
        lessons = new ArrayList<>();
        lessons.add(lesson);


        LessonsProgramListPojoUs14 lessonPrograms = new LessonsProgramListPojoUs14(1727,"FRIDAY","07:00:00"
                ,"07:30:00",lessons);
        lessonProgramList = new ArrayList<>();
        lessonProgramList.add(lessonPrograms);

        objectPojo=  new ObjectPojo_us14( 4161,"OmariHamed01","Hamed10","omarii",
                "omaryhamed100@gmail.com","MALE","Mazar","609-552-2500",
                "409-85-3620","1991-12-03",true,lessonProgramList );

        expectedData =  new GetTeacherPojo_us14(objectPojo,"Teacher successfully found","OK");

    }
    @And("verifies status code is {string}_ for get request_HO")
    public void verifiesStatusCodeIs_ForGetRequest_HO(String code) {
        assertEquals(code,response.statusCode()+"");
    }
    @And("verifies the get response body_HO{int}")
    public void verifiesTheGetResponseBody_HO(int arg0) {
        GetTeacherPojo_us14 actualData = response.as(GetTeacherPojo_us14.class);

        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
        assertEquals(objectPojo.getEmail(),actualData.getObject().getEmail());
        assertEquals(lessonProgramList.get(0).getLesson().get(0).isCompulsory(),actualData.getObject().getLessonsProgramList().get(0).getLesson().get(0).isCompulsory());
        assertEquals(lessons.get(0).getLessonName(),actualData.getObject().getLessonsProgramList().get(0).getLesson().get(0).getLessonName());
        assertEquals(expectedData.getObject().getUsername(),actualData.getObject().getUsername());
        assertEquals(expectedData.getObject().getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getSsn(),actualData.getObject().getSsn());
        assertEquals(expectedData.getObject().getName(),actualData.getObject().getName());
    }


    @When("user sets base url to delete created teacher_HO")
    public void userSetsBaseUrlToDeleteCreatedTeacher_HO() {
        spec.pathParams("first","teachers","second","delete","third",""+userId+"");
    }

    @And("user sends delete request and get response_HO")
    public void userSendsDeleteRequestAndGetResponse_HO() {
         deleteResponse = given(spec).when().delete("{first}/{second}/{third}");
    }

    @Then("Verifies the status code is {int} for the delete request_HO")
    public void verifiesTheStatusCodeIsForTheDeleteRequest_HO(int code) {
        assertEquals(code,deleteResponse.statusCode());
    }


}
