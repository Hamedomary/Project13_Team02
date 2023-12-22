package stepdefinitions.us_03;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.us_03.US_03_Page;
import utilities.Driver;

public class US03_StepDefs {

    US_03_Page us_03_Page = new US_03_Page();

    //TC_01
    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        Driver.getDriver().get(string);
    }
    @Given("user click on Contact button on managementschools")
    public void user_click_on_contact_button_on_managementschools() {
        us_03_Page.contactButton.click();
    }
    @Given("user enters the name in the name field\\(cannot be left blank) {string}")
    public void user_enters_the_name_in_the_name_field_cannot_be_left_blank(String string) {
        us_03_Page.nameField.sendKeys(string + Keys.ENTER);
    }
    @Given("user click on {string} button")
    public void user_click_on_button(String string) {
        us_03_Page.sendMessageButton.click();
    }
    @Then("user verifies there is no *Required text message on the bottom of the field")
    public void user_verifies_there_is_no_required_text_message_on_the_bottom_of_the_field() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Elif"));
    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    //TC_02

    @Given("user leaves blank the name field")
    public void user_leaves_blank_the_name_field() {
        us_03_Page.nameField.isDisplayed();
    }

    @Given("user click on {string} button for tc2")
    public void user_click_on_button_for_tc2(String string) {
        us_03_Page.sendMessageButton.click();
    }

    @Then("user verifies there is *Required text message on the bottom of the name field")
    public void user_verifies_there_is_required_text_message_on_the_bottom_of_the_name_field() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    }


    //TC_03

    @Given("user provides email address respecting the {string} and {string} where necessary {string}")
    public void user_provides_email_address_respecting_the_and_where_necessary(String string, String string2, String string3) {
        us_03_Page.emailField.sendKeys(string3+ Keys.ENTER);
    }
    @Given("user click on {string} button for tc3")
    public void user_click_on_button_for_tc3(String string) {
        us_03_Page.sendMessageButton.click();
    }
    @Then("user verifies there is no *Required text message on the bottom of the field")
    public void user_verifies_there_is_no_required_text_message_on_the_bottom_of_the_email_field() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("elifranamert@gmail.com"));
    }


    //TC_04
    @Given("user enters name containing any item {string} for wrong credentials")
    public void user_enters_name_containing_any_item_for_wrong_credentials(String string) {
        us_03_Page.nameField.sendKeys(string+Keys.ENTER);
    }
    @Given("user provides email address NOT respecting the {string} and {string} where necessary {string} for tc4")
    public void user_provides_email_address_not_respecting_the_and_where_necessary_for_tc4(String string, String string2, String string3) {
        us_03_Page.emailField.sendKeys(string3+ Keys.ENTER);
    }
    @Given("user enters subject about the text message {string} for tc4")
    public void user_enters_subject_about_the_text_message_for_tc4(String string) {
        us_03_Page.subjectField.sendKeys(string+Keys.ENTER);
    }
    @Given("user enters the text message {string} for tc4")
    public void user_enters_the_text_message_for_tc4(String string) {
        us_03_Page.messageTextField.sendKeys(string+Keys.ENTER);
    }
    @Given("user click on {string} button for tc4")
    public void user_click_on_button_for_tc4(String string) {
        us_03_Page.sendMessageButton.click();
    }
    @Then("user verifies there is {string} sign on the top of the page for tc4")
    public void user_verifies_there_is_sign_on_the_top_of_the_page_for_tc4(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Please enter valid email"));
    }


    //TC_05
    @Given("user enters name containing any item {string} for tc5")
    public void user_enters_name_containing_any_item_for_tc5(String string) {
        us_03_Page.nameField.sendKeys(string+Keys.ENTER);
    }
    @Given("user provides email address NOT respecting the {string} and {string} where necessary {string} for tc5")
    public void user_provides_email_address_not_respecting_the_and_where_necessary_for_tc5(String string, String string2, String string3) {
        us_03_Page.emailField.sendKeys(string3+ Keys.ENTER);
    }
    @Given("user enters subject about the text message {string} for tc5")
    public void user_enters_subject_about_the_text_message_for_tc5(String string) {
        us_03_Page.subjectField.sendKeys(string+Keys.ENTER);
    }
    @Given("user enters the text message {string} for tc5")
    public void user_enters_the_text_message_for_tc5(String string) {
        us_03_Page.messageTextField.sendKeys(string+Keys.ENTER);
    }
    @Given("user click on {string} button for tc5")
    public void user_click_on_button_for_tc5(String string) {
        us_03_Page.sendMessageButton.click();
    }
    @Then("user verifies there is {string} sign on the top of the page for tc5")
    public void user_verifies_there_is_sign_on_the_top_of_the_page_for_tc5(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    //TC_06
    @Given("user enters subject about the text message {string} for tc6")
    public void user_enters_subject_about_the_text_message_for_tc6(String string) {
        us_03_Page.subjectField.sendKeys(string+Keys.ENTER);
    }
    @Given("user click on {string} button for tc6")
    public void user_click_on_button_for_tc6(String string) {
        us_03_Page.sendMessageButton.click();
    }
    @Then("user verifies there is no *Required text message on the bottom of the field for tc6")
    public void user_verifies_there_is_no_required_text_message_on_the_bottom_of_the_field_for_tc6() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Selenium"));
    }


    //TC_07
    @Given("user enters the text message {string}  for tc7")
    public void user_enters_the_text_message_for_tc7(String string) {
        us_03_Page.messageTextField.sendKeys(string+Keys.ENTER);
    }
    @Given("user click on {string} button for tc7")
    public void user_click_on_button_for_tc7(String string) {
        us_03_Page.sendMessageButton.click();
    }
    @Then("user verifies there is no *Required text message on the bottom of the field for tc7")
    public void user_verifies_there_is_no_required_text_message_on_the_bottom_of_the_field_for_tc7() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Hello Sir! Can you help me about Selenium?"));
    }


    //TC_08

    @Given("user leaves blank the text message field  for tc8")
    public void user_leaves_blank_the_text_message_field_for_tc8() {
        us_03_Page.messageTextField.isDisplayed();
    }
    @Given("user click on {string} button for tc8")
    public void user_click_on_button_for_tc8(String string) {
        us_03_Page.sendMessageButton.click();
    }
    @Then("user verifies there is *Required text message on the bottom of the field for tc8")
    public void user_verifies_there_is_required_text_message_on_the_bottom_of_the_field_for_tc8() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    }



    //TC_09
    @Given("user enters name containing any item {string} for tc9")
    public void user_enters_name_containing_any_item_for_tc9(String string) {
        us_03_Page.nameField.sendKeys(string+Keys.ENTER);
    }
    @Given("user provides email address respecting the {string} and {string} where necessary {string} for tc9")
    public void user_provides_email_address_respecting_the_and_where_necessary_for_tc9(String string, String string2, String string3) {
        us_03_Page.emailField.sendKeys(string3+Keys.ENTER);
    }
    @Given("user enters subject about the text message {string} for tc9")
    public void user_enters_subject_about_the_text_message_for_tc9(String string) {
        us_03_Page.subjectField.sendKeys(string+Keys.ENTER);
    }
    @Given("user enters the text message {string} for tc9")
    public void user_enters_the_text_message_for_tc9(String string) {
        us_03_Page.messageTextField.sendKeys(string+Keys.ENTER);
    }
    @Given("user click on {string} button for tc9")
    public void user_click_on_button_for_tc9(String string) {
        us_03_Page.sendMessageButton.click();
    }
    @Then("user verifies {string} sign is visible in the top of the page for tc9")
    public void user_verifies_sign_is_visible_in_the_top_of_the_page_for_tc9(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


}
