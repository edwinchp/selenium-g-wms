package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;

import drivers.DriverManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import pages.BasePage;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
    glue="steps",
    plugin={"pretty", "html:target/cucumber-reports.html"})

public class TestRunnerTest extends AbstractTestNGCucumberTests {

    
}