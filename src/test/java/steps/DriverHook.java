package steps;


import org.junit.AfterClass;

import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.BasePage;

public class DriverHook {
    
    @Before
    public void beforeScenario() {
        // Initialize the driver before each scenario if needed
        DriverManager.createDriver();
    }
    

    @After
    public void afterSuite() {
        DriverManager.quitDriver();
        //BasePage.tearDown();
    }
}
