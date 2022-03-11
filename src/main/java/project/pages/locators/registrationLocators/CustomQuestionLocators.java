package project.pages.locators.registrationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomQuestionLocators {

    @FindBy(id = "pageInstructions")
    public WebElement pageInstructionsText;

    @FindBy(id = "next")
    public WebElement nextButton;
}
