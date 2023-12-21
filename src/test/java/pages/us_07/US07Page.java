package pages.us_07;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US07Page {

    public US07Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public  WebElement loginButton;
    @FindBy(xpath ="//input[@id='username']")
    public  WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public  WebElement password;


    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement getLoginButton;



    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public  WebElement menuButton;

    @FindBy(xpath = "//a[normalize-space()='Contact Get All']")
    public  WebElement contactGetAll;

    @FindBy(xpath = "//h5[@class='fw-bold p-3 card-header']")
    public WebElement contactMessages;




}

