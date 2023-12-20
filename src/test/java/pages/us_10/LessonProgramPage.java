package pages.us_10;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonProgramPage {
    public LessonProgramPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Lesson Program']")
    public WebElement lessonProgramButton;

    @FindBy(xpath = "//input [@id='react-select-2-input']")
    public WebElement selectLesson;

    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement educationTerm;

    @FindBy(xpath = "//option[@value='1']")
    public WebElement educationTermName;

    @FindBy(id = "day")
    public WebElement selectDayBox;

    @FindBy(xpath = "//option[@value='MONDAY']")
    public WebElement selectDayName;

    @FindBy(id = "startTime")
    public WebElement startTimeBox;

    @FindBy(id = "stopTime")
    public WebElement stopTimeBox;

    @FindBy(xpath = "(//button[normalize-space()='Submit'])[3]")
    public WebElement lessonSubmitButton;

    @FindBy(xpath = "//div[contains(text(),'Created Lesson Program')]")
    public WebElement createdLessonProgramAlert;


    @FindBy(xpath = "//div[contains(text(),'JSON parse error: Cannot coerce empty String (\"\") ')]")
    public WebElement ErrorAlertMessage;

    @FindBy(xpath = "//div[contains(text(),'You have entered an invalid value. Valid values ar')]")
    public WebElement dayBoxErrorAlert;

    @FindBy(xpath = "//div[contains(text(),'Error: start time must not be greater than or equa')]")
    public WebElement timeErrorAlert;



}
