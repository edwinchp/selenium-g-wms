package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private static final By emailField = By.name("email");
    private static final By passwordField = By.name("password");
    private static final By loginButton = By.xpath("//button[@type='submit']");
    private static final By errorLoginMessage = By.xpath("//div[@role='alert' and contains(text(), 'Email or password is invalid!')]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage(String url) {
        navigateTo(url);
    }

    public void typeEmail(String email) {
        type(emailField, email);
    }

    public void typePassword(String password) {
        type(passwordField, password);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public boolean isErrorMessageDisplayed() {
        return isDisplayed(errorLoginMessage);
    }
}
