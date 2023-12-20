package pojos.us_10;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;
}
