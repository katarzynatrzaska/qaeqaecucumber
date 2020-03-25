package com.boldareqaecucumber.stepDefinitions;

import com.boldareqaecucumber.baseTest.TestBase;
import com.boldareqaecucumber.pop.Checkout;
import com.boldareqaecucumber.support.BaseAddProduct1ToCart;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.AssertJUnit.assertTrue;

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
}




    /* @When("^User press Continue Button under Customer Options$")
   public void user_press_Continue_Button_under_Customer_Options() {

    }

    @When("^types \"([^\"]*)\" in the the first name Field$")
    public void types_in_the_the_first_name_Field(String arg1) {

    }

    @When("^types \"([^\"]*)\" in the Last name Field$")
    public void types_in_the_Last_name_Field(String arg1) throws Throwable {

    }

    @When("^types \"([^\"]*)\" in Email Field$")
    public void types_in_Email_Field(String arg1) throws Throwable {


        @When("^types \"([^\"]*)\" in Mobile No\\. Field$")
        public void types_in_Mobile_No_Field (String arg1) throws Throwable {

        }

        @When("^types \"([^\"]*)\" in Company Field$")
        public void types_in_Company_Field (String arg1) throws Throwable {

        }

        @When("^types \"([^\"]*)\" in Address(\\d+) Field$")
        public void types_in_Address_Field (String arg1,int arg2) throws Throwable {


            @When("^types \"([^\"]*)\" in City Field$")
            public void types_in_City_Field (String arg1) throws Throwable {

            }

            @When("^types \"([^\"]*)\" in ZIP Code Field$")
            public void types_in_ZIP_Code_Field (String arg1) throws Throwable {

            }

            @When("^selects \"([^\"]*)\" from Country Field$")
            public void selects_from_Country_Field (String arg1) throws Throwable {

            }

            @When("^selects \"([^\"]*)\" from Region Field$")
            public void selects_from_Region_Field (String arg1) throws Throwable {

            }

            @When("^User clicks on Continue Button$")
            public void user_clicks_on_Continue_Button () throws Throwable {

            }

            @When("^User clicks on Delivery Details$")
            public void user_clicks_on_Delivery_Details () throws Throwable {

            }

            @Then("^Delivery Method statement has correct Text$")
            public void delivery_Method_statement_has_correct_Text () throws Throwable {

            }

            @When("^User clicks on Continue Button after Delivery Details$")
            public void user_clicks_on_Continue_Button_after_Delivery_Details () throws Throwable {

            }

            @When("^types \"([^\"]*)\"$")
            public void types (String arg1) throws Throwable {

            }

            @When("^clicks on Continue Button after Delivery Method$")
            public void clicks_on_Continue_Button_after_Delivery_Method () throws Throwable {

            }

            @Then("^Text in the Payment area is \"([^\"]*)\"$")
            public void text_in_the_Payment_area_is (String arg1) throws Throwable {

            }

            @When("^user user agrees to Terms & Conditions$")
            public void user_user_agrees_to_Terms_Conditions () throws Throwable {

            }

            @When("^clicks on Continue Button after Payment Method$")
            public void clicks_on_Continue_Button_after_Payment_Method () throws Throwable {

            }

            @Then("^user sees correct order summary$")
            public void user_sees_correct_order_summary () throws Throwable {

            }

        }
        */
