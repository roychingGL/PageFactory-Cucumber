package project.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchInmateLocators {
    @FindBy(id = "pageTitle")
    public WebElement searchInmateLabel;

    @FindBy(id = "jmsId")
    public WebElement inmateIdInput;

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(xpath = "//*[@class = 'inmateSearch']/descendant::tr[2]")
    public WebElement searchResult;

    @FindBy(id = "addInmateLink")
    public WebElement addInmatesLink;

    @FindBy(id = "search")
    public WebElement searchButton;

    @FindBy(css = ".descriptionBlock")
    public WebElement successMessage;
}