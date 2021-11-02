package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
//import cucumber.api.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class BaseClass {

    private  static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void Baseclass() {

//        BaseClass.driver = driver;
//        BaseClass.wait = wait;

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.out.println("setting the driver");
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/form");

    }
//    public WebDriver init_driver(String browser) {
//
//        System.out.println("browser value is: " + browser);

//        if (browser.equals("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            tlDriver.set(new ChromeDriver());
//        } else if (browser.equals("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            tlDriver.set(new FirefoxDriver());
//        } else if (browser.equals("safari")) {
//            tlDriver.set(new SafariDriver());
//        } else {
//            System.out.println("Please pass the correct browser value: " + browser);
//        }
//
//        getDriver().manage().deleteAllCookies();
//        getDriver().manage().window().maximize();
//        return getDriver();
//
//    }
//    protected void WaitUntilElementVisible(WebElement element) {
//
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }

    public static WebDriver getDriver(){
        return driver;
    }


    @After
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}