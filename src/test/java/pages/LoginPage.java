package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final By emailField = By.name("email");
    private static final By passwordField = By.name("password");
    private static final By loginButton = By.xpath("//button[@type='submit']");


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
}
