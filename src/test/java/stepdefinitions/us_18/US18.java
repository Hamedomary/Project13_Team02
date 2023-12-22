package stepdefinitions.us_18;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;
import pages.US01_Pages;
import pages.us_18.US18_Pages;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US18 {
    US18_Pages us18Pages = new US18_Pages();
    Faker faker = new Faker();
//    @Given("user enter  {string}")
//    public void user_enter(String url) {
//
//        Driver.getDriver().get(url);
//    }
    @Given("user clicks  Login button")
    public void user_clicks_login_button() {
    us18Pages.homePageLoginButton.click();
    }
    @Given("user types username")
    public void user_types_username() {
        WaitUtils.waitFor(2);
        us18Pages.userName.sendKeys("müslümTeacher");
    }
    @Given("user types password")
    public void user_types_password() {
        us18Pages.password.sendKeys("müslümTeacher1903");
    }
    @Then("user clicks Log in button")
    public void user_clicks_log_in_button(){us18Pages.loginButton.click();
    }
    @Then("user choose lesson")
    public void user_choose_lesson() {
        WaitUtils.waitFor(2);
        BrowserUtils.dropdownSelectByIndex(us18Pages.chooseLesson,1);
    }
    @Then("user choose student")
    public void user_choose_student() {
       BrowserUtils.dropdownSelectByIndex(us18Pages.chooseStudent,faker.number().numberBetween(1,40));
    }
    @Then("user choose educationTerm")
    public void user_choose_education_term() {
        BrowserUtils.dropdownSelectByIndex(us18Pages.chooseEducationTerm,faker.number().numberBetween(1,10));
    }
    @Then("user types Absentee")
    public void user_types_absentee() {
        us18Pages.absentee.sendKeys("2");
    }
    @Then("user types Midterm Exam")
    public void user_types_midterm_exam() {
       us18Pages.midtermExam.sendKeys("1");
    }
    @Then("user types Final Exam")
    public void user_types_final_exam() {
     us18Pages.finalExam.sendKeys("55");
    }
    @Then("user types Info Note")
    public void user_types_ınfo_note() {
        us18Pages.infoNote.sendKeys("abcdefghijklm");
    }
    @Then("user clicks submit button")
    public void user_clicks_submit_button() {
        us18Pages.submitButtonInfoPage.click();
    }
    @Then("assert name is visible")
    public void assert_name_is_visible() {
        WaitUtils.waitFor(2);
        Assert.assertTrue(us18Pages.nameOfStudentTable.isDisplayed());

    }
    @Then("assert lessonname is visible")
    public void assert_lessonname_is_visible() {
        Assert.assertTrue(us18Pages.lessonNameTable.isDisplayed());

    }
    @Then("assert absentee is visible")
    public void assert_absentee_is_visible() {
        Assert.assertTrue(us18Pages.absenteeTable.isDisplayed());
    }
    @Then("assert midterm exam is visible")
    public void assert_midterm_exam_is_visible() {
        Assert.assertTrue(us18Pages.midtermTable.isDisplayed());

    }
    @Then("assert final exam is visible")
    public void assert_final_exam_is_visible() {
        Assert.assertTrue(us18Pages.finalTable.isDisplayed());
    }
    @Then("assert note is visible")
    public void assert_note_is_visible() {
        Assert.assertTrue(us18Pages.noteTable.isDisplayed());
    }
    @Then("assert info note is visible")
    public void assert_info_note_is_visible() {
        Assert.assertTrue(us18Pages.infoNoteTable.isDisplayed());
    }
    @Then("assert average is visible")
    public void assert_average_is_visible() {
        Assert.assertTrue(us18Pages.averageTable.isDisplayed());
    }
    @Then("user click edit button")
    public void user_click_edit_button() {
        WaitUtils.waitFor(5);
        JSUtils.JSclickWithTimeout(us18Pages.editTable);
    }
    @Then("user changes the midterm exam note")
    public void user_changes_the_midterm_exam_note() {
        WaitUtils.waitFor(2);
       us18Pages.midtermExamEditPage.sendKeys("1");

    }
    @Then("user click submit edit page button")
    public void user_click_submit_edit_page_button() {
        WaitUtils.waitFor(2);
        JSUtils.JSclickWithTimeout(us18Pages.submitButtonEditPage);
    }
    @Then("assert edit success message is visible")
    public void assert_edit_success_message_is_visible() {
        WaitUtils.waitFor(1);
        Assert.assertTrue(us18Pages.successMessageEditPage.getText().contains("Success"));
    }

    @Then("user clicks x button")
    public void user_clicks_x_button() {
       WaitUtils.waitFor(1);
       JSUtils.JSclickWithTimeout(us18Pages.xButton);
    }


    @Then("user clicks delete button")
    public void user_clicks_delete_button() {
        WaitUtils.waitFor(2);
        us18Pages.deleteTable.click();
    }
    @Then("assert the student is deleted")
    public void assert_the_student_is_deleted() {
        WaitUtils.waitFor(1);
        Assert.assertTrue(us18Pages.successMessageDeletePage.getText().contains("Success"));
    }

    @Then("user close the window")
    public void user_close_the_window() {
        WaitUtils.waitFor(3);
        Driver.closeDriver();
    }

}
