package stepdefinitions.us_24;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.us_09.LessonPage;
import pages.us_09.LoginPage;
import pages.us_09.TeacherManagementPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Us_24StepDefs {

//    @Given("Login to the application")
//    public void login_to_the_application() {
//
//    }

    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    Faker faker = new Faker();
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();

    String name;
    String surname;

    @And("click Menu")
    public void clickMenu() {
        loginPage.menu.click();
    }


    @And("click Teacher Management")
    public void clickTeacherManagement() {
        teacherManagementPage.teacherManagement.click();
    }

    @And("choose lessons")
    public void chooseLessons() {
        teacherManagementPage.chooseLessons.sendKeys("Literature"+ Keys.ENTER);
    }

    @When("enter name, cannot be left blank")
    public void enterNameCannotBeLeftBlank() {
        name=faker.name().firstName();
        teacherManagementPage.name.sendKeys(name);
    }

    @And("enter surname,cannot be left blank")
    public void enterSurnameCannotBeLeftBlank() {
        surname=faker.name().lastName();
        teacherManagementPage.surname.sendKeys(surname);
    }

    @And("enter birth place,cannot be left blank")
    public void enterBirthPlaceCannotBeLeftBlank() {
        teacherManagementPage.birthDay.sendKeys(faker.country().name());
    }

    @And("enter email, cannot be left blank")
    public void enterEmailCannotBeLeftBlank() {
        teacherManagementPage.email.sendKeys(faker.internet().emailAddress());
    }

    @And("enter phone,cannot be left blank")
    public void enterPhoneCannotBeLeftBlank() {
        teacherManagementPage.phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());

    }

    @And("Select gender ,cannot be left blank")
    public void selectGenderCannotBeLeftBlank() {
        teacherManagementPage.genderFemale.click();

    }

    @And("enter date of birth, cannot be left blank")
    public void enterDateOfBirthCannotBeLeftBlank() {
        teacherManagementPage.birthDay.sendKeys(String.valueOf(faker.date().birthday().getYear()) + Keys.TAB + faker.date().birthday().getMonth()
                                                            + faker.date().birthday().getDay());

    }

    @And("enter a valid SSN")
    public void enterAValidSSN() {
        teacherManagementPage.ssn.sendKeys(faker.idNumber().ssnValid());

    }


    @And("enter user name , cannot be left blank")
    public void enterUserNameCannotBeLeftBlank() {
        teacherManagementPage.userName.sendKeys(faker.name().username());
    }

    @And("enter a valid password")
    public void enterPassword() {
        teacherManagementPage.password.sendKeys(faker.internet().password());
    }

    @And("click submit button")
    public void clickSubmitButton() {
        teacherManagementPage.submit.click();
    }

    @Then("verify teacher is created")
    public void verifyTeacherIsCreated() {
       Assert.assertTrue(lessonPage.successMessage.isDisplayed());
    }


    @Then("verify error message is displayed")
    public void verifyErrorMessageIsDisplayed() {
        Assert.assertTrue(teacherManagementPage.required.isDisplayed());

    }
}