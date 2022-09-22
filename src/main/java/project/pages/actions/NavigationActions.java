package project.pages.actions;

import base.BaseActions;
import org.openqa.selenium.support.PageFactory;
import project.pages.locators.NavigationLocators;
import utils.SeleniumDriver;

public class NavigationActions extends BaseActions {

    NavigationLocators locators = null;

    public NavigationActions() {
        this.locators = new NavigationLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void navigateToMyTasks() {
        clickElement(locators.myTasksLink);
    }

    public boolean myTasksLinkIsVisible() {
        return locators.myTasksLink.isDisplayed();
    }

}