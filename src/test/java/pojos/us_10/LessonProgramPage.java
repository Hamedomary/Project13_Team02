package pojos.us_10;

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

    @FindBy(xpath = ("(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]"))
    public WebElement SubmitButton;
}
