package project.pages.locators.visitationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchCriteriaLocators {
    @FindBy(id = "dateExtId")
    public WebElement dateField;

    @FindBy(id = "pageTitle")
    public WebElement searchCriteriaLabel;

    @FindBy(id = "visitCenterSelection")
    public WebElement visitCenterSelection;

    @FindBy(id = "timeOfDay")
    public WebElement timeOfDay;

    @FindBy(id = "return")
    public WebElement previous;

    @FindBy(id = "search")
    public WebElement search;

    @FindBy(xpath = " //*[@id='visitorForm']")
    public WebElement contentBorder;

    @FindBy(xpath = " //*[@id='visitorForm']/descendant::div[contains(.,'Standard')][2]")
    public WebElement timeZoneLabel;

    @FindBy(className = "warningBlock")
    public WebElement warningMessage;

    @FindBy(xpath = "//img[contains(@class, 'x-form-date-trigger')]")
    public WebElement calendarButton;

    @FindBy(xpath = "//div[contains(@class, 'x-date-menu')]//td[contains(@class, 'x-date-today')]/parent::tr/following-sibling::tr/td[1]/a")
    public WebElement nextSundayAnchor;

    @FindBy(id = "next")
    public WebElement firstTimeBlock;
}
