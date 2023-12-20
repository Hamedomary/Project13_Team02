package stepdefinitions.us_24;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.us_09.LessonPage;
import pages.us_09.LoginPage;
import pages.us_09.TeacherPage;
import utilities.WaitUtils;

public class Us_24StepDefs {

//    @Given("Login to the application")
//    public void login_to_the_application() {
//
//    }

    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    Faker faker = new Faker();
    TeacherPage teacherPage = new TeacherPage();

    String name;
    String surname;

    @And("click Menu")
    public void clickMenu() {
        loginPage.menu.click();
    }


    @And("click Teacher Management")
    public void clickTeacherManagement() {
        teacherPage.teacherManagement.click();
       // WaitUtils.waitForVisibility(teacherPage.chooseLessons,5);
        WaitUtils.waitFor(10);
    }

    @And("choose lessons")
    public void chooseLessons() {
        teacherPage.chooseLessons.sendKeys("Literature"+ Keys.ENTER);
    }

    @When("enter name, cannot be left blank")
    public void enterNameCannotBeLeftBlank() {
        name=faker.name().firstName();
        teacherPage.name.sendKeys(name);
    }

    @And("enter surname,cannot be left blank")
    public void enterSurnameCannotBeLeftBlank() {
        surname=faker.name().lastName();
        teacherPage.surname.sendKeys(surname);
    }

    @And("enter birth place,cannot be left blank")
    public void enterBirthPlaceCannotBeLeftBlank() {
        String country = faker.country().name();
        teacherPage.birthPlace.sendKeys(country);
        System.out.println("country = " + country);
    }

    @And("enter email, cannot be left blank")
    public void enterEmailCannotBeLeftBlank() {
        teacherPage.email.sendKeys(faker.internet().emailAddress());
    }

    @And("enter phone,cannot be left blank")
    public void enterPhoneCannotBeLeftBlank() {
        teacherPage.phoneNumber.sendKeys(faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4));

    }

    @And("Select gender ,cannot be left blank")
    public void selectGenderCannotBeLeftBlank() {
        teacherPage.genderFemale.click();

    }

    @And("enter date of birth, cannot be left blank")
    public void enterDateOfBirthCannotBeLeftBlank() {
        teacherPage.birthDay.sendKeys(String.valueOf(faker.date().birthday(3,60).getYear()) + Keys.TAB + faker.date().birthday().getMonth()
                                                            + faker.date().birthday().getDay());

    }

    @And("enter a valid SSN")
    public void enterAValidSSN() {
        teacherPage.ssn.sendKeys(faker.idNumber().ssnValid());

    }


    @And("enter user name , cannot be left blank")
    public void enterUserNameCannotBeLeftBlank() {
        teacherPage.userName.sendKeys(faker.name().username());
    }

    @And("enter a valid password")
    public void enterPassword() {
        String password = faker.internet().password()+"A1";
        teacherPage.password.sendKeys(password);
        System.out.println("password = " + password);

    }

    @And("click submit button")
    public void clickSubmitButton() {
        teacherPage.submit.click();
        WaitUtils.waitForVisibility(lessonPage.successMessage,5);
    }

    @Then("verify teacher is created")
    public void verifyTeacherIsCreated() {
       Assert.assertTrue(lessonPage.successMessage.isDisplayed());
    }


    @Then("verify error message is displayed")
    public void verifyErrorMessageIsDisplayed() {
        Assert.assertTrue(teacherPage.required.isDisplayed());

    }
}