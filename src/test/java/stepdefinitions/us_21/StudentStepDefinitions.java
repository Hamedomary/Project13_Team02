package stepdefinitions.us_21;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pages.us_21.StudentLocators;
import pages.us_21.StudentUtilities;
import utilities.JSUtils;

import java.util.List;

public class StudentStepDefinitions {
    StudentLocators studentLocators = new StudentLocators();

    @Then("the student should see lesson management details")
    public void theStudentShouldSeeLessonManagementDetails(List<String> chooseLessonMenuElement) {
        List<String> actualChooseLessonElements = StudentUtilities.getElementsText(studentLocators.chooseLessonMenuElements);
        Assert.assertTrue(actualChooseLessonElements.containsAll(chooseLessonMenuElement));
    }

    @When("the student should be able to choose lesson")
    public void theStudentShouldBeAbleToChooseLesson() {
        studentLocators.chooseLesson.click();
        JSUtils.JSscrollIntoView( studentLocators.chooseLessonSubmitButton);
        studentLocators.chooseLessonSubmitButton.click();
    }

    @Then("the student should be able to see choosen lesson in the list")
    public void theStudentShouldBeAbleToSeeChoosenLessonInTheList() {
        Assert.assertNotNull(studentLocators.seeChoosenLessonInTheList);
    }

    @When("the student try to choose the lessons with same day and time")
    public void theStudentTryToChooseTheLessonsWithSameDayAndTime() {
        studentLocators.chooseSameDayLesson1.click();
        studentLocators.chooseSameDayLesson2.click();
        JSUtils.JSscrollIntoView(studentLocators.chooseLessonSubmitButton);
        studentLocators.chooseLessonSubmitButton.click();
    }

    @Then("the student should not be choose the lessons")
    public void theStudentShouldNotBeChooseTheLessons() {
        Assert.assertTrue(studentLocators.sameDayHourPopUp.isDisplayed());
    }

    @When("the student goes to menu")
    public void theStudentGoesToMenu() {
        studentLocators.studentMainMenu.click();
    }

    @And("the student click grades and announcements")
    public void theStudentClickGradesAndAnnouncements() {
        studentLocators.chooseGradeAndAnnouncements.click();
    }

    @Then("the student should be able to see the grades")
    public void theStudentShouldBeAbleToSeeTheGrades() {
        Assert.assertTrue(studentLocators.seeStudentGradesInList.size()>0);
    }
}
