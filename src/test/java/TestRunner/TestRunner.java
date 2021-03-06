package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = ".//Features/Orders.feature",
        glue = "StepDefs",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty",
                "html:test-output"
        }
)

public class TestRunner {
}
