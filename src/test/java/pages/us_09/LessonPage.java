package pages.us_09;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonPage {
    public LessonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessons;

    @FindBy(xpath = "//table[contains(.,'Lesson Name')]/tbody/tr")
    public WebElement lessonNames;

    @FindBy(xpath = "(//table)[2]")
    public WebElement lessonList;

    @FindBy(xpath = "//*[@id='lessonName']")
    public WebElement lessonName;

    @FindBy(xpath = " (//tbody[@class='table-group-divider'])[2]//tr[last()]")
    public WebElement lastCreatedLesson;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[contains(@class,'success')]")
    public WebElement successMessage;

    @FindBy(xpath = "//button[.=update]")
    public WebElement updateButton;



}
