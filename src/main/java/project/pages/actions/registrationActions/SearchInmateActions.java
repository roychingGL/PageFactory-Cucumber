package project.pages.actions.registrationActions;

import org.openqa.selenium.support.PageFactory;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.registrationLocators.SearchInmateLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

import java.io.IOException;

public class SearchInmateActions extends BaseWebVisitorActions {

    SearchInmateLocators locators = null;

    public SearchInmateActions() {
        this.locators = new SearchInmateLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void doSearch(String inmateId, String firstName, String lastName) {
        populateForm(inmateId, firstName, lastName);
        locators.searchButton.click();
    }

    public void doSearchByID(String inmateId) {
        type(locators.inmateId, inmateId);
        locators.searchButton.click();
    }

    public void doSearchByID() throws IOException {
        String inmateProp = SeleniumHelper.getProperties().get("inmateID").toString();

        String id = System.getProperty("app.inmate", inmateProp);
        doSearchByID(id);
    }

    public void populateForm(String inmateId, String firstName, String lastName) {
        type(locators.inmateId, inmateId);
        type(locators.firstName, firstName);
        type(locators.lastName, lastName);
    }

    public void addInmate() {
        if (isElementPresent(locators.addInmateLink)) {
            System.out.println("clicking add");
            locators.addInmateLink.click();
        } else {
            System.out.println("No inmate matches the search criteria");
        }
    }

    public boolean skipButtonIsDisplayed(){
        return locators.skipButton.isDisplayed();
    }


    public void skipSearch(){
        locators.skipButton.click();
    }
}
