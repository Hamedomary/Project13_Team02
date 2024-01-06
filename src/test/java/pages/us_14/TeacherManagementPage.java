package pages.us_14;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.util.List;

public class TeacherManagementPage {
    public TeacherManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath = "//a[normalize-space()='Teacher Management']")
        public WebElement teacherManagementLink;

        @FindBy(xpath = "//div[contains(@class,'css-19bb58m')]")
        public WebElement chooseLessonDropDown;

        @FindBy(xpath = "//input[@id='name']")
        public WebElement nameInput;

        @FindBy(xpath = "//input[@id='surname']")
        public WebElement surNameInput;

        @FindBy(xpath = "//input[@id='birthPlace']")
        public WebElement birthPlaceInput;

        @FindBy(xpath = "//input[@id='email']")
        public WebElement emailInput;

        @FindBy(xpath = "//input[@id='phoneNumber']")
        public WebElement phoneNumberInput;

        @FindBy(xpath = "//input[@id='isAdvisorTeacher']")
        public WebElement isAdvisorTeacherCheckbox;

        @FindBy(xpath = "//input[@value='MALE']")
        public WebElement maleRadio;

        @FindBy(xpath = "//input[@value='FEMALE']")
        public WebElement femaleRadio;

        @FindBy(xpath = "//input[@id='birthDay']")
        public WebElement dateOfBirthInput;

        @FindBy(xpath = "//input[@id='ssn']")
        public WebElement ssnInput;

        @FindBy(xpath = " //input[@id='username']")
        public WebElement usernameInput;

        @FindBy(xpath = "//input[@id='password']")
        public WebElement passwordInput;

        @FindBy(xpath = "//button[normalize-space()='Submit']")
        public WebElement teacherSubmitButton;

        @FindBy(xpath = "//div[@id='39']")
         public WebElement successfulTeacherCreatedMessage;

//////////////////////////////////////////////////////////////////////////
    // teacher list elements

    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-teachersList']//th[1]")
    public WebElement teacherNameColumn;
    @FindBy(xpath = "//th[normalize-space()='Phone Number']")
    public WebElement teacherPhoneNumberColumn;
    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-teachersList']//th[contains(text(),'Ssn')]")
    public WebElement teacherSsnNumberColumn;
    @FindBy(xpath = "//th[normalize-space()='User Name']")
    public WebElement teacherUserNameColumn;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]")
    public WebElement teacherNamesList;
    @FindBy(xpath = "//span[normalize-space()='767-767-1785']")
    public WebElement teacherPhoneNumberList;
    @FindBy(xpath = "//span[normalize-space()='303-23-1376']")
    public WebElement teacherSsnNumberList;
    @FindBy(xpath = "//span[normalize-space()='Ahmad244145']")
    public WebElement teacherUserNameList;

    @FindBy(xpath = "//table//tbody//td")
    public List<WebElement> teacherCredentialList ;
    @FindBy (xpath = "//div[@id='controlled-tab-example-tabpane-teachersList']//span[@aria-hidden='true'][normalize-space()='»']")
    public WebElement endPageIcon;



}
