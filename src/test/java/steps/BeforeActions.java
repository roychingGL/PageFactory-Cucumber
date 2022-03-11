package steps;

import io.cucumber.java.Before;
import utils.SeleniumDriver;

import java.io.IOException;

public class BeforeActions {

    @Before
    public static void setUp() throws IOException {
        System.out.println("Before");
        SeleniumDriver.setUpDriver();
    }
}
