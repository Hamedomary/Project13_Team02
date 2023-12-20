package pojos.us_10;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginLink;
    @FindBy(xpath = "(//button[normalize-space()='Menu'])[1]")
    public WebElement menuLink;

}
