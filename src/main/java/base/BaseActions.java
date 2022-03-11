package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.SeleniumDriver;

import static java.lang.Thread.sleep;


public class BaseActions {

    public final int waitingTime = 3000;
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

    public void select(WebElement element, String value) {
        if (isElementPresent(element)) {
            Select selectObj = new Select(element);
            selectObj.selectByVisibleText(value);
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

    public void waitForElement(WebElement element, int timeout) throws InterruptedException {
       for (int i=0; i <= timeout; i++){
           sleep(1000);
           if (element.isDisplayed()){
               break;
           }
       }
    }

}