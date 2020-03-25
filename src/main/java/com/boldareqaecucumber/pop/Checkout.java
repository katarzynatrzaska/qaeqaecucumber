package com.boldareqaecucumber.pop;

import com.boldareqaecucumber.baseTest.BasePage;
import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Checkout extends BasePage {

    WebDriver driver;

    @FindBy(css = "input[name='agree']")
    private WebElement termsAndConditions;

    @FindBy(css = "input[value='register']")
    private WebElement registerAccountRadio;

    @FindBy(css = "input[value='guest']")
    private WebElement guestCheckoutRadio;

    @FindBy(id = "button-account")
    WebElement continueButton;

    @FindBy(id = "input-payment-firstname")
    public WebElement firstNameField;

    @FindBy(id = "input-payment-lastname")
    private WebElement lastNameField;

    @FindBy(id = "input-payment-telephone")
    private WebElement telephoneField;

    @FindBy(id = "input-payment-email")
    private WebElement emailField;

    @FindBy(id = "input-payment-company")
    private WebElement companyField;

    @FindBy(id = "input-payment-address-1")
    private WebElement address1Field;

    @FindBy(id = "input-payment-address-2")
    private WebElement address2Field;

    @FindBy(id = "input-payment-city")
    private WebElement cityField;

    @FindBy(id = "input-payment-postcode")
    private WebElement postCodeField;

    @FindBy(id = "input-payment-country")
    private WebElement countryDropdown;

    @FindBy(id = "input-payment-zone")
    private WebElement regionSelect;

    @FindBy(id = "button-guest")
    private WebElement submitGuestButton;

    @FindBy(xpath = "//*[@id='accordion']/div[2]/div[1]/h4")
    private WebElement step2Panel;

    @FindBy(xpath = "//*[@id='input-shipping-firstname']")
    private WebElement shippingFirstName;

    @FindBy(id = "input-shipping-lastname")
    private WebElement shippingLastName;

    @FindBy(id = "input-shipping-company")
    private WebElement shippingCompanyName;

    @FindBy(id = "input-shipping-address-1")
    private WebElement shippingAddress1;

    @FindBy(id = "id=input-shipping-address-2")
    private WebElement shippingAddress2;

    @FindBy(id = "input-shipping-city")
    private WebElement shippingCity;

    @FindBy(id = "input-shipping-postcode")
    private WebElement shippingPostCode;

    @FindBy(id = "input-shipping-country")
    private WebElement shippingCountry;

    @FindBy(id = "input-shipping-zone")
    private WebElement shippingRegion;

    @FindBy(xpath = "//*[@id='accordion']/div[3]/div[1]/h4/a")
    private WebElement step3Panel;

    @FindBy(xpath = "//*[@id='collapse-shipping-method']/div/p[1]")
    private WebElement deliveryMethodStatement;

    @FindBy(xpath = "//*[@id='collapse-shipping-method']/div/p[4]/textarea")
    private WebElement deliveryMethodCommentInput;

    @FindBy(id = "button-shipping-method")
    private WebElement continueButtonAfterDeliveryMethod;

    @FindBy(id = "button-guest-shipping")
    private WebElement continueButtonAfterDeliveryDetails;

    @FindBy(xpath = "*[@id='collapse-payment-method']/div/p[3]/textarea")
    private WebElement deliveryPaymentCommentInput;

    @FindBy(id = "button-payment-method")
    private WebElement continueButtonAfterPaymentMethod;

    @FindBy(xpath = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table")
    private WebElement summaryTable;


    public Checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        element = new WebElementHelper(waitHelper, driver);
    }

    public void assertThatSummaryHasCorrectDetails() {
        waitHelper.waitForElement(summaryTable);
        summaryTable.isDisplayed();
        String expectedSummary = "Product Name Model Quantity Unit Price Total\n" +
                "Test product 1 Product 1 2 $10,000.00 $20,000.00\n" +
                "Sub-Total: $20,000.00\n" +
                "Flat Shipping Rate: $5.00\n" +
                "Total: $20,005.00";
        String summary = summaryTable.getText();
        Assert.assertEquals(summary, expectedSummary);
    }

    public void clickOnContinueButtonAfterDeliveryDetails() {
        element.click(continueButtonAfterDeliveryDetails);
    }

    public void clickOnContinueButtonAfterPaymentMethod() {
        element.click(continueButtonAfterPaymentMethod);
    }

    public void typeIntoDeliveryMethodCommentInput(String preferredShippingMethod) {
        element.type(deliveryMethodCommentInput, preferredShippingMethod);
    }

    public void agreeToTermsAndConditions() {
        element.click(termsAndConditions);
    }

    public void clickOnContinueButtonAfterDeliveryMethod() {
        waitHelper.waitForElement(continueButtonAfterDeliveryMethod);
        element.click(continueButtonAfterDeliveryMethod);
    }

    public void assertThatDeliveryMethodHasStatement() {
        deliveryMethodStatement.isDisplayed();
        String expectedStatement = "Please select the preferred shipping method to use on this order.";
        String statement = deliveryMethodStatement.getText();
        Assert.assertEquals(statement, expectedStatement);
    }

    public void assertThatPaymentTextAreaHasText() {
        deliveryPaymentCommentInput.isDisplayed();
        String expectedText = " This is a test comment in the Order Comments";
        String text = deliveryPaymentCommentInput.getText();
        Assert.assertEquals(text, expectedText);
    }

    public void clickOnDeliveryDetails() {
        element.click(step3Panel);
    }

    public void assertThatStep2PanelHasBillingDetailsText() {
        step2Panel.isDisplayed();
        String expectedStep2Panel = "Step 2: Billing Details";
        String message = step2Panel.getText();
        Assert.assertEquals(message, expectedStep2Panel);
    }


    public void typeIntoFirstNameField(String firstName) {
        element.type(firstNameField, firstName);
    }

    public void typeIntoLastNameField(String lastName) {
        element.type(lastNameField, lastName);
    }

    public void typeIntoEmailField(String email) {
        element.type(emailField, email);
    }

    public void typeIntoTelephoneField(String telephone) {
        element.type(telephoneField, telephone);
    }

    public void typeIntoCompanyField(String company) {
        element.type(companyField, company);
    }

    public void typeIntoAddress1Field(String address1) {
        element.type(address1Field, address1);
    }

    public void typeIntoAddress2Field(String address2) {
        element.type(address2Field, address2);
    }

    public void typeIntoCityField(String city) {
        element.type(cityField, city);
    }

    public void typeIntoPostCodeField(String postCode) {
        element.type(postCodeField, postCode);
    }

    public void selectValueFromCountryDropdown(String country) {
        Select countryList = new Select(countryDropdown);
        countryList.selectByVisibleText(country);
    }

    public void selectGuestRadioButton() {
        element.click(guestCheckoutRadio);
    }

    public void selectValueFromRegionDropdown(String region) {
        Select regionList = new Select(regionSelect);
        regionList.selectByVisibleText(region);
    }

    public void clickContinueButtonInBillingInfo() {
        element.click(submitGuestButton);
    }

    public void pressContinueButtonUnderCostumerOptions() {
        element.click(continueButton);
    }

}

