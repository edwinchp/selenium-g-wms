package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.OrderMonitorPage;
import drivers.DriverManager;


public class OrderMonitorSteps {
    
    private final WebDriver driver = DriverManager.getDriver();
    private final OrderMonitorPage orderMonitorPage = new OrderMonitorPage(driver);


    @And("I click on Order Monitor button")
    public void iClickOnOrderMonitorButton() {
        orderMonitorPage.clickOrderMonitorButton();
    }

    @When("I click on Create button")
    public void iClickOnCreateButton() {
        orderMonitorPage.clickCreateButton();
    }
}
