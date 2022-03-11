package project.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseWebVisitorLocators {

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "middleName")
    public WebElement middleName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "dobMonth")
    public WebElement dobMonth;

    @FindBy(id = "dobDay")
    public WebElement dobDay;

    @FindBy(id = "dobYear")
    public WebElement dobYear;

    @FindBy(id = "gender")
    public WebElement gender;

    @FindBy(id = "race")
    public WebElement race;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "stateProvince")
    public WebElement stateProvince;

    @FindBy(id = "zipPostal")
    public WebElement zipPostal;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "phoneArea")
    public WebElement phoneArea;

    @FindBy(id = "phoneLocalArea")
    public WebElement phoneLocalArea;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(className = "confirmTitle")
    public WebElement pageTitle;

    @FindBy(id = "next")
    public WebElement nextButton;

    @FindBy(id = "search")
    public WebElement searchButton;

    @FindBy(id = "email")
    public WebElement emailField;
}