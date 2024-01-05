package stepdefinitions.us_07;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.us_07.ContactObjectPojo;
import pojos.us_07.Deanpojo;

import static baseurls.BaseUrl.setUp;
import static io.restassured.path.json.JsonPath.given;
import static junit.framework.TestCase.assertEquals;

public class US07APIStepDef {

        RequestSpecification spec;
        Response response;
        ContactObjectPojo expectedData;

        Deanpojo deanpojo;

        Deanpojo payLoad;

        public static ContactObjectPojo contactObjectPojo;

        private void setupRegister() {
        }



        @Given("user login as dean with credentials username {string}, password {string}_GO")
        public void userLoginAsDeanWithCredentialsUsernamePasswordDeanGul_GO(String username, String password) {
            setUp(username, password);

        }

        @And("user sets th url for dean_GO")
        public void userSetsThUrlForDean_GO() {

            payLoad = new Deanpojo("DeanGul", "DeanGul123");

            spec.pathParams("first", "dean", "second", "save");
            RestAssured.when().post("{dean}/{save}").then().statusCode(200);
        }

    private RestAssured given(RequestSpecification spec) {
        return null;
    }


        @And("user sets the expected data_GO")
        public void userSetsTheExpectedData_GO() {

            deanpojo = new Deanpojo("DeanGul", "DeanGul123");

        }

        @And("user creates contact message with post request_GO")
        public void userCreatesContactMessageWithPostRequest_GO() {
            //  payLoad = new ContactObjectPojo("Hayley", "Hay@gmail.com", "Lessons", "I started API test", "2023-12-25");
            contactObjectPojo = new ContactObjectPojo("Hayley", "Hay@gmail.com", "Lessons", "I started API test", "2023-12-25");

            expectedData = new ContactObjectPojo();


           // response.prettyPrint();


        }

        @Then("the response should include fields with get request for {string}, {string}, {string}, and {string}_GO")
        public void theResponseShouldIncludeFieldsWithGetRequestForAnd_GO(String arg0, String arg1, String arg2, String arg3) {

            setupRegister();

            spec.pathParams("first", "contactMessages", "second", "save");

            response = given(spec).get("{first}/{second}");
        }


        @Given("dean gets messages with getAll request_GO")
        public void deanGetsMessagesWithGetAllRequest_GO() {

            spec.pathParams("first", "contactMessages", "second", "getAll").
                    queryParams("size", "1000");
           response = given(spec).get("{first}/{second}");


        }

        @And("verifies all messages_GO")
        public void verifiesAllMessages_GO(String name, String email, String subject, String message, String date) {
            JsonPath json = response.jsonPath();
            String contactName = json.getList("content.findAll{it.name=='contactName'}.name").get(0).toString();
            String contactEmail = json.getList("content.findAll{it.email=='contactEmail'}.email").get(0).toString();
            String contactSubject = json.getList("content.findAll{it.subject=='contactSubject'}.subject").get(0).toString();
            String contactMessage = json.getList("content.findAll{it.message=='contactMessage'}.message").get(0).toString();
            String contactDate = json.getList("content.findAll{it.date=='contactDate'}.date").get(0).toString();


            assertEquals(200, response.statusCode());

            assertEquals(name, contactName);
            assertEquals(email, contactEmail);
            assertEquals(subject, contactSubject);
            assertEquals(message, contactMessage);
            assertEquals(date, contactDate);

        }

        @Then("verifies status code is {int}_GO")
        public void verifiesStatusCodeIs_GO(int arg0) {

            assertEquals(200, response.getStatusCode());
        }

}

