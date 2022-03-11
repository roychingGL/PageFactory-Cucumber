package project.pages.actions;

import org.openqa.selenium.support.PageFactory;
import project.pages.locators.SearchInmateLocators;
import utils.SeleniumHelper;
import utils.SeleniumDriver;

public class SearchInmateActions extends BaseWebVisitorActions {
    SeleniumHelper utilities = new SeleniumHelper();
    SearchInmateLocators locators = null;

    public SearchInmateActions() {
        locators = new SearchInmateLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void searchInmateByID(String inmateID) {
        type(locators.inmateIdInput, inmateID);
        locators.searchButton.click();
    }

    public boolean isResultEmpty() {

        if (locators.searchResult.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void goToAddInmates() {
        locators.addInmatesLink.click();
    }

    public void selectInmate() {
        locators.addInmatesLink.click();
    }

    public String getSuccessMessage() {
        return locators.successMessage.getText();
    }

}