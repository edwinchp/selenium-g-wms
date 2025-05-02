package steps;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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

    @When("I enter Shipping Order details:")
    public void iEnterShippingOrderDetails(DataTable dataTable) {
        Map<String, String> row = dataTable.asMaps().get(0);

        String number = "100" + String.valueOf(new Random().nextInt(5000 - 1000 + 1) + 1000);
        String taskId = row.get("Task ID");
        String purchaseOrder = row.get("Purchase Order");
        String orderValue = row.get("Order Value");
        String orderNotes = row.get("Order Notes");
        String transportMethod = row.get("Transportation Method");

        orderMonitorPage.enterShippingOrderDetails(number, taskId, purchaseOrder, orderValue, orderNotes, transportMethod);
    }

    @And("I enter Shipping Address details:")
    public void enterShippingAddressDetails(DataTable dataTable) {
        Map<String, String> row = dataTable.asMaps().get(0);

        String name = row.get("Name");
        String address1 = row.get("Address 1");
        String address2 = row.get("Address 2");
        String city = row.get("City");
        String state = row.get("State");
        String zipCode = row.get("Zip Code");
        String phone = row.get("Phone");
        String email = row.get("Email");
        String country = row.get("Country");

        orderMonitorPage.enterShippingAddressDetails(name, address1, address2, city, state, zipCode, phone, email, country);
    }

    @And("I enter Billing Address details:")
    public void enterBillingAddressDetails(DataTable dataTable) {
        Map<String, String> row = dataTable.asMaps().get(0);

        String name = row.get("Name");
        String address1 = row.get("Address 1");
        String address2 = row.get("Address 2");
        String city = row.get("City");
        String state = row.get("State");
        String zipCode = row.get("Zip Code");
        String phone = row.get("Phone");
        String email = row.get("Email");
        String country = row.get("Country");

        orderMonitorPage.enterBillingAddressDetails(name, address1, address2, city, state, zipCode, phone, email, country);
    }

    @And("I click on Add new order line button")
    public void clickOnAddNewOrderLineButton() {
        orderMonitorPage.clickAddNewOrderLineButton();
    }

    @And("I select a SKU order")
    public void selectASkuOrder() {
        orderMonitorPage.selectSkuOrder();
    }

    @And("I enter {int} in the Package Quantity field")
    public void enterInPackageQuantityField(int quantity) {
        orderMonitorPage.enterPackageQuantity(quantity);
    }

    @And("I enter {int} in the Sales Price field")
    public void enterInSalesPriceField(int price) {
        orderMonitorPage.enterSalesPrice(price);
    }

    @And("I click on Save button")
    public void clickOnSaveButton() {
        orderMonitorPage.clickSaveButton();
    }

    @Then("I can see the success message")
    public void verifySuccessMessage() {
        Assert.assertTrue(orderMonitorPage.isSuccessMessageDisplayed());
    }
}
