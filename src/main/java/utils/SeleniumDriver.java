package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;


public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    //initialize webdriver
    private static WebDriver driver;

    //initialize timeouts
    private static WebDriverWait waitDriver;

    private SeleniumDriver() throws IOException {
        String browserProp = SeleniumHelper.getProperties().get("browser").toString();
        String browser = System.getProperty("browser", browserProp);
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Unsupported browser: " + browser);
        }
        driver.manage().window().maximize();
    }

    public static void openPage() {
        String url = "www.google.com";
        System.out.println(url);
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() throws IOException {
        if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();
    }

    public static void tearDown() throws InterruptedException {
        if (driver != null) {
            driver.close();
//            driver.quit();
        }
        seleniumDriver = null;
    }
}