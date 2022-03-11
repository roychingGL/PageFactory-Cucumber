package project.pages.actions.registrationActions;

import org.openqa.selenium.support.PageFactory;
import utils.SeleniumDriver;
import visitorKiosk.pages.actions.BaseVisitorKioskActions;
import project.pages.locators.registrationLocators.CustomQuestionLocators;

import static java.lang.Thread.sleep;

public class CustomQuestionActions extends BaseVisitorKioskActions {
    CustomQuestionLocators locators = null;

    public CustomQuestionActions() {
        this.locators = new CustomQuestionLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public String getInstructions() throws InterruptedException {
        sleep(waitingTime);
        return locators.pageInstructionsText.getText();
    }

    public void selectNext() {
        locators.nextButton.click();
    }
}
