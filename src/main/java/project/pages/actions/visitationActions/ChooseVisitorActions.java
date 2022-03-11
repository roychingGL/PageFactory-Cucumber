package project.pages.actions.visitationActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.visitationLocators.ChooseVisitorLocators;
import utils.SeleniumDriver;

import java.util.List;

public class ChooseVisitorActions extends BaseWebVisitorActions {

    ChooseVisitorLocators locators = null;

    public ChooseVisitorActions() {
        locators = new ChooseVisitorLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public WebElement getItemToSchedule(int index) {
        WebElement checkBoxElement;
        if (index > 0)
            checkBoxElement = SeleniumDriver.getDriver().findElement(By.id("visitorSelection" + "_" + (index - 1)));
        else
            checkBoxElement = SeleniumDriver.getDriver().findElement(By.id("visitorSelection"));
        return checkBoxElement;
    }

    public String getItemLabel(int index) {
        WebElement labelElement;
        if (index > 0)
            labelElement = SeleniumDriver.getDriver().findElement(By.id("Any" + "_" + (index - 1)));
        else
            labelElement = SeleniumDriver.getDriver().findElement(By.id("Any"));
        return labelElement.getText();
    }

    public void clickAddNewVisitorLink() {
        locators.addNewVisitor.click();
    }

    public String getUnapprovedLabel() {
        return locators.secondVisitor.getText();
    }

    public void selectAllCheckBoxes() {
        List<WebElement> elements = locators.checkBoxes;

        for (WebElement element : elements) {
            element.click();
        }
    }
}