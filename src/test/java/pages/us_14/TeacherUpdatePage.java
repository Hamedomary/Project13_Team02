package pages.us_14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherUpdatePage {
    public TeacherUpdatePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-teachersList']//li[5]//a[1]")
        public WebElement takeToTheLastPageButton;
        @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-teachersList']//span[@aria-hidden='true'][normalize-space()='»']")
        public WebElement teacherNameVisibility;
        @FindBy(xpath = "//span[normalize-space()='321-221-4545']")
        public WebElement teacherPhoneVisibility;
        @FindBy(xpath = "//span[normalize-space()='321-22-4444']")
        public WebElement teacherSsnVisibility;
        @FindBy(xpath = "//span[normalize-space()='Ahmadkarimi']")
        public WebElement teacherUsernameVisibility;
        @FindBy(xpath = "")
        public WebElement teacherManagementLink;

        @FindBy(xpath = "//div[contains(text(),'Teacher updated Successful')]")
        public WebElement teacherUpdatedSuccessfullyMessage;
    @FindBy (xpath = "//div[@id='controlled-tab-example-tabpane-teachersList']//span[@aria-hidden='true'][normalize-space()='»']")
    public WebElement endPageIcon;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[10]/td[5]/span[1]/button[1]")
        public WebElement editButton;
    @FindBy(xpath = "//div[@role='dialog']//div[@class=' css-1wy0on6']//div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M14.348 14')]")
    public WebElement ClearSelectedLessonButton;
    @FindBy(xpath = "//div[contains(@class,'css-t3ipsp-control')]//div[contains(@class,'css-19bb58m')]")
    public WebElement chooseLessonEdit;
    @FindBy(xpath = "//div[contains(@class,'ms-4 me-4 text-center border border-3 shadow-sm bg-body rounded card border-warning')]//input[@id='name']")
    public WebElement teacherNameEdit;
    @FindBy(xpath = "//div[@role='dialog']//div[@class='card-body']//div[1]//div[3]//div[1]//input[1]")
    public WebElement teacherSurnameEdit;
    @FindBy(xpath = "//div[@role='dialog']//div[@class='card-body']//div[1]//div[4]//div[1]//input[1]")
    public WebElement teacherBirthPlaceEdit;
    @FindBy(xpath = "//body/div[@role='dialog']/div[@class='modal-dialog modal-xl']/div[@class='modal-content']/div/div[@class='modal-body']/div[@class='ms-4 me-4 text-center border border-3 shadow-sm bg-body rounded card border-warning']/div[@class='card-body']/form/div[2]/div[1]/div[1]/input[1]")
    public WebElement teacherEmailEdit;
    @FindBy(xpath = "//body/div[@role='dialog']/div[@class='modal-dialog modal-xl']/div[@class='modal-content']/div/div[@class='modal-body']/div[@class='ms-4 me-4 text-center border border-3 shadow-sm bg-body rounded card border-warning']/div[@class='card-body']/form/div[2]/div[2]/div[1]/input[1]")
    public WebElement teacherPhoneEdit;
    @FindBy(xpath = "//div[@class='modal-content']//div//div[2]//div[3]//div[1]//input[1]")
    public WebElement teacherSsnEdit;
    @FindBy(xpath = "//div[@class='mb-3 pt-1']//input[@id='birthDay']")
    public WebElement teacherDateOfBirthEdit;
    @FindBy(xpath = "//div[contains(@class,'ms-4 me-4 text-center border border-3 shadow-sm bg-body rounded card border-warning')]//input[@id='isAdvisorTeacher']")
    public WebElement isAdvisorTeacherEdit;
    @FindBy(xpath = "//body//div[@role='dialog']//div[@class='row']//div[@class='row']//div[1]//div[1]//input[1]")
    public WebElement femaleRadioEdit;
    @FindBy(xpath = "//div[@role='dialog']//div[3]//div[2]//div[1]//input[1]")
    public WebElement teacherUsernameEdit;
    @FindBy(xpath = "//div[contains(@class,'pt-3 col-md-auto')]//input[@id='password']")
    public WebElement teacherPasswordEdit;
    @FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='Submit']")
    public WebElement teacherSubmitButtonEdit;


}
