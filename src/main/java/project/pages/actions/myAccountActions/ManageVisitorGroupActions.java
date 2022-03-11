//Check /test/com/renovo/VisitorVisitation/test/pages/newVisitor/ManageVisitorGroupTestPage

package project.pages.actions.myAccountActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import project.pages.actions.NavigationActions;
import project.pages.locators.myAccountLocators.ManageVisitorGroupLocators;
import utils.SeleniumDriver;

import java.util.List;

public class ManageVisitorGroupActions extends NavigationActions {

    ManageVisitorGroupLocators locators = null;

    public ManageVisitorGroupActions() {
        locators = new ManageVisitorGroupLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void addNewMinorVisitor() throws InterruptedException {
        locators.addMinorLink.click();
    }

    public List<WebElement> getMinorList() {
        List<WebElement> minors = SeleniumDriver.getDriver().findElements(By.cssSelector("#minorVisitorGroup_0 > #If_14_1 >.cf"));
        return minors;
    }

    public List<WebElement> getAdultVisitorList() {
        List<WebElement> visitors = SeleniumDriver.getDriver().findElements(By.cssSelector("#If_3_1 > li"));
        return visitors;
    }

    public boolean isMinorDisplayed(String minor) {
        List<WebElement> minors = getMinorList();
        boolean result = false;

        for (WebElement element : minors) {
            if (element.getText().toLowerCase().contains(minor))
                result = true;
        }
        return result;
    }

    public boolean isVisitorAdultDisplayed(String visitor) {
        List<WebElement> adultVisitors = getAdultVisitorList();
        boolean result = false;

        for (WebElement element : adultVisitors) {
            if (element.getText().toLowerCase().contains(visitor))
                result = true;
        }
        return result;
    }

    public boolean minorListHasElements() {
        return getMinorList().size() > 0;
    }

    public void addNewAdultVisitor() throws InterruptedException {
        locators.addAdultVisitorLink.click();
    }
}