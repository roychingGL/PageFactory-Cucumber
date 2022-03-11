package project.pages.actions.visitationActions;

import org.openqa.selenium.support.PageFactory;
import project.pages.actions.BaseWebVisitorActions;
import project.pages.locators.visitationLocators.PostLocators;
import utils.SeleniumDriver;

public class PostActions extends BaseWebVisitorActions {
    PostLocators locators = null;

    public PostActions() {
        locators = new PostLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void clickNextIfAvailable() {
        if (!getMessage().isEmpty()) {
            super.clickNext();
        }
    }

    public String getMessage() {
        return locators.postText.getText();
    }

}