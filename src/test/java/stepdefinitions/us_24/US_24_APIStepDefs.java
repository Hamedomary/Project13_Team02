package stepdefinitions.us_24;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.us_24.PostResponsePojo;
import pojos.us_24.ResponsePojo;
import pojos.us_24.TeacherPostPojo;
import stepdefinitions.us_09.FakerUtils;
import java.util.List;
import static baseurls.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_24_APIStepDefs {

    Response response;
    PostResponsePojo actualData;
    public static int id;
    ResponsePojo actualDataById;
    ResponsePojo expectedData;
    List<Integer> lessons= List.of(1929,1930);
    TeacherPostPojo payload;


    @When("User send request to create a teacher")
    public void userSendRequestToCreateATeacher() {
        //set the url
        spec.pathParams("first", "teachers", "second", "save");
        //set the expected data
       TeacherPostPojo payload = new TeacherPostPojo(FakerUtils.birthDayFaker(),"Turkey",FakerUtils.emailFaker(),FakerUtils.genderFaker(),true,FakerUtils.nameFaker(),
                "Mahraba123",FakerUtils.phoneNumberFaker(),FakerUtils.ssnFaker(),FakerUtils.surnameFaker(),FakerUtils.usernameFaker(),FakerUtils.lessonIDFaker());
        response= given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        id=response.jsonPath().getInt("object.userId");
        System.out.println(id);
        actualData= response.as(PostResponsePojo.class);
    }

    @And("verify teacher is created through APISC")
    public void verifyTeacherIsCreatedThroughAPI() {
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());
        assertEquals(payload.getEmail(),actualData.getObject().getEmail());
        assertEquals("Teacher saved successfully",actualData.getMessage());
        assertEquals("CREATED",actualData.getHttpStatus());

    }
}
