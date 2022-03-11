package project.pages.actions;

import base.BaseActions;
import org.openqa.selenium.support.PageFactory;
import project.pages.locators.BaseWebVisitorLocators;
import utils.SeleniumHelper;
import utils.SeleniumDriver;

import java.util.*;


public class BaseWebVisitorActions extends BaseActions {

    SeleniumHelper utilities = new SeleniumHelper();
    BaseWebVisitorLocators locators = null;

    public BaseWebVisitorActions() {
        this.locators = new BaseWebVisitorLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void populateForm(List<Map<String, String>> data) {
        int index = 0;
        String testEmail = utilities.generateEmail();

        type(locators.firstName, data.get(index).get("First Name"));
        type(locators.middleName, data.get(index).get("Middle Name"));
        type(locators.lastName, data.get(index).get("Last Name"));

        select(locators.dobMonth, data.get(index).get("Month"));
        select(locators.dobDay, data.get(index).get("Day"));

        type(locators.dobYear, data.get(index).get("DOB Year"));

        select(locators.gender, data.get(index).get("Gender"));
        select(locators.race, data.get(index).get("Race"));

        type(locators.emailField, testEmail);

        type(locators.address1, data.get(index).get("Address 1"));
        type(locators.address2, data.get(index).get("Address 2"));
        type(locators.city, data.get(index).get("City"));

        select(locators.stateProvince, data.get(index).get("State"));

        type(locators.zipPostal, data.get(index).get("Zip"));
    }

    public void clickNext() {
        clickElement(locators.nextButton);
    }

    public void clickSearch() {
        clickElement(locators.searchButton);
    }

}