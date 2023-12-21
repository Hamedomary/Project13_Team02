package pages.us_11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US11_ViceDeanLocators {
    public US11_ViceDeanLocators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div/div[2]/a[2]")
    public WebElement loginLink;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/form/div[3]/button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div/div/nav/button")
    public WebElement menuButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/a[1]")
    public WebElement lessonManagementLink;

    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramTab;

    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[1]/div/h3")
    public WebElement lessonProgramHeader;

    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[1]/div/form/div/div[1]/div/div")
    public WebElement chooseLessonSelection;

    @FindBy (id = "day")
    public WebElement chooseDaySelection;

    @FindBy (id = "startTime" )
    public WebElement startTimeSelection;

    @FindBy (id = "stopTime")
    public WebElement stopTimeSelection;

    @FindBy (xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div")
    public  WebElement lessonProgramList;

}
