
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"steps", "hooks"},
        plugin = {
            "pretty",
            "html:target/cucumber-reports.html",
            "json:target/cucumber.json"
        },
        tags = "@Test")

public class TestRunnerTest extends AbstractTestNGCucumberTests {

}
