package stepdefinitions.us_07;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.us_07.US07Page;
import utilities.Driver;

public class US07StepDef {
  ;

        US07Page us07_Page = new US07Page();

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        Driver.getDriver().get("https://managementonschools.com/");
    }

    @And("user click on login button on managementonschools")
    public void userClickOnLoginButtonOnManagementonschools() {
        us07_Page.loginButton.click();
    }
    @And("user enters username {string}")
    public void user_enters_username(String string) {
        us07_Page.userName.sendKeys("DeanGul");
    }

    @And("user enters password {string}")
    public void user_enters_password(String string) {

        us07_Page.password.sendKeys("DeanGul123");
    }
    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        us07_Page.getLoginButton.click();
    }


        @And("user click on menu button")
        public void user_click_on_menu_button() {

        us07_Page.menuButton.click();
    }

    @And("user click on contact get all")
        public void user_click_on_contact_get_all() {

            us07_Page.contactGetAll.click();
        }

        @And("user navigate contact messages")
        public void navigate_contact_messages() {

            us07_Page.contactMessages.isDisplayed();
        }

        @Then("user verifies page contains \"delete button'")
        public void user_verifies_page_contains_delete_button() {
            Assert.assertTrue(Driver.getDriver().getTitle().contains("delete button"));
        }


        //TC02

        @Given("user navigate the page")
        public void user_navigate_the_page() {
           us07_Page.contactMessages.getText().contains("Contact Message");

    }

        @Then("user verifies page title contains {string}, {string},{string},and {string}")
        public void user_verifies_page_title_contains_and(String string, String string2, String string3, String string4) {
            Assert.assertTrue(Driver.getDriver().getTitle().contains("\"Name\",\"Email\",\"Date\",\"Subject\""));
        }
//TC03

        @Given("user explore the page")
        public void user_explore_the_page() {
            us07_Page.contactMessages.getText().contains("Contact Messages");

        }

        @Then("user verifies delete button is enable and clickable")
        public void user_verifies_delete_button_is_enable_and_clickable() {

        }


    @Then("close the application")
    public void close_the_application() {

    }



}



