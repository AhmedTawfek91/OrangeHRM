package Runners;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = {"TestDefinitions"},
        features = "src/main/resources/Features",
        plugin = {"pretty","html:target/cucumber-html-report"}
)
public class TestRunner extends TestBase {
}