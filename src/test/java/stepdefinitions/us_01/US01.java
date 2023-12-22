package stepdefinitions.us_01;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US01_Pages;
import utilities.*;

public class US01 {
    static Faker faker = new Faker();
    US01_Pages us01Pages = new US01_Pages();
    @Given("user enter  {string}")
    public void user_enter(String url) {
        Driver.getDriver().get(url);
    }
    @Given("user click  Register button")
    public void user_click_register_button() {
        WaitUtils.waitFor(3);
        JSUtils.JSclickWithTimeout(us01Pages.homePageRegisterButton);
    }
    @Then("enter valid prospective student name")
    public void enter_valid_prospective_student_name() {
        WaitUtils.waitFor(2);
        us01Pages.name.sendKeys(faker.name().firstName());
    }
    @Then("enter valid prospective student surname")
    public void enter_valid_prospective_student_surname() {
        us01Pages.surname.sendKeys(faker.name().lastName());
    }
    @Then("enter valid prospective student birth place")
    public void enter_valid_prospective_student_birth_place() {
        us01Pages.birthPlace.sendKeys(faker.country().capital());
    }
    @Then("enter valid prospective student phone number")
    public void enter_valid_prospective_student_phone_number() {
        us01Pages.phoneNumber.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));
    }
    @Then("click on gender radio button")
    public void click_on_gender_radio_button() {
        JSUtils.JSclickWithTimeout(us01Pages.femaleButton);
    }
    @Then("enter valid prospective student date of birth")
    public void enter_valid_prospective_student_date_of_birth() {
        us01Pages.birthDay.sendKeys("1980-01-01");
    }
    @Then("enter valid prospective student ssn")
    public void enter_valid_prospective_student_ssn() {
        us01Pages.ssn.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
    }
    @Then("enter valid prospective student username")
    public void enter_valid_prospective_student_username() {
        us01Pages.userName.sendKeys((faker.name().username()+"team01").substring(0,10));
    }
    @Then("enter valid prospective student password")
    public void enter_valid_prospective_student_password() {
        us01Pages.password.sendKeys("Kmkmkm11");
    }
    @Then("click register button")
    public void click_register_button() {
        JSUtils.JSclickWithTimeout(us01Pages.registerButton);
    }
    @Then("assert the new user is registered")
    public void assert_the_new_user_is_registered() {
        WaitUtils.waitFor(1);
        Assert.assertTrue(us01Pages.successMessage.getText().contains("registered"));
    }

    @Then("assert the new user is not registered") //Tc02 and Tc03
    public void assert_the_new_user_is_not_registered() {
        BrowserUtils.verifyElementNotDisplayed(us01Pages.successMessage);

    }
    @Then("enter invalid prospective without - student ssn")
    public void enter_invalid_prospective_without_student_ssn() {
        us01Pages.ssn.sendKeys(faker.number().numberBetween(100,999)+""+faker.number().numberBetween(10,99)+""+faker.number().numberBetween(1000,9999));
    }
    @Then("enter invalid prospective without number student password")
    public void enter_invalid_prospective_without_number_student_password() {
        us01Pages.password.sendKeys("Kmkmkmkm");
    }
    @Then("enter invalid prospective without uppercase student password")
    public void enter_invalid_prospective_without_uppercase_student_password() {
        us01Pages.password.sendKeys("kmkmkmkm1");

    }
    @Then("enter invalid prospective without lowercase student password")
    public void enter_invalid_prospective_without_lowercase_student_password() {
        us01Pages.password.sendKeys("KMKMKMKM1");

    }
    @Then("enter invalid prospective less than eight digit student password")
    public void enter_invalid_prospective_less_than_eight_digit_student_password() {
        us01Pages.password.sendKeys("Kmkmkm1");
    }



}
