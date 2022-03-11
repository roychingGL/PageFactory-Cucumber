package project.pages.locators.myAccountLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAdultVisitorLocators {

    @FindBy(id = "idType")
    public WebElement idType;

    @FindBy(id = "idNumber")
    public WebElement idNumber;

    @FindBy(id = "idState")
    public WebElement idState;

    @FindBy(className = "confirmTitle")
    public WebElement pageTitle;

    @FindBy(id = "next")
    public WebElement registerAndAdd;

    @FindBy(id = "For")
    public WebElement warnMessage;
}