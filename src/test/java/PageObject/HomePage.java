package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    @FindBy(how = How.ID, using = "btn-make-appointment")
    WebElement makeappointmentButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LogInPage clickAppointmentButton() {
        makeappointmentButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        return new LogInPage(driver);
    }

}