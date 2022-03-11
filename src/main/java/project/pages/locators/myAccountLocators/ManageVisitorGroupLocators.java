package project.pages.locators.myAccountLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageVisitorGroupLocators {
    @FindBy(id = "manageMyVisitor")
    public WebElement manageMyVisitor;

    @FindBy(id = "addVisitorLink")
    public WebElement addAdultVisitorLink;

    @FindBy(id = "addMinorLink")
    public WebElement addMinorLink;

    @FindBy(className = "descriptionBlock")
    public WebElement successMessage;

    @FindBy(id = "manageVisitorsForm")
    public WebElement pageIdentifier;

    @FindBy(id = "removeVisitorLink")
    public WebElement removeVisitorLink;

    @FindBy(id = "RemoveLinkyes-btn")
    public WebElement removeYesButton;
}