package pages.us_09;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {
    public TeacherManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(.,'Teacher Management')]")
    public WebElement teacherManagement;


    @FindBy(linkText = "Select lesson")
    public WebElement chooseLessons;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(xpath = "//label[contains(.,'Female')]")
    public WebElement genderFemale;

    @FindBy(id = "birthDay")
    public WebElement birthDay;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[contains(.,'Submit')]")
    public WebElement submit;

    @FindBy(xpath = "(//span[.='Last'])[1]/..")
    public WebElement lastPageButton;

    @FindBy(css= ".invalid-feedback")
    public WebElement required;


}



