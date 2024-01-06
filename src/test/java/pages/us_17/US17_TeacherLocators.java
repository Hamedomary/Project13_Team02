package pages.us_17;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US17_TeacherLocators {
    public US17_TeacherLocators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(partialLinkText = "Student Info Management")
    public WebElement studentInfoManagementLink;


    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/h5")
    public WebElement addStudentInfoText;

    @FindBy(id = "lessonId")
    public WebElement chooseLessonSelection;

    @FindBy(id = "studentId")
    public WebElement chooseStudentSelection;

    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTermSelection;

    @FindBy(id = "absentee")
    public WebElement absenteeInput;

    @FindBy(id = "midtermExam")
    public WebElement midtermExamGradeInput;

    @FindBy(id = "finalExam")
    public WebElement finalExamGradeInput;

    @FindBy(id = "infoNote")
    public WebElement infoNoteInput;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div/div[8]/div/button")
    public WebElement submitButton;

}
