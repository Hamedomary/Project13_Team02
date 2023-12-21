package stepdefinitions.us_11;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.us_11.US11_ViceDeanLocators;
import utilities.ConfigReader;
import utilities.Driver;

public class US11_ViceDeanStepDefinitions {

    US11_ViceDeanLocators viceDeanLocators = new US11_ViceDeanLocators();

    String username = ConfigReader.getProperty("US_11_username");
    String password = ConfigReader.getProperty("US_11_password");


    @Given("go to the webpage")
    public void go_to_the_webpage() {
        Driver.getDriver().get("https://managementonschools.com/");
    }
    @Given("click on login link")
    public void click_on_login_link() {
        viceDeanLocators.loginLink.click();
    }
    @Given("enter user name")
    public void enter_user_name() {
        viceDeanLocators.usernameInput.sendKeys(username);
    }
    @Given("enter password")
    public void enter_password() {
        viceDeanLocators.passwordInput.sendKeys(password);
    }
    @Given("click on login button")
    public void click_on_login_button() {
        viceDeanLocators.loginButton.click();
    }
    @Given("click on menu")
    public void click_on_menu() {
        viceDeanLocators.menuButton.click();
    }
    @Given("click on lesson management")
    public void click_on_lesson_management() {
        viceDeanLocators.lessonManagementLink.click();
    }
    @Given("click on lesson program")
    public void click_on_lesson_program() {
        viceDeanLocators.lessonProgramTab.click();
    }
    @Given("user is on the lesson program page")
    public void user_is_on_the_lesson_program_page() {
        viceDeanLocators.lessonProgramHeader.isDisplayed();
    }
    @Then("Verify the created Lesson Day Start Time and Stop Time are visible")
    public void verify_the_created_lesson_day_start_time_and_stop_time_are_visible() {
        viceDeanLocators.chooseLessonSelection.isDisplayed();
        viceDeanLocators.chooseDaySelection.isDisplayed();
        viceDeanLocators.startTimeSelection.isDisplayed();
        viceDeanLocators.stopTimeSelection.isDisplayed();
    }

    // TC02 steps
    @Given("Verify the Lesson Program List is visible")
    public void verify_the_lesson_program_list_is_visible() {
        viceDeanLocators.lessonProgramList.isDisplayed();
    }
    @Then("click an update button from the list")
    public void click_an_update_button_from_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("an update form must be displayed")
    public void an_update_form_must_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the selected item is updated from the Lesson Program List")
    public void verify_the_selected_item_is_updated_from_the_lesson_program_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //TC3 Steps
    @Then("click an delete button from the list")
    public void click_an_delete_button_from_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the selected item is removed from the Lesson Program List")
    public void verify_the_selected_item_is_removed_from_the_lesson_program_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
