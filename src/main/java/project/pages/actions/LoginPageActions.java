package project.pages.actions;

import org.openqa.selenium.support.PageFactory;
import project.pages.locators.LoginPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

import java.io.*;

public class LoginPageActions extends NavigationActions {

    LoginPageLocators locators = null;

    public LoginPageActions() throws FileNotFoundException {
        this.locators = new LoginPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void login(String id, String password) {
        type(locators.emailInput, id);
        type(locators.passwordInput, password);
        locators.signInButton.click();
    }

    public void login() throws IOException {
        String usernameProp = SeleniumHelper.getProperties().get("username").toString();
        String passwordProp = SeleniumHelper.getProperties().get("password").toString();
        String username = System.getProperty("app.user", usernameProp);
        String password = System.getProperty("app.pwd", passwordProp);
        login(username, password);
    }

}