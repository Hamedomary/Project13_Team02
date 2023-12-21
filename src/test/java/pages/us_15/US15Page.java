package pages.us_15;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US15Page {

    public US15Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public  WebElement loginButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameVice;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordVice;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement getLoginButton;

    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public  WebElement menuButton;

    @FindBy(xpath = "//a[normalize-space()='Student Management']")
    public WebElement studentManagementButton;

    @FindBy(xpath = "//select[@id='advisorTeacherId']")
    public  WebElement advisorTeacherButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement studentName;

     @FindBy(id = "//div[@class='Required']")
           public WebElement requiredName;
     @FindBy(id = "Required")
     public WebElement requiredSurname;

     @FindBy(id = "Required")
     public WebElement requiredBirthPlace;

     @FindBy(id = "Required")
     public WebElement requiredEmail;

     @FindBy(id = "Required")
     public WebElement requiredPhone;

     @FindBy(xpath = "//div[contains(text(),'You have entered an invalid value. Valid values ar')]")
     public WebElement requiredGender;

     @FindBy(id = "Required")
     public WebElement requiredBirthDate;

     @FindBy(id = "Required")
     public WebElement requiredSSN;

     @FindBy(id = "Required")
     public WebElement requiredUsername;

     @FindBy(id = "Required")
     public WebElement requiredFatherName;

     @FindBy(id = "Required")
     public WebElement requiredMotherName;

     @FindBy(id = "Enter your password")
     public WebElement requiredPassword;

    @FindBy(xpath = "//input[@id='surname']")
    public  WebElement studentSurname;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public  WebElement studentBirthPlace;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement studentEmail;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement studentPhoneNumber;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement studentGender;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement studentBirthDay;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement studentSSN;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement studentUsername;

    @FindBy(xpath = "//input[@id='fatherName']")
    public WebElement studentFatherName;

    @FindBy(xpath = "//input[@id='motherName']")
    public WebElement studentMotherName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement studentPassword;


    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//main[@class='content']//li[5]//a[1]")
    public WebElement lastPageButton;








}

