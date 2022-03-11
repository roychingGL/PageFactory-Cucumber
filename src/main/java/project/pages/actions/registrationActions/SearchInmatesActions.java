package project.pages.actions.registrationActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.registrationLocators.SearchInmatesLocators;
import utils.SeleniumDriver;

public class SearchInmatesActions extends BaseWebVisitorActions {

    SearchInmatesLocators locators = null;

    public SearchInmatesActions() {
        this.locators = new SearchInmatesLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public WebElement getFirstErrorMessage() {
        return locators.firstErrorMessage;
    }

    public boolean isAddInmateLinkAvailable() {
        WebElement addLink = SeleniumDriver.getDriver().findElement(By.id("add"));
        return (addLink != null);
    }

    public boolean isNextButtonAvailable() {
        WebElement searchBtn = SeleniumDriver.getDriver().findElement(By.id("search"));
        return (searchBtn != null);
    }

    public void doSearch(String inmateId, String firstName, String lastName) {
        clearForm();
        populateForm(inmateId, firstName, lastName);
        locators.searchButton.click();
    }

    public void populateForm(String inmateId, String firstName, String lastName) {
        type(locators.inmateId, inmateId);
        type(locators.firstName, firstName);
        type(locators.lastName, lastName);
    }

    private void clearForm() {
        locators.inmateId.clear();
        locators.firstName.clear();
        locators.lastName.clear();
    }

    public void addInmate() {
        if (locators.descriptionBlock.isDisplayed()) {
            System.out.println("clicking add");
            locators.addInmateLink.click();
        }
    }
}