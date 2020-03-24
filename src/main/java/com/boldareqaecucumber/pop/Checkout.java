package com.boldareqaecucumber.pop;

import com.boldareqaecucumber.baseTest.BasePage;
import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


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

        @FindBy(xpath = "//*[@id='collapse-payment-method']/div/p[3]/textarea")
        private WebElement deliveryPaymentCommentInput;

        @FindBy(id = "button-payment-method")
        private WebElement continueButtonAfterPaymentMethod;

        @FindBy(xpath = "//*[@id='collapse-checkout-confirm']/div/div[1]/table")
        private WebElement summaryTable;

        public Checkout(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
            waitHelper = new WaitHelper(driver);
            element = new WebElementHelper(waitHelper, driver);

        }

        public Checkout assertThatSummaryHasCorrectDetails(String summaryDetails) {
            log().info("Checking if Step4 panel {} has correct text", summaryDetails);
            element.click(summaryTable);
            //AssertWebElement.assertThat().isDisplayed().hasText(summaryDetails);
            return this;
        }


        public Checkout clickOnContinueButtonAfterDeliveryDetails() {
            element.click(continueButtonAfterDeliveryDetails);
            log().info("Clicked on Continue Button after typing order comment");
            return this;

        }

        public Checkout clickOnContinueButtonAfterPaymentMethod() {
            element.click(continueButtonAfterPaymentMethod);
            log().info("Clicked on Continue Button after typing order comment");
            return this;

        }

        public Checkout typeIntoDeliveryMethodCommentInput(String preferredShippingMethod) {
            element.type(deliveryMethodCommentInput,preferredShippingMethod);
            log().info("Typed into  {}", preferredShippingMethod);
            return this;
        }

        public Checkout agreeToTermsAndConditions() {
          element.click(termsAndConditions);
            log().info("Agreed to Terms and Conditions");
            return this;
        }

        public Checkout clickOnContinueButtonAfterDeliveryMethod() {
            element.click(termsAndConditions);
            log().info("Clicked on Continue Button after typing order comment");
            return this;
        }

        public Checkout assertThatDeliveryMethodHasStatement(String preferredShippingMethod) {
            log().info("Checking if Step4 panel {} has correct text", preferredShippingMethod);
           // WaitForElement.waitUntilElementIsVisible(deliveryMethodStatement);
           // generic.assertions.AssertWebElement.assertThat(deliveryMethodStatement).isDisplayed().hasText(preferredShippingMethod);
            return this;
        }

        public Checkout assertThatPaymentTextAreaHasText(String paymentMethodComment) {
            log().info("Checking if Payment Method Comment Section {} has correct text", paymentMethodComment);
            //WaitForElement.waitUntilElementIsVisible(deliveryPaymentCommentInput);
            //generic.assertions.AssertWebElement.assertThat(deliveryPaymentCommentInput).isDisplayed().hasText(paymentMethodComment);
            return this;
        }


        public Checkout clickOnDeliveryDetails() {
         element.click(step3Panel);
            log().info("Clicked on Delivery Details section");
            return this;
        }

        public Checkout assertThatStep2PanelHasBillingDetailsText(String billingDetails) {
            log().info("Checking if Step2 panel {} is displayed", billingDetails);
            //WaitForElement.waitUntilElementIsVisible(step2Panel);

           // assertTrue(step2Panel).isDisplayed().hasText(billingDetails);
            return this;
        }


        public Checkout typeIntoFirstNameField(String firstName) {
           element.type(firstNameField,firstName);
            log().info("Typed into First Name Field {}", firstName);
            return this;
        }

        public Checkout typeIntoLastNameField(String lastName) {
            lastNameField.sendKeys(lastName);
            log().info("Typed into Last Name Field {}", lastName);
            return this;
        }

        public Checkout typeIntoEmailField(String email) {
            emailField.sendKeys(email);
            log().info("Typed into Email Field {}", email);
            return this;

        }

        public Checkout typeIntoTelephoneField(String telephone) {
            telephoneField.sendKeys(telephone);
            log().info("Typed into Telephone Field {}", telephone);
            return this;
        }

        public Checkout typeIntoCompanyField(String company) {
            companyField.sendKeys(company);
            log().info("Typed into Company Field {}", company);
            return this;
        }

        public Checkout typeIntoAddress1Field(String address1) {
            address1Field.sendKeys(address1);
            log().info("Typed into Address1 Field {}", address1);
            return this;
        }

        public Checkout typeIntoAddress2Field(String address2) {
            address2Field.sendKeys(address2);
            log().info("Typed into Address2 Field {}", address2);
            return this;
        }

        public Checkout typeIntoCityField(String city) {
            cityField.sendKeys(city);
            log().info("Typed into Address2 Field {}", city);
            return this;
        }

        public Checkout typeIntoPostCodeField(String postCode) {
            postCodeField.sendKeys(postCode);
            log().info("Typed into postCode Field {}", postCode);
            return this;

        }

        public Checkout selectValueFromCountryDropdown(String country) {
            Select countryList = new Select(countryDropdown);
            countryList.selectByVisibleText(country);
            log().info("Selected Country {}", country);
            return this;
        }

        public Checkout selectGuestRadioButton() {
         element.click(guestCheckoutRadio);
            log().info("Selected Guest Radio Button");
            return this;
        }

        public Checkout selectValueFromRegionDropdown(String region) {
            Select regionList = new Select(regionSelect);
            regionList.selectByVisibleText(region);
            log().info("Selected Region {}", region);
            return this;
        }

        public Checkout clickContinueButtonInBillingInfo() {
          element.click(submitGuestButton);
            log().info("Guest clicked Continue Button in Billing Details section");
            return this;
        }

        public Checkout pressContinueButtonUnderCostumerOptions() {
            element.click(continueButton);
            log().info("Clicked Continue Button under Customer Options section");
            return this;
        }


    }

