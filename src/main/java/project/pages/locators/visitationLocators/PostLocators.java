package project.pages.locators.visitationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostLocators {
    @FindBy(css = "#emailReaderContent > div > p")
    public WebElement postText;
}