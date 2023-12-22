package pages.us_18;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US18_Pages {
    public US18_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement homePageLoginButton ;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton ;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName ;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password ;
    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton ;
    @FindBy(linkText = "Student Info Management")
    public WebElement studentInfoButton;
    @FindBy(xpath = "//select[@id='lessonId']")
    public WebElement chooseLesson ;
    @FindBy(xpath = "//select[@id='studentId']")
    public WebElement chooseStudent ;
    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement chooseEducationTerm ;
    @FindBy(xpath = "//input[@id='absentee']")
    public WebElement absentee ;
    @FindBy(xpath = "//input[@id='midtermExam']")
    public WebElement midtermExam ;
    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement finalExam ;
    @FindBy(xpath = "//input[@id='infoNote']")
    public WebElement infoNote ;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButtonInfoPage ;

    @FindBy(xpath = "(//*[@class='form-control'])[6]")
    public WebElement midtermExamEditPage ;
    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButtonEditPage ;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement successMessageEditPage ;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement successMessageDeletePage ;
    @FindBy(xpath = "(//table[@class ='table table-striped table-bordered table-hover'])/tbody/tr/td[1]")
    public WebElement nameOfStudentTable ;
    @FindBy(xpath = "(//table[@class ='table table-striped table-bordered table-hover'])/tbody/tr/td[2]")
    public WebElement lessonNameTable ;
    @FindBy(xpath = "(//table[@class ='table table-striped table-bordered table-hover'])/tbody/tr/td[3]")
    public WebElement absenteeTable ;
    @FindBy(xpath = "(//table[@class ='table table-striped table-bordered table-hover'])/tbody/tr/td[4]")
    public WebElement midtermTable ;
    @FindBy(xpath = "(//table[@class ='table table-striped table-bordered table-hover'])/tbody/tr/td[5]")
    public WebElement finalTable ;
    @FindBy(xpath = "(//table[@class ='table table-striped table-bordered table-hover'])/tbody/tr/td[6]")
    public WebElement noteTable ;
    @FindBy(xpath = "(//table[@class ='table table-striped table-bordered table-hover'])/tbody/tr/td[7]")
    public WebElement infoNoteTable ;
    @FindBy(xpath = "(//table[@class ='table table-striped table-bordered table-hover'])/tbody/tr/td[8]")
    public WebElement averageTable ;

    @FindBy(xpath = "(//button[@class ='text-dark btn btn-outline-info'])[1]")
    public WebElement editTable ;

    @FindBy(xpath = "(//button[@class='btn-close'])[3]")
    public WebElement xButton ;
    @FindBy(xpath = "(//button[@class ='btn btn-danger'])[1]")
    public WebElement deleteTable ;

}
