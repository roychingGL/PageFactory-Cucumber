package project.pages.actions.registrationActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.registrationLocators.EmailLocators;
import utils.SeleniumHelper;
import utils.SeleniumDriver;

public class EmailActions extends BaseWebVisitorActions {
    SeleniumHelper utilities = new SeleniumHelper();
    EmailLocators locators = null;

    public EmailActions() {
        this.locators = new EmailLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public WebElement getNextButton() {
        return locators.nextButton;
    }


    public void enterRandomEmail() {
        String testEmail = utilities.generateEmail();
        locators.email.sendKeys(testEmail);
        locators.confirmEmail.sendKeys(testEmail);
        clickNext();
    }
}