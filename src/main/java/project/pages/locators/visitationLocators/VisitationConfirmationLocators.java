package project.pages.locators.visitationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisitationConfirmationLocators {

    @FindBy(css = ".descriptionBlock")
    public WebElement confirmationMessage;

    @FindBy(id = "returnHome")
    public WebElement returnHomeButton;

    @FindBy(id = "scheduleAnotherVisit")
    public WebElement scheduleAnotherVisitButton;

    @FindBy(css = "#sideright > div > ul > li > ul")
    public WebElement visitInformation;
}