package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumDriver;


public class BaseActions {

    public final int waitingTime = 2500;
    BaseLocators locators = null;

    public BaseActions() {
        locators = new BaseLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void clickElement(WebElement element) {
        if (isElementPresent(element)) {
            ((JavascriptExecutor) SeleniumDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            element.click();
        } else {
            System.out.println("Element is not present");
        }
    }

    public void type(WebElement element, String value) {
        if (isElementPresent(element)) {
            element.clear();
            element.sendKeys(value);
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean containText(String text) {
        if (SeleniumDriver.getDriver().getPageSource().contains(text)) {
            return true;
        } else {
            return false;
        }
    }
}