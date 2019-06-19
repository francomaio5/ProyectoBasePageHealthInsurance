package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage extends BasePage {
    @FindBy(id = "combo_facility")
    WebElement inputFacility;

    @FindBy(id = "chk_hospotal_readmission")
    WebElement hospitalReadmission;

    @FindBy(id = "radio_program_medicare")
    WebElement radioMedicareButton;

    @FindBy(id = "radio_program_medicaid")
    WebElement radioMedicaidButton;

    @FindBy(id = "radio_program_none")
    WebElement radioNoneButton;

    @FindBy(id = "txt_visit_date")
    WebElement visitDate;

    @FindBy(id = "txt_comment")
    WebElement comenText;

    @FindBy(id = "btn-book-appointment")
    WebElement appointmentButton;

    public AppointmentPage (WebDriver driver) {
        super(driver);
    }

    public boolean textDisplayedAfterLogin() {
        return driver.findElement(By.tagName("h2")).getText().contains("Make Appointment");
    }

    public void addApointent(String date, String hospital, String comment, String program, String comboFacility) {
        Select combo = new Select(inputFacility);
        combo.selectByValue(comboFacility);
        if (program.equals("Medicare")) {
            radioMedicareButton.click();
        } else if (program.equals("Medicaid")) {
            radioMedicaidButton.click();
            radioNoneButton.click();
        }else{
            radioNoneButton.click();
        }
        visitDate.sendKeys(date);
        comenText.sendKeys(comment);
        appointmentButton.click();

          }
}

/*
Crear FindBy para cada uno de los 3 radio butons y despues en el metodo un else if
para que seleccione cualquiera de los 3
if (program.equals(xxx)){
inputxxx.click()
} else if (programs.equals(xxxx)
inputxxxx.click() {
else {
inputxxxxx.click()
}
 */