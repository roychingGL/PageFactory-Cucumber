package project.pages.actions.myAccountActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import project.pages.locators.myAccountLocators.AddMinorLocators;
import utils.SeleniumHelper;
import project.pages.actions.BaseWebVisitorActions;
import utils.SeleniumDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AddMinorActions extends BaseWebVisitorActions {
    SeleniumHelper utilities = new SeleniumHelper();

    AddMinorLocators locators = null;
    private String minorVisitor = "";

    public AddMinorActions() {
        locators = new AddMinorLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void selectFirstInmate() throws InterruptedException {
        Select inmateOption = new Select(locators.inmateSelect);
        inmateOption.selectByIndex(0);
    }

    public void populatePersonalInfoMinorForm(List<Map<String, String>> data) {
        List<Map<String, String>> personalData = new ArrayList<>();
//      The minimum and maximum year are entered, so that the visitor is a minor
        Map<String, String> newMap = utilities.getRandomDOBMap(2005, 2021);
        newMap.putAll(data.get(0));
        personalData.add(newMap);
        populateForm(personalData);
    }
}