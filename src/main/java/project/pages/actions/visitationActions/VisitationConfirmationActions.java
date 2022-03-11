package project.pages.actions.visitationActions;

import org.openqa.selenium.support.PageFactory;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.visitationLocators.VisitationConfirmationLocators;
import utils.SeleniumDriver;

public class VisitationConfirmationActions extends BaseWebVisitorActions {

    VisitationConfirmationLocators locators = null;

    public VisitationConfirmationActions() {
        locators = new VisitationConfirmationLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public String getConfirmationMessage() {
        return locators.confirmationMessage.getText();
    }

    public void clickScheduleAnotherVisit() {
        locators.scheduleAnotherVisitButton.click();
    }

    public void returnHome() {
        locators.returnHomeButton.click();
    }
}