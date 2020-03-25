package com.boldareqaecucumber.stepDefinitions;

import com.boldareqaecucumber.baseTest.TestBase;
import com.boldareqaecucumber.pop.Checkout;
import com.boldareqaecucumber.support.BaseAddProduct1ToCart;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GuestCheckoutProcedure extends TestBase {

    BaseAddProduct1ToCart baseAddProduct1ToCart = new BaseAddProduct1ToCart(driver);
    Checkout checkout = new Checkout(driver);

    @Given("^a User adds a product to cart$")
    public void userAddsProductToCart() {
        baseAddProduct1ToCart.baseAddProductToCart();
    }

    @When("^User selects Guest Radio Button$")
    public void userSelectsGuestRadioButton() {
        checkout.selectGuestRadioButton();
    }

    @Then("^Step Billing Details bar has correct Text$")
    public void checkIfBillingDetailsHasCorrectText() {
        checkout.assertThatStep2PanelHasBillingDetailsText();
    }

    @When("^User press Continue Button under Customer Options$")
    public void userPressContinueButtonnderCustomerOptions() {
        checkout.pressContinueButtonUnderCostumerOptions();
    }

    @When("^types \"([^\"]*)\" in the the first name Field$")
    public void fillInFirstName(String firstName) {
        checkout.typeIntoFirstNameField(firstName);
    }

    @When("^types \"([^\"]*)\" in the Last name Field$")
    public void fillInLastName(String lastName) {
        checkout.typeIntoLastNameField(lastName);
    }

    @When("^types \"([^\"]*)\" in Email Field$")
    public void fillInEmail(String email) {
        checkout.typeIntoEmailField(email);
    }

    @When("^types \"([^\"]*)\" in Mobile No\\. Field$")
    public void fillInTelephoneNo(String telephoneNo) {
        checkout.typeIntoTelephoneField(telephoneNo);
    }

    @When("^types \"([^\"]*)\" in Company Field$")
    public void fillInCompany(String companyName) {
        checkout.typeIntoCompanyField(companyName);
    }

    @When("^types \"([^\"]*)\" in Address first line Field$")
    public void fillInAddress1(String address1) {
        checkout.typeIntoAddress1Field(address1);
    }

    @When("^types \"([^\"]*)\" in Address second line Field$")
    public void fillInAddress2(String address2) {
        checkout.typeIntoAddress2Field(address2);
    }

    @When("^types \"([^\"]*)\" in City Field$")
    public void fillInCityField(String city) {
        checkout.typeIntoCityField(city);
    }

    @When("^types \"([^\"]*)\" in ZIP Code Field$")
    public void fillInZIPCode(String ZIPCode) {
        checkout.typeIntoPostCodeField(ZIPCode);
    }

    @When("^selects \"([^\"]*)\" from Country Field$")
    public void selectCountry(String country) {
        checkout.selectValueFromCountryDropdown(country);
    }

    @When("^selects \"([^\"]*)\" from Region Field$")
    public void selectRegion(String region) {
        checkout.selectValueFromRegionDropdown(region);
    }

    @When("^User clicks on Continue Button$")
    public void clickOnContinueButton() {
        checkout.clickContinueButtonInBillingInfo();
    }

    @When("^User clicks on Delivery Details$")
    public void clickOnDeliveryDetails() {
        checkout.clickOnDeliveryDetails();
    }

    @Then("^Delivery Method statement has correct Text$")
    public void assertThatDeliveryMethodStatementIsCorrect() {
        checkout.assertThatDeliveryMethodHasStatement();
    }

    @When("^User clicks on Continue Button after Delivery Details$")
    public void clickOnContinueButtonAfterDeliveryDetails() {
        checkout.clickOnContinueButtonAfterDeliveryDetails();
    }

    @When("^types \"([^\"]*)\"$")
    public void userTypesDeliveryMethodComment(String deliveryMethodComment) {
        checkout.typeIntoDeliveryMethodCommentInput(deliveryMethodComment);
    }

    @When("^clicks on Continue Button after Delivery Method$")
    public void clickContinueButtonAfterDeliveryMethod() {
        checkout.clickOnContinueButtonAfterDeliveryMethod();
    }

    @When("^user user agrees to Terms & Conditions$")
    public void checkTermsAndConditions() {
        checkout.agreeToTermsAndConditions();
    }

    @When("^clicks on Continue Button after Payment Method$")
    public void clickOnContinueButtonAfterPaymentMethod() {
        checkout.clickOnContinueButtonAfterPaymentMethod();
    }

    @Then("^user sees correct order summary$")
    public void assertSummary() {
        checkout.assertThatSummaryHasCorrectDetails();

    }

}

