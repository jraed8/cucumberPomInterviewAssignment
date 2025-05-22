package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions
        (features = {"classpath:features"},
                glue = {"stepDefinitions"},
                tags = "",
                monochrome = true, //makes logs more readable
                dryRun = true, //only executes unmapped step defs
                plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider (parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
