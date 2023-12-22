package pages.us_21;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class StudentLocators {

    public StudentLocators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Lesson,Teacher,Day,etc.
    @FindBy(xpath = "(//div[@class='table-responsive'])[1]/table/thead/tr/th")
    public List<WebElement> chooseLessonMenuElements;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[7]")
    public WebElement chooseLesson;

    @FindBy(xpath = "//div[@class=' pb-3 col']/button[@type='button']")
    public WebElement chooseLessonSubmitButton;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[2]//td[.='Hydrology']")
    public WebElement seeChoosenLessonInTheList;

    @FindBy(xpath ="(//input[@id='lessonProgramId'])[9]" )
    public WebElement chooseSameDayLesson1;

    @FindBy(xpath ="(//input[@id='lessonProgramId'])[10]" )
    public WebElement chooseSameDayLesson2;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement studentMainMenu;

    @FindBy(xpath = "//div/a[.='Grades and Announcements']")
    public WebElement chooseGradeAndAnnouncements;

    @FindBy(xpath = "//tbody[@class='table-group-divider']/tr")
    public List<WebElement> seeStudentGradesInList;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Error: Course schedule cannot be selected for the same hour and day']")
    public WebElement sameDayHourPopUp;

}
