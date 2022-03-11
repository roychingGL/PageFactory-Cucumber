//Check /test/com/renovo/VisitorVisitation/test/base/VisitorBasePage

package project.pages.actions;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import project.pages.locators.NavigationLocators;
import project.pages.actions.myAccountActions.ManageVisitorGroupActions;
import utils.SeleniumDriver;

public class NavigationActions {
    Actions action;
    NavigationLocators locators = null;

    public NavigationActions() {
        this.locators = new NavigationLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
        action = new Actions(SeleniumDriver.getDriver());
    }

    //    Top Menu options
    public void goToHomePage() {
        locators.homeMenu.click();
    }

    public void goToVisitationPage() {
        locators.visitationMenu.click();
    }


    public void goToEmailPage() {
        locators.emailMenu.click();
    }

    public void goToMyAccountPage() {
        locators.myAccountMenu.click();
    }

    public void goToInternetVisitTesterPage() {
        locators.internetVisitTesterMenu.click();
    }

    public void goToIContactPage() {
        locators.internetVisitTesterMenu.click();
    }

    public void goToFAQPage() {
        locators.faqMenu.click();
    }

    //My Account Options
    public ManageVisitorGroupActions goToMyAccountPage_ManageVisitorGroupsPage() {
        Action moveToMyAccount = action
                .moveToElement(locators.myAccountMenu)
                .build();

        moveToMyAccount.perform();

        locators.manageVisitorGroups.click();
        return PageFactory.initElements(SeleniumDriver.getDriver(), ManageVisitorGroupActions.class);
    }

    public ManageVisitorGroupActions goToMyAccountPage_ManageInmates() {
        Action moveToMyAccount = action
                .moveToElement(locators.myAccountMenu)
                .build();

        moveToMyAccount.perform();

        locators.manageInmates.click();
        return PageFactory.initElements(SeleniumDriver.getDriver(), ManageVisitorGroupActions.class);
    }

    public ManageVisitorGroupActions goToVisitation_ScheduleVisit() {
        Action moveToMyAccount = action
                .moveToElement(locators.visitationMenu)
                .build();

        moveToMyAccount.perform();

        locators.scheduleAVisit.click();
        return PageFactory.initElements(SeleniumDriver.getDriver(), ManageVisitorGroupActions.class);
    }

}