import PageObject.AppointmentPage;
import PageObject.ConfirmationPage;
import PageObject.HomePage;
import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClaseTest {

    WebDriver driver;
    HomePage homePage;
    LogInPage logInPage;
    AppointmentPage appointmentPage;
    ConfirmationPage confirmationPage;
    String usuario = "John Doe";
    String password = "ThisIsNotAPassword";

    @BeforeClass
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        homePage = new HomePage(driver);
    }

    @Test
    public void login() {
        logInPage = homePage.clickAppointmentButton();
        Assert.assertTrue(logInPage.verifyIsLoginPage());
        appointmentPage = logInPage.logInSuccess(usuario, password);
        Assert.assertTrue(appointmentPage.textDisplayedAfterLogin());
    }

    }
