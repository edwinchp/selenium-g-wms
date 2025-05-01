package hooks;

import org.junit.AfterClass;
import org.testng.annotations.AfterSuite;
import drivers.DriverManager;
import io.cucumber.java.After;

public class DriverHook {
    
    @AfterClass
    public static void tearDown() {
        DriverManager.quitDriver();
    }

    @After
    public void afterFeature(){
        DriverManager.quitDriver();
    }

    @AfterSuite
    public void afterSuite() {
        DriverManager.quitDriver();
    }
}
