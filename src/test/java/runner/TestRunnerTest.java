package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;


import drivers.DriverManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
    glue="steps",
    plugin={"pretty", "html:target/cucumber-reports.html"})

public class TestRunnerTest extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void tearDown() {
        DriverManager.quitDriver();
    }


    @AfterTest
    public static void afterSuite() {
        DriverManager.quitDriver();
    }
}