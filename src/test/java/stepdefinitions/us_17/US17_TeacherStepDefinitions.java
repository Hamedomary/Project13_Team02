package stepdefinitions.us_17;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.us_17.US17_TeacherLocators;
import utilities.ConfigReader;
import utilities.WaitUtils;

public class US17_TeacherStepDefinitions {
    US17_TeacherLocators teacherLocators = new US17_TeacherLocators();

    String username = ConfigReader.getProperty("username");
    String password = ConfigReader.getProperty("password");


    @Given("enter user name for us17")
    public void enter_user_name_for_us17() {
        teacherLocators.usernameInput.sendKeys(username);
    }
    @Given("enter password for us17")
    public void enter_password_for_us17() {
        teacherLocators.passwordInput.sendKeys(password);
    }
    @Given("click on student info management")
    public void click_on_student_info_management() {
        teacherLocators.studentInfoManagementLink.click();
    }
    @Given("verify add student info is visible")
    public void verify_add_student_info_is_visible() {
        teacherLocators.addStudentInfoText.isDisplayed();
    }
    @Given("add student info is visible")
    public void add_student_info_is_visible() {
        teacherLocators.addStudentInfoText.isDisplayed();
    }
    @Then("verify choose lesson is selectable")
    public void verify_choose_lesson_is_selectable() {
        Select lessonSelect = new Select(teacherLocators.chooseLessonSelection);
        lessonSelect.selectByIndex(1);
    }
    @Then("verify choose student is selectable")
    public void verify_choose_student_is_selectable() {
        Select studentSelect = new Select(teacherLocators.chooseStudentSelection);
        studentSelect.selectByIndex(1);

    }
    @Then("verify choose education term is selectable")
    public void verify_choose_education_term_is_selectable() {
        Select educationTermSelect = new Select(teacherLocators.chooseEducationTermSelection);
        educationTermSelect.selectByIndex(1);
    }

    @Then("Verify Absentee input is visible")
    public void verify_absentee_input_is_visible() {
        teacherLocators.absenteeInput.isDisplayed();

    }
    @Then("Enter absences to Absentee")
    public void enter_absences_to_absentee() {
        teacherLocators.absenteeInput.sendKeys("3");
    }

    @Given("add student is vsisible")
    public void add_student_is_vsisible() {
        teacherLocators.addStudentInfoText.isDisplayed();

        WaitUtils.waitFor(1);
    }
    @Then("enter a midterm exam grade")
    public void enter_a_midterm_exam_grade() {
        teacherLocators.midtermExamGradeInput.sendKeys("90");

        WaitUtils.waitFor(1);
    }
    @Then("verify midterm exam grade should be able to be entered")
    public void verify_midterm_exam_grade_should_be_able_to_be_entered() {

        WaitUtils.waitFor(3);

        String gradeInputValue = teacherLocators.midtermExamGradeInput.getAttribute("value");

        Assert.assertEquals("90", gradeInputValue);
    }
    @When("enter a Final Exam grade")
    public void enter_a_final_exam_grade() {
        teacherLocators.finalExamGradeInput.sendKeys("90");
    }
    @Then("verify Final exam grade should be able to be entered")
    public void verify_final_exam_grade_should_be_able_to_be_entered() {

        WaitUtils.waitFor(3);

        String gradeInputValue = teacherLocators.finalExamGradeInput.getAttribute("value");

        Assert.assertEquals("90", gradeInputValue);
    }
    @Then("click on info note")
    public void click_on_info_note() {
        teacherLocators.infoNoteInput.click();
    }
    @Then("enter info about the student")
    public void enter_info_about_the_student() {
        teacherLocators.infoNoteInput.sendKeys("BASARILI BIR DONEM GECIRDI");
    }
    @Then("click on submit button")
    public void click_on_submit_button() {
        teacherLocators.submitButton.click();
    }
}
