package project.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login")
    public WebElement logOn;

    @FindBy(id = "nav_contactUs2")
    public WebElement genericContactUs;

    @FindBy(id = "registerToday")
    public WebElement registrationLink;
}