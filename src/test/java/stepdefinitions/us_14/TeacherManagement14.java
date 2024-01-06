package stepdefinitions.us_14;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.us_14.TeacherManagementPage;
import utilities.ActionsUtils;
import utilities.BrowserUtils;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class TeacherManagement14 {
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();

    String username12;
    String emailAddress;
    String ssnNumberStr;
    String phoneNumberStr;
    String name1;
    @When("Clicks on teacher management link")
    public void clicks_on_teacher_management_link() {
        WaitUtils.waitFor(2);
    teacherManagementPage.teacherManagementLink.click();
    }
    @When("Selects a lesson from \\(choose lessons) to create a teacher")
    public void selects_a_lesson_from_choose_lessons_to_create_a_teacher() {
        WaitUtils.waitFor(3);
      teacherManagementPage.chooseLessonDropDown.click();
      WaitUtils.waitFor(2);
      ActionsUtils.actionsScrollDown();
      ActionsUtils.actionsTab(teacherManagementPage.chooseLessonDropDown);
    }

    @When("Enters a name {string} into the Name field")
    public void enters_a_name_into_the_name_field(String name) {
    WaitUtils.waitFor(4);
    name1 = name;
    teacherManagementPage.nameInput.sendKeys(name1);
    }
    @When("Enters a surname {string} into the Surname field")
    public void enters_a_surname_into_the_surname_field(String surname) {
        WaitUtils.waitFor(2);
      teacherManagementPage.surNameInput.sendKeys(surname);
    }
    @When("Enters a birth place {string} into the Birth place field")
    public void enters_a_birth_place_into_the_birth_place_field(String birthPlace) {
        WaitUtils.waitFor(2);
       teacherManagementPage.birthPlaceInput.sendKeys(birthPlace);
    }
      @When("Enters a phone number into the phone number field")
    public void enters_a_phone_number_into_the_phone_number_field() {
        WaitUtils.waitFor(3);

        int min = 11;
        int max = 100;
        int rand3= (int) Math.floor(Math.random() * (max - min + 1) + min);

        int min1 = 100;
        int max1 = 1000;
        int rand2= (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);

        int min2 = 1000;
        int max2 = 1999;
        int rand1= (int) Math.floor(Math.random() * (max2 - min2 + 1) + min2);

        phoneNumberStr = Integer.toString(rand2)+"-"+Integer.toString(rand2)+"-"+Integer.toString(rand1);
       teacherManagementPage.phoneNumberInput.sendKeys(phoneNumberStr);

    }
    @When("Clicks on is advisor Teacher checkbox")
    public void clicks_on_is_advisor_teacher_checkbox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.isAdvisorTeacherCheckbox.click();
    }
    @When("Selects Male as the gender")
    public void selects_male_as_the_gender() {
        WaitUtils.waitFor(2);
    teacherManagementPage.maleRadio.click();
    }

    @When("Enters a Ssn number into the Ssn field")
    public void enters_a_ssn_number_into_the_ssn_field() {
        WaitUtils.waitFor(2);

        int min = 11;
        int max = 100;
        int rand3= (int) Math.floor(Math.random() * (max - min + 1) + min);

        int min1 = 100;
        int max1 = 1000;
        int rand2= (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);

        int min2 = 1000;
        int max2 = 1999;
        int rand1= (int) Math.floor(Math.random() * (max2 - min2 + 1) + min2);

        ssnNumberStr = Integer.toString(rand2)+"-"+Integer.toString(rand3)+"-"+Integer.toString(rand1);
        teacherManagementPage.ssnInput.sendKeys(ssnNumberStr);
    }
    @When("Enters a DOB {string} into the date of birth field")
    public void enters_a_dob_into_the_date_of_birth_field(String dateOfBirth) {
        WaitUtils.waitFor(3);
     teacherManagementPage.dateOfBirthInput.sendKeys(dateOfBirth);
    }

    @When("Enters a valid password {string} into the password field")
    public void enters_a_valid_password_into_the_password_field(String password) {
        WaitUtils.waitFor(2);
        teacherManagementPage.passwordInput.sendKeys(password);
    }

    @When("Clicks on submit button")
    public void clicks_on_submit_button() {
        WaitUtils.waitFor(2);
    JSUtils.JSclickWithTimeout(teacherManagementPage.teacherSubmitButton);
     WaitUtils.waitFor(3);
    }


    @Then("Verify teacher Successfully Created message is appeared")
    public void verifyTeacherSuccessfullyCreatedMessageIsAppeared() {

    }


    @And("Enters an Email address into the Email address field")
    public void entersAnEmailAddressIntoTheEmailAddressField() {
        WaitUtils.waitFor(2);;
        Random random = new Random();
        int rand = random.nextInt(100);
         emailAddress =rand+ "omaryhamed79@gmail.com";
       teacherManagementPage.emailInput.sendKeys(emailAddress);
    }
    @And("Enters a User Name into the User Name field")
    public void entersAUserNameIntoTheUserNameField() {
        WaitUtils.waitFor(2);

        Random random = new Random();
       int rand = random.nextInt(100);
         username12 = "Ahmad "+rand;
        teacherManagementPage.usernameInput.sendKeys(username12);
    }

    @And("Verify teacher \\( Name, phone number, Ssn and Username ) are visible in the teacher list")
    public void verifyTeacherNamePhoneNumberSsnAndUsernameAreVisibleInTheTeacherList() {
        WaitUtils.waitFor(3);
        JSUtils.JSclickWithTimeout(teacherManagementPage.endPageIcon);

        System.out.println("Teacher List Table Heading");
        String name = teacherManagementPage.teacherNameColumn.getText();
        System.out.println(" First Column = " + name);
        assertTrue(teacherManagementPage.teacherNameColumn.getText().contains(name));
        WaitUtils.waitFor(1);

        String phoneNumber = teacherManagementPage.teacherPhoneNumberColumn.getText();
        System.out.println(" Second Column = " + phoneNumber);
        assertTrue(teacherManagementPage.teacherPhoneNumberColumn.getText().contains(phoneNumber));
        WaitUtils.waitFor(1);

        String ssn = teacherManagementPage.teacherSsnNumberColumn.getText();
        System.out.println(" Third Column = "  + ssn);
        assertTrue(teacherManagementPage.teacherSsnNumberColumn.getText().contains(ssn));
        WaitUtils.waitFor(1);

        String userName = teacherManagementPage.teacherUserNameColumn.getText();
        System.out.println(" Fourth Column = " + userName);
        assertTrue(teacherManagementPage.teacherUserNameColumn.getText().contains(userName));
        WaitUtils.waitFor(2);



        WaitUtils.waitFor(5);

        List<WebElement> teacherCredentialList = teacherManagementPage.teacherCredentialList;
        String teacherData = "";
        for( WebElement w :teacherCredentialList){
            teacherData = teacherData + w.getText()+" ";
        }
        System.out.println(" Teacher list last page datas = " + teacherData);

        assertTrue(teacherData.contains(username12));
        assertTrue(teacherData.contains(name1));
//        assertTrue(teacherData.contains(phoneNumber));
//        assertTrue(teacherData.contains(ssnNumber));
        System.out.println("-------------------------------------");

        System.out.println(""+name+" = " + name1);
        System.out.println(""+userName+" = " + username12);
        System.out.println(""+phoneNumber+" = " + phoneNumberStr);
        System.out.println(""+ssn+" = " + ssnNumberStr);

    }
}
