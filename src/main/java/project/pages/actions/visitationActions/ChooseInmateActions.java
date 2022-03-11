package project.pages.actions.visitationActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.visitationLocators.ChooseInmateLocators;
import utils.SeleniumDriver;

import java.util.List;

public class ChooseInmateActions extends BaseWebVisitorActions {

    ChooseInmateLocators locators = null;

    public ChooseInmateActions() {
        locators = new ChooseInmateLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void selectInmate(String inmate) {
        Select selectInmate = new Select(locators.selectInmateField);
        selectInmate.selectByVisibleText(inmate);
    }

    public void goToSearchInmatePage() {
        locators.searchInmatesLink.click();
    }

    public List<WebElement> chooseInmateOptions() {
        Select selectElement = new Select(locators.selectInmateField);
        List<WebElement> allOptions = selectElement.getOptions();
        return allOptions;
    }

    public void selectFirstInmate() {
        List<WebElement> allOptions = chooseInmateOptions();

        if (allOptions.size() >= 1) {
            Select selectInmate = new Select(locators.selectInmateField);
            selectInmate.selectByIndex(1);
        } else {
            System.out.println("Inmate drop down is empty");
        }
    }
}