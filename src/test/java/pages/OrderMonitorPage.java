package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderMonitorPage extends BasePage {

    private final By orderMonitorButton = By.xpath("//nav//ul//a[contains(.,'Orders Monitor')]");
    private final By createButton = By.xpath("//button[normalize-space()='Create']");

    public OrderMonitorPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateButton() {
        clickElement(createButton);
    }

    public void clickOrderMonitorButton() {
        clickElement(orderMonitorButton);
    }
}
