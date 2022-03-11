package project.pages.locators.registrationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationLocators
{
    @FindBy(id = "next")
    public WebElement nextButton;

    @FindBy(id = "verifiedWithPolicy")
    public WebElement visitationPoliciesCheckBox;

    @FindBy(id = "securityCode")
    public WebElement securityCode;

    @FindBy(id = "policyLink")
    public WebElement policyLink;

    @FindBy(id = "For_0")
    public WebElement securityCodeError;

    @FindBy(id = "maintext")
    public WebElement congratulationsMessage;
}