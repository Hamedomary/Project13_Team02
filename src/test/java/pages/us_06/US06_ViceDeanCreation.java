package pages.us_06;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US06_ViceDeanCreation {
    public US06_ViceDeanCreation (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Surname']")
    public WebElement surname ;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name ;
    @FindBy(xpath = "//input[@placeholder='Birth Place']")
    public WebElement birthPlace ;
    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement phoneNumber ;
    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement birthDay ;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn ;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName ;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password ;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleButton ;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleButton ;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement successMessage ;
    @FindBy(xpath = "//*[@href='/login']")
    public WebElement homePageLoginButton ;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton ;
    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton ;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton ;
}
