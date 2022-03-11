package project.pages.locators.registrationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PersonalInfoLocators {
    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "middleName")
    public WebElement middleNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "dobMonth")
    public WebElement dobMonthComboBox;

    @FindBy(id = "dobDay")
    public WebElement dobDayComboBox;

    @FindBy(id = "dobYear")
    public WebElement dobYearField;

    @FindBy(id = "address1")
    public WebElement address1Field;

    @FindBy(id = "address2")
    public WebElement address2Field;

    @FindBy(id = "stateProvince")
    public WebElement stateProvinceField;

    @FindBy(id = "zipPostal")
    public WebElement zipPostalField;

    @FindBy(id = "city")
    public WebElement cityField;

    @FindBy(id = "next")
    public WebElement nextButton;

    @FindBy(id = "return")
    public WebElement backButton;

    @FindBy(id = "phoneArea")
    public WebElement phoneArea;

    @FindBy(id = "phoneLocalArea")
    public WebElement phoneLocalArea;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;
}