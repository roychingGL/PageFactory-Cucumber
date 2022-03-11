package project.pages.locators.visitationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VisitationSummaryLocators {

    @FindBy(xpath = " //*[@class='dateAndLocation']/ul[1]/li[1]")
    public WebElement dateTimeLabel;

    @FindBy(xpath = "//*[@class='vListData']/li[2]/div")
    public WebElement timeZoneLabel;

    @FindBy(id = "return")
    public WebElement returnHome;

    @FindBy(id = "verifyBox")
    public WebElement verifyVisitationPolicies;

    @FindBy(id = "ExternalLink")
    public WebElement visitationPolicyTextLink;

    @FindBy(id = "GenericLink")
    public WebElement visitationPolicyURLLink;

    @FindBy(id = "short")
    public WebElement relationship;

    @FindBy(className = "info")
    public WebElement visitationSummaryMessage;

    @FindBy(id = "cancelLink")
    public WebElement cancelVisit;

    @FindBy(xpath = "//button[contains(.,'Yes')]")
    public WebElement yes;

    @FindBy(xpath = "//button[contains(.,'No')]")
    public WebElement no;

    @FindBy(css = "table:nth-child(10) > tbody > tr")
    public List <WebElement> visitorRows;

    @FindBy(className = "warningBlock")
    public WebElement warningMessage;

    @FindBy(id = "cardSecurityCode")
    public WebElement cardSecurityCode;

    @FindBy(className = "summaryHeader")
    public List<WebElement> summaryHeaders;

}