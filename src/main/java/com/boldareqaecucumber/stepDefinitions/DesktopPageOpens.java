package com.boldareqaecucumber.stepDefinitions;

import com.boldareqaecucumber.baseTest.TestBase;
import com.boldareqaecucumber.pop.DesktopsPage;
import com.boldareqaecucumber.pop.ProductsBar;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.AssertJUnit.assertTrue;

public class DesktopPageOpens extends TestBase {

    ProductsBar productsBar = new ProductsBar(driver);
    DesktopsPage desktopsPage = new DesktopsPage(driver);


    @When("^user clicks on Desktops Page$")
    public void asUserOpensDesktopsPage() {
        productsBar.clickOnDesktopsPage();

    }

    @Then("^user sees a correct Header name$")
    public void userSeeHeaderName() {
        assertTrue(desktopsPage.isHeaderDisplayed());

    }
}