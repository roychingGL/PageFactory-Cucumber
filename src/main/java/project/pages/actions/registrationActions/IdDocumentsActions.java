package project.pages.actions.registrationActions;

import org.openqa.selenium.support.PageFactory;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.registrationLocators.IdDocumentsLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

import java.util.List;
import java.util.Map;


public class IdDocumentsActions extends BaseWebVisitorActions {

    SeleniumHelper utils = new SeleniumHelper();
    IdDocumentsLocators locators = null;

    public IdDocumentsActions() {
        this.locators = new IdDocumentsLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void doSubmit(List<Map<String, String>> info) {
        int index = 0;
        String IDType = info.get(index).get("Identification Type");
        String ID = info.get(index).get("Identification Number");
        if (ID.equals("Random")) {
            ID = utils.generateRandomStringNumber();
        }
        String stateCountry = info.get(index).get("Stage/Country");
        String gender = info.get(index).get("Gender");
        String race = info.get(index).get("Race");

        populateForm(IDType, ID, stateCountry, gender, race);
        locators.nextButton.click();
    }

    public void populateForm(String idType, String idNumber, String idState, String gender, String race) {
        select(locators.idType, idType);
        type(locators.idNumber, idNumber);
        type(locators.idState, idState);
        select(locators.gender, gender);
        select(locators.race, race);
    }
}