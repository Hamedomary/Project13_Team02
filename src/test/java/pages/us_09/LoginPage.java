package pages.us_09;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[contains(.,'cookies')]//button[contains(.,'Godkänn alla')]")
    public  WebElement acceptCookiesSwedish;

    @FindBy(xpath = "//div[contains(.,'cookies')]//button[contains(.,'Accept all')]")
    public WebElement acceptCookiesEnglish;

    @FindBy(xpath = "//a[contains(.,'Login')]")
    public WebElement firstLogin;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    public WebElement secondLogin;

    @FindBy(xpath = "//button[contains(text(),'Menu')]")
    public WebElement menu;















}
