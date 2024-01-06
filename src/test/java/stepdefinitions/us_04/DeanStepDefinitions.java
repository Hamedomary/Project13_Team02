package stepdefinitions.us_04;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pages.us_04.DeanLocators;
import utilities.ConfigReader;
import utilities.Driver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DeanStepDefinitions {

    public static final DeanLocators deanLocotar = new DeanLocators();
    Faker faker = new Faker();
    String username;

    @Given("the user goes to managementonschools page")
    public void theUserGoesToManagementonschoolsPage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("the user click on login")
    public void theUserClickOnLogin() {
        deanLocotar.mainLogin.click();
    }

    @And("the user enter user name and password for {string}")
    public void theUserEnterUserNameAndPassword(String userType) {
        if (userType.equals("admin")) {
            deanLocotar.mainLoginUsername.sendKeys(ConfigReader.getProperty("admin_username"));
            deanLocotar.mainLoginPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        } else if (userType.equals("student")) {
            deanLocotar.mainLoginUsername.sendKeys(ConfigReader.getProperty("student_username"));
            deanLocotar.mainLoginPassword.sendKeys(ConfigReader.getProperty("student_password"));
        }
        deanLocotar.userLogin.click();
    }

    @Given("the admin user goes to menu")
    public void theAdminUserGoesToMenu() {
        deanLocotar.mainMenu.click();
    }

    @And("the admin user clicks to {string}")
    public void theAdminUserClicksTo(String arg0) {
        deanLocotar.mainMenuDeanManagement.click();
    }

    @When("the admin user enters new {string} dean credentials")
    public void theAdminUserEntersNewDeanCredentials(String negation) {
        deanLocotar.deanManagementAddName.sendKeys(faker.name().firstName());
        deanLocotar.deanManagementAddSurname.sendKeys(faker.name().lastName());
        Date birthday = faker.date().birthday();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedBirthday = dateFormat.format(birthday);
        if (negation.equals("valid")) {
            deanLocotar.deanManagementAddBirthPlace.sendKeys(faker.address().city());
        } else {
            deanLocotar.deanManagementAddBirthPlace.sendKeys(formattedBirthday);
        }
        deanLocotar.deanManagementAddPhone.sendKeys(faker.numerify("###").concat("-").concat(faker.numerify("###")).concat("-")
                .concat(faker.numerify("####")));
        deanLocotar.deanManagementAddSsn.sendKeys(faker.numerify("###").concat("-").concat(faker.numerify("##")).concat("-")
                .concat(faker.numerify("####")));
        deanLocotar.deanManagementAddBirthDay.sendKeys(formattedBirthday);
        deanLocotar.genderFemale.click();
         username = faker.name().username();
        deanLocotar.deanManagementAddUsername.sendKeys(username);
        deanLocotar.deanManagementAddPassword.sendKeys((faker.name().firstName()).toLowerCase(Locale.ROOT).concat(faker.number().digit()).concat(faker.name().lastName().toUpperCase(Locale.ROOT)));
    }

    @And("the admin user clicks submit button")
    public void theAdminUserClicksSubmitButton() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deanLocotar.addDeanSubmitButton.click();
    }

    @Then("the new dean created successfully")
    public void theNewDeanCreatedSuccessfully() {
        Assert.assertTrue(deanLocotar.deanSavedPopUp.isDisplayed());
    }

    @Then("the new dean should not be created successfully")
    public void theNewDeanShouldNotBeCreatedSuccessfully() {
        Assert.assertFalse(deanLocotar.deanSavedPopUp.isDisplayed());
    }
}
