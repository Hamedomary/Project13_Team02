package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

import static baseurls.BaseUrl.setUp;
import static io.restassured.RestAssured.baseURI;

public class Hooks {

    @After
    public void afterTearDown(Scenario scenario){
//        System.out.println("After Hooks");
//        if a test scenario fails, then capture the screenshot, and attach it to the html report
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","failed_screenshot");
            Driver.closeDriver();
        }
    }

    @Before ("@UI")
    public static void before_ui(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().manage().window().maximize();
    }

    @After ("@UI")
    public static void tearDown(){
        Driver.closeDriver();
    }
//    @Before("@API")
//    public static void beforeApi(){
//        setUp("ViceDeanHamed","Nargis211400");
//    }

    @Before("@API")
    public static void BeforeApi(){
        baseURI = ConfigReader.getProperty("base_uri");
    }
}

