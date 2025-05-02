package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class OrderMonitorPage extends BasePage {

    private final By orderMonitorButton = By.xpath("//nav//ul//a[contains(.,'Orders Monitor')]");
    private final By createButton = By.xpath("//button[normalize-space()='Create']");
    private final By numberInput = By.id("mui-8");
    private final By taskIdInput = By.id("mui-9");
    private final By poInput = By.id("mui-10");
    private final By valueInput = By.id("mui-11");
    private final By notesInput = By.id("mui-12");
    private final By transportDropdown = By.id("mui-14");

    private final By shippingAddressNameInput = By.id("mui-15");
    private final By shippingAddressAddress1Input = By.id("mui-16");
    private final By shippingAddressAddress2Input = By.id("mui-17");
    private final By shippingAddressCityInput = By.id("mui-18");
    private final By shippingAddressStateInput = By.id("mui-19");
    private final By shippingAddressZipCodeInput = By.id("mui-20");
    private final By shippingAddressPhoneInput = By.id("mui-21");
    private final By shippingAddressEmailInput = By.id("mui-22");
    private final By shippingAddressCountryInput = By.id("mui-23");

    private final By billingAddressNameInput = By.id("mui-24");
    private final By billingAddressAddress1Input = By.id("mui-25");
    private final By billingAddressAddress2Input = By.id("mui-26");
    private final By billingAddressCityInput = By.id("mui-27");
    private final By billingAddressStateInput = By.id("mui-28");
    private final By billingAddressZipCodeInput = By.id("mui-29");
    private final By billingAddressPhoneInput = By.id("mui-30");
    private final By billingAddressEmailInput = By.id("mui-31");
    private final By billingAddressCountryInput = By.id("mui-32");

    private final By addNewOrderLineButton = By.xpath("//button[normalize-space()='Add']");
    private final By skuInput = By.id("mui-35");
    //private final By skuOptions = By.id("mui-40");
    private final By packageQtyInput = By.id("mui-36");
    private final By salesPriceInput = By.id("mui-38");
    private final By saveButton = By.xpath("//button[normalize-space()='Save']");
    private final By successMessage = By.id("notistack-snackbar");
    

    public OrderMonitorPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateButton() {
        clickElement(createButton);
    }

    public void clickOrderMonitorButton() {
        clickElement(orderMonitorButton);
    }

    public void enterShippingOrderDetails(String number, String taskId, String purchaseOrder, String orderValue, String notes, String transportMethod) {
        type(numberInput, number);
        type(taskIdInput, taskId);
        type(poInput, purchaseOrder);
        type(valueInput, orderValue);
        type(notesInput, notes);
        clickElement(transportDropdown);
        clickElement(By.xpath("//ul[@id='mui-13']//li[normalize-space()='" + transportMethod + "']"));
    }

    public void enterShippingAddressDetails(String name, String address1, String address2, String city,
            String state, String zip, String phone, String email, String country) {
        type(shippingAddressNameInput, name);
        type(shippingAddressAddress1Input, address1);
        type(shippingAddressAddress2Input, address2);
        type(shippingAddressCityInput, city);
        type(shippingAddressStateInput, state);
        type(shippingAddressZipCodeInput, zip);
        type(shippingAddressPhoneInput, phone);
        type(shippingAddressEmailInput, email);
        type(shippingAddressCountryInput, country);
    }

    public void enterBillingAddressDetails(String name, String address1, String address2, String city,
            String state, String zip, String phone, String email, String country) {
        type(billingAddressNameInput, name);
        type(billingAddressAddress1Input, address1);
        type(billingAddressAddress2Input, address2);
        type(billingAddressCityInput, city);
        type(billingAddressStateInput, state);
        type(billingAddressZipCodeInput, zip);
        type(billingAddressPhoneInput, phone);
        type(billingAddressEmailInput, email);
        type(billingAddressCountryInput, country);
    }

    public void clickAddNewOrderLineButton() {
        clickElement(addNewOrderLineButton);
    }

    public void selectSkuOrder() {
        clickElement(skuInput);
        type(skuInput, Keys.ENTER);
        type(skuInput, Keys.ARROW_DOWN);
        type(skuInput, Keys.ENTER);
        type(skuInput, "CS099-CAH");
        type(skuInput, Keys.ENTER);
        type(skuInput, Keys.ARROW_DOWN);
        type(skuInput, Keys.ENTER);
    }

    public void enterPackageQuantity(int quantity) {
        type(packageQtyInput, String.valueOf(quantity));
    }

    public void enterSalesPrice(int price) {
        type(salesPriceInput, String.valueOf(price));
    }

    public void clickSaveButton() {
        clickElement(saveButton);
    }

    public boolean isSuccessMessageDisplayed() {
        return isDisplayed(successMessage);
    }
}
