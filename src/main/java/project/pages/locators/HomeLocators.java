package project.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomeLocators {

    @FindBy(id = "upcoming_addVisitorsLink")
    public WebElement addRemoveVisitorsLink;

    @FindBy(css = "a[aria-label='cancel visit']")
    public List<WebElement> cancelButtons;

    @FindBy(css = "td[class='x-btn-mc']")
    public WebElement cancelConfirmationYes;

    @FindBy(css = "#If_14_1 > li")
    public List <WebElement> CanceledVisitsList;

}