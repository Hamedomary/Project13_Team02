package stepdefinitions.us_15;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.us_15.US15Page;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.WaitUtils.waitFor;

public class US15StepDef {

    US15Page us15_Page = new US15Page();

    //TC01

    @Given("user nagivates the school page {string}")
    public void user_navigates_to(String string) {

        Driver.getDriver().get("url");
    }
    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        us15_Page.loginButton.click();
        waitFor(2);
    }

    @And("user enters vice username {string}")
    public void userEntersViceUsername(String string) {
        Driver.getDriver().getTitle().contains("ViceDeanGul");
        us15_Page.userNameVice.sendKeys("ViceDeanGul", Keys.ENTER);
        waitFor(2);
    }

    @And("user enters vice password {string}")
    public void userEntersVicePassword(String string) {

        Driver.getDriver().getTitle().contains("Vicedeangul1");
        us15_Page.passwordVice.sendKeys("Vicedeangul1",Keys.ENTER);
        waitFor(2);
    }

    @And("user click on student management button")
    public void user_click_on_student_management_button() {
        us15_Page.studentManagementButton.click();
        waitFor(2);
    }

    @And("user select advisor teacher button")
    public void userSelectAdvisorTeacherButton() {
        us15_Page.advisorTeacherButton.isSelected();
        waitFor(2);
    }

    @Then("user verifies to select advisor teacher {string}")
    public void user_verifies_to_select_advisor_teacher(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Angila Davis"));
        waitFor(2);

   }

    //TC02

    @Given("user enters student name {string}")
    public void user_enters_student_name(String string) {

        us15_Page.studentName.sendKeys(ConfigReader.getProperty("Sun"));
    }

    @Then("user verifies to name can be entered")
    public void user_verifies_to_name_can_be_entered() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Sun"));
    }

    @Then("user verifies that a warning as {string} when you left blank student name box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankStudentNameBox(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    }


    //TC03

    @Given("user enters student surname {string}")
    public void user_enters_student_surname(String string) {

        us15_Page.studentSurname.sendKeys("Shine", Keys.ENTER);
        waitFor(2);
    }

    @Then("user verifies to surname can be entered")
    public void user_verifies_to_surname_can_be_entered() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Shine"));
    }


    @Then("user verifies that a warning as {string} when you left blank student surname box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankStudentSurnameBox(String string) {
    Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    waitFor(2);

}

    //TC04

    @Given("user enters birth place {string}")
    public void user_enters_birth_place(String string) {

        us15_Page.studentBirthPlace.sendKeys("NewYork");
        waitFor(2);
    }

    @Then("user verifies birth place")
    public void user_verifies_birth_place() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("NewYork"));

    }

    @Then("user verifies that a warning as {string} when you left blank birthplace box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankBirthplaceBox(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
        waitFor(2);

    }

    //TC05
    @Given("user enters email {string}")
    public void user_enters_email(String string) {

        us15_Page.studentEmail.sendKeys("ozoktemgul@gmail.com");
        waitFor(2);
    }

    @Then("user verifies to email can be entered")
    public void userVerifiesToEmailCanBeEntered() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ozoktemgul@gmail.com"));
    }

    @Then("user verifies that a warning as {string} when you left blank email address box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankEmailAddressBox(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    }


    //TC06
    @Given("user enters phone number {string}")
    public void user_enters_phone_number(String string) {

        us15_Page.studentPhoneNumber.sendKeys("765-345-9876");
        waitFor(2);
    }

    //@Then("user verifies to phone number can be entered")
   // public void user_verifies_to_phone_number_can_be_entered() {
    //    Assert.assertTrue(Driver.getDriver().getTitle().contains("765-345-9876"));
   // }


    @Then("user verifies that a warning as {string} when you left blank phone number box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankPhoneNumberBox(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    }

    //TC07
    @Given("user selects gender {string}")
    public void user_selects_gender(String string) {

        us15_Page.studentGender.sendKeys("Female");
        waitFor(2);
    }

    @And("user verifies to gender is selected")
    public void user_verifies_to_gender_is_selected() {
        us15_Page.studentGender.isSelected();
    }

    @Then("user verifies that a warning as {string} when you left blank gender box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankGenderBox(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Full authentication is required to access this resource"));
    }


    //TC08
    @Given("user enters birth date \"{int} Apr {int}'")
    public void user_enters_birth_date_apr(Integer int1, Integer int2) {
        us15_Page.studentBirthDay.sendKeys("12 Apr 2010");
        waitFor(2);
    }

    @Then("user verifies to birth date is selected")
    public void user_verifies_to_birth_date_is_selected() {
        us15_Page.studentBirthDay.isSelected();
    }
    @Then("user verifies that a warning as {string} when you left blank birthdate box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankBirthdateBox(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    }

    //TC09
    @Given("user enters SSN number {string}")
    public void user_enters_ssn_number(String string) {

        us15_Page.studentSSN.sendKeys("876-12-4567");
        waitFor(2);
    }

    @Then("user verifies to SSN number is entered")
    public void user_verifies_to_ssn_number_is_entered() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("876-12-4567"));
    }

    @Then("user verifies that a warning as {string} when you left blank SSN box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankSSNBox(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    }

    //TC10
    @Given("user enters username {string}")
    public void user_enters_username_number(String string) {
        us15_Page.studentUsername.sendKeys("Sunshine");
        waitFor(2);
    }

    @Then("user verifies to username is entered")
    public void user_verifies_to_username_is_entered() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Sunshine"));
    }

    @Then("user verifies that a warning as {string} when you left blank username box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankUsernameBox(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    }

    //TC11
    @Given("user enters father name {string}")
    public void user_enters_father_name(String string) {

        us15_Page.studentFatherName.sendKeys("Jack");
        waitFor(2);
    }

    @Then("user verifies to father name is entered")
    public void user_verifies_to_father_name_is_entered() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Jack"));
    }

    @Then("user verifies that a warning as {string} when you left blank father name box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankFatherNameBox(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
    }

    //TC12
    @Given("user enters mother name {string}")
    public void user_enters_mother_name(String string) {

        us15_Page.studentMotherName.sendKeys("Elsie");
        waitFor(2);
    }

    @Then("user verifies to mother name is entered")
    public void user_verifies_to_mother_name_is_entered() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Elsie"));
    }

    @Then("user verifies that a warning as {string} when you left blank mother name box")
    public void userVerifiesThatAWarningAsWhenYouLeftBlankMotherNameBox(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Required"));
        waitFor(2);
    }
    //TC13

    @Given("user enters student password")
    public void user_enters_student_password(String string) {

        us15_Page.studentPassword.sendKeys("Abcd1234");
        waitFor(2);
    }

    @Then("user verifies to password is consist of at least {int} characters")
    public void userVerifiesToPasswordIsConsistOfAtLeastCharacters(int arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Abcd1234"));
    }

    public void setUs15_Page(US15Page us15_Page) {
        this.us15_Page = us15_Page;
        for (int i = 0; i < 9; i++) {
            System.out.println("At least 8 characters are required");
            waitFor(2);
        }
    }

    @Then("user verifies that gives a warning as {string} when user enters less than {int} characters")
    public void userVerifiesThatGivesAWarningAsWhenUserEntersLessThanCharacters(String arg0, int arg1) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("At least 8 character"));
    }

    @And("user enters just numbers as password")
    public void user_verifies_one_lowercase_character_needed() {
        us15_Page.studentPassword.sendKeys("12345678");
        waitFor(2);
    }

    @Then("user verifies password doesn't include at least one lowercase, gives a warn as {string}")
    public void user_verifies_password_does_not_include_at_least_one_lowercase_gives_a_warn_as(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("One lowercase character"));
    }

    @And("user enters just lowercase characters as password")
    public void verify_one_uppercase_character_needed() {
        us15_Page.studentPassword.sendKeys("akjdfhfb");
        waitFor(2);

    }

    @Then("user verifies to password  include at least one uppercase character")
    public void user_verifies_to_password_include_at_least_one_uppercase_character() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("One uppercase character"));
        waitFor(2);

    }

    @And("user enters just uppercase characters as password")
    public void verify_one_lowercase_character_needed() {
        us15_Page.studentPassword.sendKeys("ABCDEFGH");
        waitFor(2);
    }

    @Then("user  verifies that password include at least one lowercase character")
    public void user_verifies_that_password_include_at_least_one_lowercase_character() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("One lowercase character"));
        waitFor(2);
    }

    @And("user enters both lowercase and uppercase as password")
    public void verify_one_number_needed() {
        us15_Page.studentPassword.sendKeys("HKKasdhg");
        waitFor(2);
    }

    @Then("verifies when password doesn't include at least one number, gives a warning as {string}")
    public void verifies_when_password_does_not_include_at_least_one_number_gives_a_warning_as(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("One number"));
    }

    @Then("verifies password is entered")
    public void verifiesPasswordIsEntered() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Abcd1234"));
    }

    //TC14
    @Then("user verifies when password doesn't include at least one uppercase, gives a warning as {string}")
    public void userVerifiesWhenPasswordDoesnTIncludeAtLeastOneUppercaseGivesAWarningAs(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("One uppercase"));
    }

    @Then("user verifies that password is include at least one number")
    public void userVerifiesThatPasswordIsIncludeAtLeastOneNumber() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("One number"));
    }

    @And("user enter at least one lowercase, one uppercase character, and one number")
    public void user_enters_at_least_one_lowercase_one_uppercase_character_and_one_number() {
        us15_Page.studentPassword.sendKeys("Abcd1234");
        waitFor(2);
    }

    @Then("user verifies the password contains uppercase letters, lowercase letters, and a number")
    public void user_verifies_the_password_contains_uppercase_letters_lowercase_letters_and_a_number() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Abcd1234"));
    }

    @Then("user verifies password is entered")
    public void userVerifiesPasswordIsEntered() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Abcd1234"));
    }

    //TC15
    @And("user leaves blank name box")
    public void user_leaves_name_box_blank() {
        us15_Page.requiredName.isDisplayed();
    }

    @And("user leaves surname box blank")
    public void user_leaves_surname_box_blank() {
        us15_Page.requiredSurname.isDisplayed();
    }

    @And("user leaves birth place box blank")
    public void user_leaves_birth_place_box_blank() {
        us15_Page.requiredBirthPlace.isDisplayed();
    }

    @And("user leaves email box blank")
    public void user_leaves_email_box_blank() {
        us15_Page.requiredEmail.isDisplayed();
    }

    @And("user leaves phone box blank")
    public void user_leaves_phone_box_blank() {
        us15_Page.requiredPhone.isDisplayed();
    }

    @And("user leaves gender box blank")
    public void user_leaves_gender_box_blank() {
        us15_Page.requiredGender.isDisplayed();
    }

    @And("user leaves birth date box blank")
    public void user_leaves_birth_date_box_blank() {
        us15_Page.requiredBirthDate.isDisplayed();
    }

    @And("user leaves SSN box blank")
    public void user_leaves_SSN_box_blank() {
        us15_Page.requiredSSN.isDisplayed();
    }

    @And("user leaves username box blank")
    public void user_leaves_username_box_blank() {
        us15_Page.requiredUsername.isDisplayed();
    }

    @And("user leaves father name box blank")
    public void user_leaves_father_name_box_blank() {
        us15_Page.requiredFatherName.isDisplayed();
    }

    @And("user leaves mother name box blank")
    public void user_leaves_mother_name_box_blank() {
        us15_Page.requiredMotherName.isDisplayed();
    }

    @And("user leaves password box blank")
    public void user_leaves_password_box_blank() {
        us15_Page.requiredPassword.isDisplayed();
    }

    @Given("user clicks on student management button")
    public void user_clicks_on_student_management_button() {
        us15_Page.studentManagementButton.click();
        waitFor(2);
    }

    @Given("user selects advisor teacher {string}")
    public void user_selects_advisor_teacher(String string) {
        us15_Page.advisorTeacherButton.isSelected();
        waitFor(2);
    }

    @Given("user enters student name {String}")
    public void user_enters_name(String string) {
        us15_Page.studentName.sendKeys("Haydi");
        waitFor(2);
    }

    @Given("user enters student surname {String}")
    public void student_enters_surname(String string) {
        us15_Page.studentUsername.sendKeys("Jackson");
        waitFor(2);
    }

    @Given("user enters birth place {String}")
    public void student_birth_place(String string) {
        us15_Page.studentBirthPlace.sendKeys("America");
        waitFor(2);
    }

    @Given("user enters email address {string}")
    public void user_enters_email_address(String string) {
        us15_Page.studentEmail.sendKeys("haydi@gmail.com");
        waitFor(2);
    }

    @Given("user enters phone number {string}")
    public void user_enters_student_phone_number(String string) {
        us15_Page.studentPhoneNumber.sendKeys("123-232-2321");
        waitFor(2);
    }

    @Given("user selects gender \"Female'")
    public void user_selects_gender_female() {
        us15_Page.studentGender.isSelected();
        waitFor(2);
    }

    @Given("user enters birth date {string}")
    public void user_enters_birth_date(String string) {
        us15_Page.studentBirthDay.sendKeys("3 Feb 2008");
        waitFor(2);
    }

    @Given("user enters SSN number {string}")
    public void user_enters_student_ssn_number(String string) {
        us15_Page.studentSSN.sendKeys("234-34-5643");
        waitFor(2);

    }

    @Given("user enters username {string}")
    public void user_enters_student_username(String string) {
        us15_Page.studentUsername.sendKeys("Hayson");
        waitFor(2);
    }

    @Given("user enters father name \"Jack'")
    public void user_enters_father_name_jack() {
        us15_Page.studentFatherName.sendKeys("Jack");
        waitFor(2);
    }

    @Given("user enters mother name \"Ashley'")
    public void user_enters_mother_name_ashley() {
        us15_Page.studentMotherName.sendKeys("Ashley");
        waitFor(2);
    }

    @Given("user enters password")
    public void student_enters_student_password(String string) {
        us15_Page.studentPassword.sendKeys("Haydi123");
        waitFor(2);
    }

    @Given("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        us15_Page.submitButton.click();
        waitFor(2);
    }

    @Given("user click on last page button")
    public void user_clicks_on_last_page_button() {
        us15_Page.lastPageButton.click();
        waitFor(2);
    }

    @Then("user verifies that student is added")
    public void user_verifies_that_student_is_added() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("student added successfully"));
        waitFor(2);

    }

    @Then("user verifies that student number is appear on the student list")
    public void user_verifies_that_student_number_is_appear_on_the_student_list() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("1632"));
        waitFor(2);
    }

    @Then("close the driver")
    public void closeTheDriver() {
        Driver.closeDriver();
    }





}





















