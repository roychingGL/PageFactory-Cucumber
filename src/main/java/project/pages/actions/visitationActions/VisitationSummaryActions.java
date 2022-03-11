package project.pages.actions.visitationActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.visitationLocators.VisitationSummaryLocators;
import utils.SeleniumDriver;

import java.util.List;

public class VisitationSummaryActions extends BaseWebVisitorActions {

    VisitationSummaryLocators locators = null;

    public VisitationSummaryActions() {
        locators = new VisitationSummaryLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void clickConfirm() {
        super.clickNext();
    }

    public List<WebElement> getRelationshipOptions() {
        Select selectElement = new Select(locators.relationship);
        List<WebElement> allOptions = selectElement.getOptions();
        return allOptions;
    }

    public void agreeFacilityVisitationPolicy() {
        locators.verifyVisitationPolicies.click();
    }

    public int getVisitorRowsSize() {
        return locators.visitorRows.size();
    }

}
