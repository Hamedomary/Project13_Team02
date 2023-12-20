package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonLoginElements {


    public CommonLoginElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginLink;
    @FindBy(xpath = "(//button[normalize-space()='Menu'])[1]")
    public WebElement menuLink;
       @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;

}
