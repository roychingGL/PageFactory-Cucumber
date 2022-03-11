package project.pages.locators.registrationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailLocators {

    @FindBy(id = "email")
    public WebElement email;

    @FindBy (id = "confirmEmail")
    public WebElement confirmEmail;

    @FindBy (id = "return")
    public WebElement backButton;

    @FindBy (id = "next")
    public WebElement nextButton;

    @FindBy (className = "warningBlock")
    public WebElement warningBlock;
}