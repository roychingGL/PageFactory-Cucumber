package project.pages.actions.registrationActions;

import org.openqa.selenium.support.PageFactory;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.registrationLocators.ConfirmationLocators;
import utils.SeleniumHelper;
import utils.SeleniumDriver;

import java.io.IOException;

public class ConfirmationActions extends BaseWebVisitorActions {
    ConfirmationLocators locators = null;

    public ConfirmationActions() {
        this.locators = new ConfirmationLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void doSubmit(boolean acceptVisitationPolicies) throws IOException {
        String securityCode= SeleniumHelper.getProperties().get("securityCode").toString();

        populateForm(securityCode, acceptVisitationPolicies);
        locators.nextButton.click();
    }

    private void populateForm(String securityCode, boolean acceptVisitationPolicies) {
        type(locators.securityCode, securityCode);
        locators.visitationPoliciesCheckBox.click();
    }

    public String getSecurityCodeError() {
        return locators.securityCodeError.getText();
    }

    public String getCongratulationsMessage() {
        return locators.congratulationsMessage.getText();
    }
}