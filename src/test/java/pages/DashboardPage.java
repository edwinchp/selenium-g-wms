package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    
    private static final By successMessage = By.xpath("//div[@role='alert' and contains(text(), 'Success Login !')]");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSuccessMessageDisplayed() {
        return isDisplayed(successMessage);
    }
}
