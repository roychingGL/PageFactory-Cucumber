package project.pages.actions.myAccountActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import project.pages.locators.myAccountLocators.AddAdultVisitorLocators;
import project.pages.actions.BaseWebVisitorActions;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddAdultVisitorActions extends BaseWebVisitorActions {
    SeleniumHelper utilities = new SeleniumHelper();

    AddAdultVisitorLocators locators = null;
    SeleniumHelper helper = new SeleniumHelper();

    public AddAdultVisitorActions() {
        locators = new AddAdultVisitorLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void populatePersonalIdentification(List<Map<String, String>> data) {
        int index = 0;
        Select idTypeOption = new Select(locators.idType);
        idTypeOption.selectByVisibleText(data.get(index).get("Type"));

        type(locators.idNumber, String.valueOf(helper.getRandomNumber()));

        type(locators.idState, data.get(index).get("State"));
    }

    public void populatePersonalInfoAdultForm(List<Map<String, String>> data) {
        List<Map<String, String>> personalData = new ArrayList<>();
        //      The minimum and maximum year are entered, so that the visitor is an adult
        Map<String, String> newMap = utilities.getRandomDOBMap(1950, 2002);
        newMap.putAll(data.get(0));
        personalData.add(newMap);
        populateForm(personalData);
    }
}