package project.pages.locators.visitationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ChooseVisitorLocators {
    @FindBy(id = "pageTitle")
    public WebElement chooseVisitorLabel;

    @FindBy(id = "addVisitorLink")
    public WebElement addNewVisitor;

    @FindBy(xpath = "//li[contains(.,'Registration Unapproved')]")
    public WebElement secondVisitor;

    @FindBy(css = "input[type='checkbox']")
    public List <WebElement> checkBoxes;
}