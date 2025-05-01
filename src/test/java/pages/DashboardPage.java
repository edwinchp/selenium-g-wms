package pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage {
    
    private static final By successMessage = By.xpath("//div[@role='alert' and contains(text(), 'Success Login !')]");


    public boolean isSuccessMessageDisplayed() {
        return isDisplayed(successMessage);
    }
}
