package project.pages.locators.registrationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IdDocumentsLocators {

    @FindBy(id = "idType")
    public WebElement idType;

    @FindBy(id = "idNumber")
    public WebElement idNumber;

    @FindBy(id = "idState")
    public WebElement idState;

    @FindBy(id = "gender")
    public WebElement gender;

    @FindBy(id = "race")
    public WebElement race;

    @FindBy(id = "next")
    public WebElement nextButton;
}