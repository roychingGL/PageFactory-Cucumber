package project.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
    @FindBy(id = "user_email")
    public WebElement emailInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(css = "input[class='btn btn-primary']")
    public WebElement signInButton;
}