package stepdefinitions.us_10;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.us_0111.GoogleSearch;
import utilities.ConfigReader;
import utilities.Driver;

public class ItemSearchGoogle {
    GoogleSearch googleHomePage = new GoogleSearch();
    @Given("User is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        try{
            googleHomePage.cookiePopUp.click();
        }catch (Exception e){

        }
    }
    @When("User Search for iphone")
    public void user_search_for_iphone() {
        googleHomePage.googleSearchBox.sendKeys("iphone"+ Keys.ENTER);
    }
    @Then("Verify the result contains iphone")
    public void verify_the_result_contains_iphone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }


}
