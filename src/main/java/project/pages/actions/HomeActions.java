package project.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import project.pages.locators.HomeLocators;
import utils.SeleniumDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class HomeActions extends BaseWebVisitorActions {

    HomeLocators locators = null;

    public HomeActions() {
        this.locators = new HomeLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void selectAddRemoveVisitors() {
        locators.addRemoveVisitorsLink.click();
    }

    public void cancelUpcomingVisits() throws InterruptedException {
        List<WebElement> visits = locators.cancelButtons;

        for (int i = 0; i < visits.size(); i++) {
            visits.get(i).click();
            sleep(waitingTime / 2);
            locators.cancelConfirmationYes.click();
        }
    }

    public int getCanceledVisitsSize() {
        return locators.CanceledVisitsList.size();
    }
}