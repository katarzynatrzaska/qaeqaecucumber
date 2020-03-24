package com.boldareqaecucumber.stepDefinitions;

import com.boldareqaecucumber.baseTest.TestBase;
import com.boldareqaecucumber.pop.TestProduct1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.boldareqaecucumber.support.Constants.PRODUCT_URL;
import static org.testng.AssertJUnit.assertTrue;

public class AddTestProduct1ToCart extends TestBase {

    TestProduct1 testProduct1 = new TestProduct1(driver);


    @Given("^Customer is on ProductPage$")
    public void asUserAddProductToCart() {
        driver.get(PRODUCT_URL);
    }

    @When("^User clicks on Add To Cart Button under Test Product1$")
    public void userClicksOnAddToCartButton() {
        testProduct1.clickOnAddCartButton();
    }

    @Then("^Success Message is Displayed$")
    public void assertThatAddToCartMessageIsDisplayed() {
        assertTrue(testProduct1.isSuccessMessageDisplayed());
    }

    @Then("^Item and Price is Displayed$")
    public void isItemAndPriceDisplayed() {
        assertTrue(testProduct1.isItemAndPriceDisplayed());
    }

}