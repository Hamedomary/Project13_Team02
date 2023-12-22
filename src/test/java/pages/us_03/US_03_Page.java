package pages.us_03;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_03_Page {
    public US_03_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "offcanvasNavbar-expand-lg")
    public WebElement contactButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameField;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement subjectField;

    @FindBy(xpath = "//textarea[@placeholder='Message']")
    public WebElement messageTextField;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement sendMessageButton;

    @FindBy (id = "Required")
    public WebElement requiredName;

    @FindBy (id = "Required")
    public WebElement requiredEmail;

    @FindBy (id = "Required")
    public WebElement requiredSubject;

    @FindBy (id = "Required")
    public WebElement requiredTextMessage;


}
