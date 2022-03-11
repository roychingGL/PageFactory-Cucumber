package steps;

import base.BaseActions;
import io.cucumber.java.en.Given;

import utils.SeleniumDriver;

import java.io.FileNotFoundException;
import java.io.IOException;


public class CommonSteps {

    BaseActions baseActions = new BaseActions();


    public CommonSteps() throws FileNotFoundException {
    }

    @Given("Web site is open")
    public void visitorWebSiteIsOpen() throws IOException {
        SeleniumDriver.openVisitorWebSite();
    }

}