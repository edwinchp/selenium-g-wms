package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.ProductsPage;
import utils.ConfigReader;

public class SwagLabsSteps {

    private LoginPage loginPage = new LoginPage();
    private ProductsPage productsPage = new ProductsPage();

    @Given("the portal is opened in the browser")
    public void iHaveTheBrowserOpenedIn() {
        loginPage.goToLoginPage(ConfigReader.getBaseUrl());
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I can see the Products section")
    public void iCanSeeTheProductsSection() {
        Assert.assertFalse(productsPage.getProductList().isEmpty());
    }

    @And("I add {int} products to cart")
    public void iAddProductsToCart(int productAmount) {
        productsPage.addProductsToCart(productAmount);
    }

    @And("I click cart icon")
    public void iClickCartIcon() {
        loginPage.clickCartIcon();
    }

    @Then("I should see {int} products added")
    public void iShouldSeeProductsAdded(int productAmount) {
        Assert.assertEquals(productAmount, loginPage.getProductsInCart().size());
    }

    @When("I click menu button")
    public void iClickMenuButton() {
        productsPage.clickMenuButton();
    }

    @Then("I should see all menu options")
    public void iShouldSeeAllMenuOptions() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(productsPage.isItemMenuDisplayed("All Items"));
        softAssert.assertTrue(productsPage.isItemMenuDisplayed("About"));
        softAssert.assertTrue(productsPage.isItemMenuDisplayed("Logout"));
        softAssert.assertTrue(productsPage.isItemMenuDisplayed("Reset App State"));
        softAssert.assertAll();
    }

    @When("I enter valid credentials")
    public void IEnterValidCredentials() {
        loginPage.typeUsername(ConfigReader.getUsername());
        loginPage.typePassword(ConfigReader.getPassword());
    }
}
