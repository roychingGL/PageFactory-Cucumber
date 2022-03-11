package project.pages.actions.registrationActions;

import org.openqa.selenium.support.PageFactory;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.registrationLocators.PersonalInfoLocators;
import utils.SeleniumHelper;
import utils.SeleniumDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersonalInfoActions extends BaseWebVisitorActions {

    SeleniumHelper util = new SeleniumHelper();
    PersonalInfoLocators locators = null;

    public PersonalInfoActions() {
        this.locators = new PersonalInfoLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void populateFormRandomDOB(List<Map<String, String>> data) {
        List<Map<String, String>> personalData = new ArrayList<>();
        //      The minimum and maximum year are entered, so that the visitor is an adult
        Map<String, String> newMap = util.getRandomDOBMap(1950, 2002);
        newMap.putAll(data.get(0));
        personalData.add(newMap);
        populateForm(personalData);
    }

    public void populateForm(List<Map<String, String>> info) {
        int index = 0;

        type(locators.firstNameField, info.get(index).get("First Name"));
        type(locators.middleNameField, info.get(index).get("Middle Name"));

        String lastName = info.get(index).get("Last Name");
        if (lastName.equals("Random")) {
            lastName = util.generateRandomString();
        }
        type(locators.lastNameField, lastName);
        select(locators.dobMonthComboBox, info.get(index).get("Month"));
        select(locators.dobDayComboBox, info.get(index).get("Day"));

        type(locators.dobYearField, info.get(index).get("BOD Year"));
        type(locators.address1Field, info.get(index).get("Address 1"));
        type(locators.cityField, info.get(index).get("City"));
        type(locators.stateProvinceField, info.get(index).get("State/Province"));
        type(locators.zipPostalField, info.get(index).get("ZIP/Postal Code"));
        type(locators.phoneArea, info.get(index).get("Phone Area"));
        type(locators.phoneLocalArea, info.get(index).get("Phone Local Area"));
        type(locators.phoneNumber, info.get(index).get("Phone Number"));
        clickNext();
    }
}