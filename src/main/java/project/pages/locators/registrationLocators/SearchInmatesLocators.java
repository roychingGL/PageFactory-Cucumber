package project.pages.locators.registrationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchInmatesLocators {
    @FindBy(id = "jmsId")
    public WebElement inmateId;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "return")
    public WebElement backButton;

    @FindBy(id = "search")
    public WebElement searchButton;

    @FindBy(id = "next")
    public WebElement nextButton;

    @FindBy(id = "add")
    public WebElement addInmateLink;

    @FindBy(id = "removeInmateLink")
    public WebElement removeInmateLink;

    @FindBy(id = "pageTitle")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[@id = 'maintext']/descendant::span[2]")
    public WebElement firstErrorMessage;

    @FindBy(xpath = "//*[@id= 'searchForm']/descendant::div[@class = 'descriptionBlock']")
    public WebElement descriptionBlock;
}