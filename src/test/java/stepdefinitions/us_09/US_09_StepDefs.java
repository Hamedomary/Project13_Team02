package stepdefinitions.us_09;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.us_09.LessonPage;
import pages.us_09.LoginPage;
import utilities.*;

public class US_09_StepDefs {


    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();

    @Given("Login to the application as {string}")
    public void login_to_the_application(String role) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        try {
            loginPage.acceptCookiesSwedish.click();
        }catch (Exception e){}

        loginPage.firstLogin.click();

        switch (role){
            case "viceDean":
                loginPage.userName.sendKeys(ConfigReader.getProperty("US_09_viceDean_username"));
                loginPage.password.sendKeys(ConfigReader.getProperty("US_09_viceDean_password"));
            break;
            case "admin":
                loginPage.userName.sendKeys(ConfigReader.getProperty("US_24_admin_username"));
                loginPage.password.sendKeys(ConfigReader.getProperty("US_24_admin_password"));
                break;
            default:
                throw new RuntimeException("Not a valid role");
        }

        loginPage.secondLogin.click();
        WaitUtils.waitForVisibility(loginPage.menu,5);
    }

    @When("click Lessons")
    public void clickLessons() {
        lessonPage.lessons.click();
    }

    @Then("verify created Lesson Name, Compulsory and Credit Score visible")
    public void verifyCreatedLessonNameCompulsoryAndCreditScoreVisible() {
        Assert.assertTrue(lessonPage.lessonList.isDisplayed());
    }

    @When("click delete button")
    public void clickDeleteButton() {
        JSUtils.JSclickWithTimeout(lessonPage.deleteButton);
    }

    @Then("verify lesson has been deleted")
    public void verifyLessonHasBeenDeleted() {
        Assert.assertTrue(lessonPage.successMessage.isDisplayed());
    }

    @Then("should be able to update the lesson information")
    public void shouldBeAbleToUpdateTheLessonInformation() {
        lessonPage.updateButton.click();
    }


}

