package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/FeatureFiles"},
        glue = {"steps"},
        monochrome = true,
        plugin = {("json:target/cucumber-reports/CucumberTestReport.json"), ("com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")},
        tags = "@regression",
        publish = true
)


public class TestRunner {

}


