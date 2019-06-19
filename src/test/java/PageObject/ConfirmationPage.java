package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConfirmationPage extends BasePage {

    @FindBy(how = How.TAG_NAME, using = "h2")
    WebElement title;

    @FindBy(how = How.TAG_NAME , using = "h2" )
    WebElement ConfirmationText;

    @FindBy(how = How.ID, using = "facility")
    WebElement FacilityConfirm;

    @FindBy(how = How.ID, using = "hospital_readmission")
    WebElement HospitalReadminConfirm;

    @FindBy(how = How.ID, using = "program")
    WebElement Program;

    @FindBy(how = How.ID, using = "visit_date")
    WebElement VisitDate;

    @FindBy(how = How.ID, using = "comment")
    WebElement Comment;

    @FindBy (how = How.ID, using = "btn btn-default")
    WebElement HomePageBtn;


    public ConfirmationPage(WebDriver driver){
        super(driver);
    }

    public boolean titleIsDisplayed(){
        return title.isDisplayed();
    }

    public boolean titleText(){
        return title.getText().contains("Appointment Confirmation");
    }
}

