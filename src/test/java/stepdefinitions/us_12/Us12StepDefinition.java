package stepdefinitions.us_12;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.us_10.HomePage;
import pages.us_10.LoginPage;
import pages.us_12.LessonProgramPageForUs12;
import utilities.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Us12StepDefinition {

    HomePage homePage = new HomePage();
    LessonProgramPageForUs12 lessonProgramPage = new LessonProgramPageForUs12();
    LoginPage loginPage = new LoginPage();

    @Given("User navigates to the homepage for us12")
    public void user_navigates_to_the_homepage_for_us12() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Clicks on Login link for us12")
    public void clicks_on_login_link_for_us12() {
        homePage.loginLink.click();
    }

    @When("Enters the username and password for us12")
    public void enters_the_username_and_password_for_us_12() {
        loginPage.userNameBox.sendKeys(ConfigReader.getProperty("US_12_username"));
        WaitUtils.waitFor(2);
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("US_12_password"));
    }

    @When("Clicks on Login button for us12")
    public void clicks_on_login_button_for_us12() {
        loginPage.loginButton.click();
    }

    @When("Clicks on Lesson program button for us12")
    public void clicks_on_lesson_program_button_for_us12() {
        WaitUtils.waitFor(2);
        lessonProgramPage.lessonProgramButton.click();
    }

    @When("Select {} lesson from the lessons dropDown")
    public void selects_lesson_from_the_lessons_drop_down(String lessonName) {
        WaitUtils.waitFor(3);
        lessonProgramPage.selectLesson.sendKeys(lessonName, Keys.TAB);
    }

    @When("Selects {} from the education term dropdown")
    public void selects_education_term_from_the_education_term_dropdown(String educationTerm) {
        WaitUtils.waitFor(2);
        BrowserUtils.dropdownSelectByValue(lessonProgramPage.educationTerm, educationTerm);

    }

    @When("Selects {} from the day dropdown")
    public void selects_from_the_day_dropdown(String day) {
        WaitUtils.waitFor(3);
        BrowserUtils.dropdownSelectByValue(lessonProgramPage.selectDayBox, day);

    }

    @When("Enters {} time in the start time field")
    public void enters_time_in_the_start_time_field(String startTime) {
        lessonProgramPage.startTimeBox.sendKeys(startTime);
    }

    @When("Enters {} time in the stop time field")
    public void enters_stop_time_in_the_stop_time_field(String stopTime) {
        WaitUtils.waitFor(3);
        lessonProgramPage.stopTimeBox.sendKeys(stopTime);
    }

    @When("Clicks on Submit button for US12")
    public void clicks_on_submit_button_for_US12() {
        WaitUtils.waitFor(3);
        JSUtils.JSclickWithTimeout(lessonProgramPage.lessonSubmitButton);
    }

    @Then("Verify the message is appeared for add lesson program")
    public void verify_the_message_is_appeared_for_add_lesson_program() {
        WaitUtils.waitForVisibility(lessonProgramPage.createdLessonProgramAlert, 3);
        assertTrue(lessonProgramPage.createdLessonProgramAlert.isDisplayed());
    }

    @Then("Verify the message is appeared for teacher added to lesson")
    public void verify_the_message_is_appeared_for_teacher_added_to_lesson() {
        WaitUtils.waitForVisibility(lessonProgramPage.addedTeacherToLesson, 3);
        assertTrue(lessonProgramPage.addedTeacherToLesson.isDisplayed());
    }

    @Then("Verify the error message is appeared for teacher added to lesson")
    public void verify_the_error_message_is_appeared_for_teacher_added_to_lesson() {
        WaitUtils.waitForVisibility(lessonProgramPage.addedErrorTeacherToLesson, 3);
        assertTrue(lessonProgramPage.addedErrorTeacherToLesson.isDisplayed());
    }


    @Then("Verify the record shown in the Lesson Program Assignment {} {} {} {}")
    public void verify_the_record_shown_in_the_lesson_program_assignment(String lessonName, String day, String startTime, String stopTime) {
        assertEquals(lessonName, lessonProgramPage.lastCreatedLessonItems.get(1).findElement(By.tagName("span")).getAttribute("innerHTML"));
        assertEquals(day, lessonProgramPage.lastCreatedLessonItems.get(2).findElement(By.tagName("span")).getAttribute("innerHTML"));
        assertEquals(startTime, lessonProgramPage.lastCreatedLessonItems.get(3).findElement(By.tagName("span")).getAttribute("innerHTML"));
        assertEquals(stopTime, lessonProgramPage.lastCreatedLessonItems.get(4).findElement(By.tagName("span")).getAttribute("innerHTML"));
    }

    @Then("Selects the last record in the lesson table")
    public void selects_the_last_record_in_the_lesson_table() {
        WaitUtils.waitFor(2);
        WebElement clickable = lessonProgramPage.lastCreatedLessonItems.get(0).findElement(By.id("lessonProgramId"));
        try {
            clickable.click();
        } catch (Exception e) {
            clickable.click();
        }
    }
    @Then("Selects {} index from teacher dropdown")
    public void selects_index_from_teacher_dropdown(Integer index) {
        WaitUtils.waitFor(2);
        BrowserUtils.dropdownSelectByIndex(lessonProgramPage.selectTeacher, index);
    }

    @Then("Clicks teacher submit button")
    public void clicks_teacher_submit_button() {
        WaitUtils.waitFor(2);
        lessonProgramPage.teacherSubmitButton.click();
    }


    @And("close the driver for us12")
    public void closeTheDriverForUs12() {
        Driver.closeDriver();
    }


}
