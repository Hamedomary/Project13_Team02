package stepdefinitions.us_14;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.us_14.TeacherUpdatePage;
import utilities.ActionsUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class TeacherCredentialsUpdating {
    Robot robot;
    Random random;
    String emailAddress;
    String phoneNumberStr;
    String ssnNumberStr;
    TeacherUpdatePage teacherUpdatePage = new TeacherUpdatePage();

    @When("Clicks on edit button")
    public void clicks_on_edit_button() {
        WaitUtils.waitFor(2);
        JSUtils.JSclickWithTimeout(teacherUpdatePage.editButton);
    }
    @And("Selects a lesson from \\(choose lessons) dropDown in Teacher Edit page")
    public void selects_a_lesson_from_choose_lessons_drop_down_in_teacher_edit_page() throws AWTException {
     WaitUtils.waitFor(2);
       robot = new Robot();
       robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        teacherUpdatePage.chooseLessonEdit.click();
        WaitUtils.waitFor(2);
        ActionsUtils.actionsScrollDown();
        ActionsUtils.actionsTab(teacherUpdatePage.chooseLessonEdit);
    }
    @And("Enters a new name {string} into the Name field")
    public void enters_a_new_name_into_the_name_field(String name) {
        WaitUtils.waitFor(3);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
         robot.keyPress(KeyEvent.VK_CLEAR);
        robot.keyRelease(KeyEvent.VK_CLEAR);
     teacherUpdatePage.teacherNameEdit.sendKeys(name);
    }
    @And("Enters a new surname {string} into the Surname field")
    public void enters_a_new_surname_into_the_surname_field(String surname) {
        WaitUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_CLEAR);
        robot.keyRelease(KeyEvent.VK_CLEAR);
      teacherUpdatePage.teacherSurnameEdit.sendKeys(surname);
    }
    @And("Enters a new birth place {string} into the Birth place field")
    public void enters_a_new_birth_place_into_the_birth_place_field(String birthPlace) {
        WaitUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_CLEAR);
        robot.keyRelease(KeyEvent.VK_CLEAR);
        teacherUpdatePage.teacherBirthPlaceEdit.sendKeys(birthPlace);

    }
    @And("Enters a new Email address into the Email address field")
    public void enters_a_new_email_address_into_the_email_address_field() {
        WaitUtils.waitFor(3);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_CLEAR);
        robot.keyRelease(KeyEvent.VK_CLEAR);
        random = new Random();
        int rand = random.nextInt(1000);
        emailAddress =rand+ "omaryhamed79@gmail.com";
        teacherUpdatePage.teacherEmailEdit.sendKeys(emailAddress);
    }
    @And("Enters a new phone number into the phone number field")
    public void enters_a_new_phone_number_into_the_phone_number_field() {
        WaitUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_CLEAR);
        robot.keyRelease(KeyEvent.VK_CLEAR);
        WaitUtils.waitFor(1);

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
        teacherUpdatePage.teacherPhoneEdit.sendKeys(phoneNumberStr);
    }
    @And("Clicks on is advisor Teacher checkbox in Teacher edit page")
    public void clicks_on_is_advisor_teacher_checkbox_in_teacher_edit_page() {
        WaitUtils.waitFor(1);
     teacherUpdatePage.isAdvisorTeacherEdit.click();
    }
    @And("Selects Male as the gender in teacher edit page")
    public void selects_male_as_the_gender_in_teacher_edit_page() {
        WaitUtils.waitFor(1);
    teacherUpdatePage.femaleRadioEdit.click();
    }
    @And("Enters a new DOB {string} into the date of birth field")
    public void enters_a_new_dob_into_the_date_of_birth_field(String dateOfBirth) {
        WaitUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_CLEAR);
        robot.keyRelease(KeyEvent.VK_CLEAR);
        teacherUpdatePage.teacherDateOfBirthEdit.sendKeys(dateOfBirth);
    }
    @And("Enters a new Ssn number into the Ssn field")
    public void enters_a_new_ssn_number_into_the_ssn_field() {
        WaitUtils.waitFor(4);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_CLEAR);
        robot.keyRelease(KeyEvent.VK_CLEAR);
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
        teacherUpdatePage.teacherSsnEdit.sendKeys(ssnNumberStr);
    }
    @And("Enters a new User Name into the User Name field")
    public void enters_a_new_user_name_into_the_user_name_field() {
        WaitUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_CLEAR);
        robot.keyRelease(KeyEvent.VK_CLEAR);
        WaitUtils.waitFor(2);

        Random random = new Random();
        int rand = random.nextInt(100);
        String username12 = "Ahmad "+rand;
        teacherUpdatePage.teacherUsernameEdit.sendKeys(username12);
    }
    @And("Enters a new valid password {string} into the password field")
    public void enters_a_new_valid_password_into_the_password_field(String password) {
        WaitUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_CLEAR);
        robot.keyRelease(KeyEvent.VK_CLEAR);
        teacherUpdatePage.teacherPasswordEdit.sendKeys(password);
    }
    @And("Clicks on submit button in teacher edit page")
    public void clicks_on_submit_button_in_teacher_edit_page() {
       teacherUpdatePage.teacherSubmitButtonEdit.click();
    }
    @Then("Verifies teacher updated successfully message is appeared")
    public void verifies_teacher_updated_successfully_message_is_appeared() {
       WaitUtils.waitForVisibility(teacherUpdatePage.teacherUpdatedSuccessfullyMessage,3);
       String successfullUpdateMessage = teacherUpdatePage.teacherUpdatedSuccessfullyMessage.getText();
        System.out.println("-----------------------------------------------------------");
        System.out.println(successfullUpdateMessage);
        System.out.println("-------------------------------------------------------------");
        assertTrue(successfullUpdateMessage.contains("Teacher updated Successful"));
    }
}
