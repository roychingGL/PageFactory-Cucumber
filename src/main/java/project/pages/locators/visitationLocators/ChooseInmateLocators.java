package project.pages.locators.visitationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseInmateLocators {
    @FindBy(id = "pageTitle")
    public WebElement chooseInmateLabel;

    @FindBy(id = "recipientDropdown")
    public WebElement selectInmateField;

    @FindBy(id = "searchInmatesLink")
    public WebElement searchInmatesLink;
}