package project.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import project.pages.locators.LoginPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

import java.io.*;

public class LoginPageActions extends BaseWebVisitorActions {

    LoginPageLocators locators = null;

    public LoginPageActions() throws FileNotFoundException {
        this.locators = new LoginPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void login(String id, String password) {
        type(locators.emailField, id);
        type(locators.passwordField, password);
        locators.logOn.click();
    }

    public void login() throws IOException {
        String usernameProp = SeleniumHelper.getProperties().get("webUsername").toString();
        String passwordProp = SeleniumHelper.getProperties().get("password").toString();
        String username = System.getProperty("app.user", usernameProp);
        String password = System.getProperty("app.pwd", passwordProp);
        login(username, password);
    }

    public String getTitle(WebDriver driver) {
        return driver.getTitle();
    }

    public void doClickRegistrationLink() {
        locators.registrationLink.click();
    }

    public boolean registerTodayIsEnable() {
        return containText("REGISTER TODAY");
    }

}