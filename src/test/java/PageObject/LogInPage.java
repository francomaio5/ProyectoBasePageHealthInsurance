package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage extends BasePage {

    @FindBy(how = How.ID, using = "txt-username")
    private WebElement usernameField;

    @FindBy(how = How.ID, using = "txt-password")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "btn-login")
    private WebElement logInBtn;

    @FindBy(xpath = "//h2[contains(text(), 'Login')]")
    WebElement loginTitle;

    @FindBy(className = "text-danger")
    WebElement loginFailed;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public AppointmentPage logInSuccess(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        logInBtn.click();
        return new AppointmentPage(driver);
    }

    public boolean verifyIsLoginPage() {
        return loginTitle.isDisplayed();
    }

    public boolean loginFailed() {
        return loginFailed.isDisplayed();
    }

}