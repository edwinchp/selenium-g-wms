package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks {

    private static Scenario scenario;


    @Before
    public void beforeScenario(Scenario scenario) {
        Hooks.scenario = scenario;
    }

    @AfterStep()
    public void attachScreenshot(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "screenshot");
    }
}
