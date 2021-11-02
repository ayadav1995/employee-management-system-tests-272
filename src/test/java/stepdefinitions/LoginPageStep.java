package stepdefinitions;



import pageObjects.LoginPage;
//import Utilities.PropertiesReader;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {

//    private static String title;
    private LoginPage loginPage = new LoginPage(BaseClass.getDriver());

        public LoginPageStep() throws Exception {
            LoginPage loginPage = new LoginPage(BaseClass.getDriver());
//            PropertiesReader propertiesReader = new PropertiesReader();
//            this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
        }



        @Given("user is on login page")
        public void loginPage() {
//             WebDriver driver;
//            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//            driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.manage().window().maximize();
//            driver.get("https://formy-project.herokuapp.com/form");
            LoginPage loginPage = new LoginPage(BaseClass.getDriver());
            loginPage.getLoginPageTitle();
//            HomePage home = new HomePage(driver, wait);
//            home.homePageIsDisplayed();
//            home.clickLoginButton();
        }

        @When("Submit email using \"(.*)\" and password using \"(.*)\"")
        public void submitEmailPassword(String email, String password) {

//            LoginPage login = new LoginPage(driver, wait);
//            login.loginPageIsDisplayed();
//            login.fillEmailData(email);
//            login.fillPasswordData(password);
//            login.clickSignInButton();
        }

        @Then("Success login to home page with displaying account button")
        public void successLogin() {

//            HomePage home = new HomePage(driver, wait);
//            Assert.assertTrue(home.homePageAfterLoginIsDisplayed());
        }

        @Then("Login failed with displaying error message")
        public void loginFailed() {
//
//            LoginPage login = new LoginPage(driver, wait);
//            Assert.assertTrue(login.errorMessageIsDisplayed());
        }
    }

