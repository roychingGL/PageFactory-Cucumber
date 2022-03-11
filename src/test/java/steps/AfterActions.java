package steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActions {

    @After
    public static void tearDown(Scenario scenario) throws InterruptedException {
    	
    	WebDriver driver=SeleniumDriver.getDriver();
    	 if (scenario.isFailed()) {
             System.out.println("Scenario Failed "+scenario.getName());
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.attach(screenshotBytes, "image/png", "screenshot");
             
          
         }
    SeleniumDriver.tearDown();
    }
}
