package steps;

import org.testng.Assert;

import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
import utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private final WebDriver driver = DriverManager.getDriver();
    private final LoginPage loginPage = new LoginPage(driver);
    private final DashboardPage dashboardPage = new DashboardPage(driver);

    @Given("the portal is opened in the browser")
    public void iHaveTheBrowserOpenedIn() {
        loginPage.goToLoginPage(ConfigReader.getBaseUrl());
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        loginPage.typeEmail(ConfigReader.getUsername());
        loginPage.typePassword(ConfigReader.getPassword());
    }

    @Then("I can see the success login message")
    public void iCanSeeTheSuccessLoginMessage() {
        Assert.assertTrue(dashboardPage.isSuccessMessageDisplayed());
    }

    @When("I enter invalid credentials")
    public void iEnterInvalidCredentials() {
        loginPage.typeEmail(ConfigReader.getUsername());
        loginPage.typePassword(" wrongpassword");
    }
}
