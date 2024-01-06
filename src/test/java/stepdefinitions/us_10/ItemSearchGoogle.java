package stepdefinitions.us_10;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.us_0111.GoogleSearch;
import pages.us_10.HomePage;
import pages.us_10.LessonProgramPage;
import pages.us_10.LoginPage;
import pages.us_10.MenuPage;
import utilities.*;

import java.io.DataInput;

import static org.junit.Assert.assertTrue;

public class ItemSearchGoogle {

    HomePage homePage = new HomePage();
    LessonProgramPage lessonProgramPage = new LessonProgramPage();
    LoginPage loginPage = new LoginPage();
    MenuPage menuPage = new MenuPage();

      ////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("User navigates to the homepage")
    public void user_navigates_to_the_homepage() {
      Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("Clicks on Login link")
    public void clicks_on_login_link() {
        homePage.loginLink.click();
    }
    @When("Enters the username and password into corresponding field")
    public void enters_the_username_and_password_into_corresponding_field() {
        loginPage.userNameBox.sendKeys(ConfigReader.getProperty("US_10_UserName"));
        WaitUtils.waitFor(2);
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("US_10_password"));
    }
    @When("Clicks on Login button")
    public void clicks_on_login_button() {
             loginPage.loginButton.click();
    }
    @When("Clicks on Menu button")
    public void clicks_on_menu_button() {
          WaitUtils.waitFor(2);
          homePage.menuLink.click();
    }
    @When("Clicks on Lesson Management link")
    public void clicks_on_lesson_management_link() {
           WaitUtils.waitFor(2);
           menuPage.lessonManagement.click();
    }
    @When("Clicks on Lesson program button")
    public void clicks_on_lesson_program_button() {
        WaitUtils.waitFor(2);
       lessonProgramPage.lessonProgramButton.click();
    }

    @When("Selects a lesson from Choose Lessons dropDown")
    public void selects_a_lesson_from_choose_lessons_drop_down() {
        WaitUtils.waitFor(3);
        lessonProgramPage.selectLesson.sendKeys("sql",Keys.TAB);
    }
    @When("Selects an education term from education term dropdown")
    public void selects_an_education_term_from_education_term_dropdown() {
        WaitUtils.waitFor(2);
      BrowserUtils.dropdownSelectByIndex(lessonProgramPage.educationTerm,3);

    }
    @When("Selects a day from Choose day dropdown")
    public void selects_a_day_from_choose_day_dropdown() {
        WaitUtils.waitFor(3);
        BrowserUtils.dropdownSelectByIndex(lessonProgramPage.selectDayBox,3);

    }
    @When("Enters a start time in Start Time field")
    public void enters_a_start_time_in_start_time_field() {
     lessonProgramPage.startTimeBox.sendKeys("1110");
    }
    @When("Enters a Stop time in the Stop Time field")
    public void enters_a_stop_time_in_the_stop_time_field() {
        WaitUtils.waitFor(3);
       lessonProgramPage.stopTimeBox.sendKeys("1212");
    }
    @When("Clicks on Submit button")
    public void clicks_on_submit_button() {
        WaitUtils.waitFor(3);
        JSUtils.JSclickWithTimeout(lessonProgramPage.lessonSubmitButton);
    }
    @Then("Verifies the \\(Lesson Created Program) message is appeared")
    public void verifies_the_lesson_created_program_message_is_appeared() {
        WaitUtils.waitForVisibility(lessonProgramPage.createdLessonProgramAlert,3);
        assertTrue(lessonProgramPage.createdLessonProgramAlert.isDisplayed());
        String successfulCreatedProgramMessage = lessonProgramPage.createdLessonProgramAlert.getText();
        System.out.println(successfulCreatedProgramMessage);
    }

    //////////
    @Then("Verifies the \\(Lessons must not empty) alert message is appeared")
    public void verifies_the_lessons_must_not_empty_alert_message_is_appeared() {
      WaitUtils.waitForVisibility(lessonProgramPage.ErrorAlertMessage,5);
      assertTrue(lessonProgramPage.ErrorAlertMessage.isDisplayed());
        String Error = lessonProgramPage.ErrorAlertMessage.getText();
        System.out.println(Error);
    }

    @Then("Verifies the \\(You have entered an invalid value. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY) alert message is appeared")
    public void verifies_the_you_have_entered_an_invalid_value_valid_values_are_monday_tuesday_wednesday_thursday_friday_saturday_sunday_alert_message_is_appeared() {
       WaitUtils.waitForVisibility(lessonProgramPage.dayBoxErrorAlert,3);
       assertTrue(lessonProgramPage.dayBoxErrorAlert.isDisplayed());
        String dayError = lessonProgramPage.dayBoxErrorAlert.getText();
        System.out.println(dayError);
    }
    @And("Enters {string}a Stop time in the Stop Time field")
    public void entersAStopTimeInTheStopTimeField(String stopTime) {
        lessonProgramPage.stopTimeBox.sendKeys(stopTime);
    }

    @And("Enters {string}as start time in Start Time field")
    public void entersAsStartTimeInStartTimeField(String startTime) {
        lessonProgramPage.startTimeBox.sendKeys(startTime);
    }
    @Then("Verifies the \\(Error: start time must not be greater than or equal to stop time) message is appeared")
    public void verifiesTheErrorStartTimeMustNotBeGreaterThanOrEqualToStopTimeMessageIsAppeared() {
        WaitUtils.waitForVisibility(lessonProgramPage.timeErrorAlert,5);
        assertTrue(lessonProgramPage.timeErrorAlert.isDisplayed());
        String timeError = lessonProgramPage.timeErrorAlert.getText();
        System.out.println(timeError);
    }

    @And("close the driver")
    public void closeTheDriver() {
        Driver.closeDriver();
    }


    @Then("Verifies \\(Required) text message is appeared under start time field")
    public void verifiesRequiredTextMessageIsAppearedUnderStartTimeField() {
        assertTrue( lessonProgramPage.startTimeRequiredMessage.getText().contains("Required"));
    }

    @And("Verifies \\(Required) text message is appeared under stop time field")
    public void verifiesRequiredTextMessageIsAppearedUnderStopTimeField() {

        assertTrue(   lessonProgramPage.stopTimeRequiredMessage.getText().contains("Required"));
    }
}
