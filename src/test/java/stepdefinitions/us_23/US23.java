package stepdefinitions.us_23;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.us_06.US06_ViceDeanCreation;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

public class US23 {
    pages.us_23.US23 us23 = new pages.us_23.US23();
    Faker faker= new Faker();
    US06_ViceDeanCreation us06ViceDeanCreation=new US06_ViceDeanCreation();
    @Given("user enter  {string}")
    public void user_enter(String string) {
        Driver.getDriver().get(string);
    }
    @Given("user click  Login button")
    public void user_click_login_button() {
        WaitUtils.waitFor(1);
        us06ViceDeanCreation.homePageLoginButton.click();
    }
    @Then("user types as Admin username")
    public void user_types_as_admin_username() {
        WaitUtils.waitFor(1);
        us23.userNamee.sendKeys("AdminProject13");

    }
    @Then("user types as Admin password")
    public void user_types_as_admin_password() {
        us23.passwordd.sendKeys("Project13+");
    }
    @Then("user clicks loginnn")
    public void user_clicks_loginnn() {
        us23.loginButton.click();
    }

    @Then("user clicks Menu")
    public void user_clicks_menu() {
        WaitUtils.waitFor(2);
        us23.menuButton.click();
    }
    @Then("user clicks Vice Dean Management")
    public void user_clicks_vice_dean_management() {
        WaitUtils.waitFor(1);
        us23.viceDeanSelect.click();
    }
    @Then("user clicks loginnn button")
    public void user_clicks_loginnn_button() {
        us06ViceDeanCreation.loginButton.click();
    }
    @Then("enter valid prospective vicedean name")
    public void enter_valid_prospective_vicedean_name() {
        WaitUtils.waitFor(2);
        us06ViceDeanCreation.name.sendKeys(faker.name().firstName());
    }
    @Then("enter valid prospective vicedean surname")
    public void enter_valid_prospective_vicedean_surname() {
        us06ViceDeanCreation.surname.sendKeys(faker.name().lastName());
    }
    @Then("enter valid prospective vicedean birth place")
    public void enter_valid_prospective_vicedean_birth_place() {
        us06ViceDeanCreation.birthPlace.sendKeys(faker.country().capital());
    }
    @Then("enter valid prospective vicedean phone number")
    public void enter_valid_prospective_vicedean_phone_number() {
        us06ViceDeanCreation.phoneNumber.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));
        //222-222-2222
    }
    @Then("click on gender radio button")
    public void click_on_gender_radio_button() {
        us06ViceDeanCreation.femaleButton.click();
    }
    @Then("enter valid prospective vicedean date of birth")
    public void enter_valid_prospective_vicedean_date_of_birth() {
        us06ViceDeanCreation.birthDay.sendKeys("01-01-1995");
    }
    @Then("enter valid prospective vicedean ssn")
    public void enter_valid_prospective_vicedean_ssn() {
        //222-22-2222
        us06ViceDeanCreation.ssn.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
    }
    @Then("enter valid prospective vicedean username")
    public void enter_valid_prospective_vicedean_username() {
        us06ViceDeanCreation.userName.sendKeys(faker.name().fullName().subSequence(0,9));
    }
    @Then("enter valid prospective vicedean password")
    public void enter_valid_prospective_vicedean_password() {
        us06ViceDeanCreation.password.sendKeys("Kakoko23");
    }
    @Then("click register button")
    public void click_register_button() {
        WaitUtils.waitFor(2);
        us06ViceDeanCreation.submitButton.click();
    }
    @Then("assert the new vicedean is registered")
    public void assert_the_new_vicedean_is_registered() {
        WaitUtils.waitFor(1);
        Assert.assertTrue(us06ViceDeanCreation.successMessage.getText().contains("Saved"));
    }
    @When("assert the new vicedean is not registered")
    public void assert_the_new_vicedean_is_not_registered() {
        WaitUtils.waitFor(2);
        BrowserUtils.verifyElementNotDisplayed(us06ViceDeanCreation.successMessage);
    }
    @Then("enter invalid prospective without - vicedean ssn")
    public void enter_invalid_prospective_without_vicedean_ssn() {
        us06ViceDeanCreation.ssn.sendKeys(faker.number().numberBetween(100,999)+""+faker.number().numberBetween(10,99)+""+faker.number().numberBetween(1000,9999));
    }
    @Then("enter invalid prospective without number vicedean password")
    public void enter_invalid_prospective_without_number_vicedean_password() {
        us06ViceDeanCreation.password.sendKeys("Kmkmkmkm");
    }
    @Then("enter invalid prospective without uppercase vicedean password")
    public void enter_invalid_prospective_without_uppercase_vicedean_password() {
        us06ViceDeanCreation.password.sendKeys("kmkmkm11");
    }
    @Then("enter invalid prospective without lowercase vicedean password")
    public void enter_invalid_prospective_without_lowercase_vicedean_password() {
        us06ViceDeanCreation.password.sendKeys("KMKMKMK1");
    }
    @Then("enter invalid prospective less than eight digit vicedean password")
    public void enter_invalid_prospective_less_than_eight_digit_vicedean_password() {
        us06ViceDeanCreation.password.sendKeys("Kmkmkm1");
    }
    @Then("close driver")
    public void close_driver() {
        WaitUtils.waitFor(1);
        Driver.closeDriver();
    }


}

