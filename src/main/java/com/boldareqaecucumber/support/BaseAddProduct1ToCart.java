package com.boldareqaecucumber.support;

import com.boldareqaecucumber.baseTest.BasePage;
import com.boldareqaecucumber.pop.TestProduct1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.boldareqaecucumber.support.Constants.PRODUCT_URL;

public class BaseAddProduct1ToCart extends BasePage {

WebDriver driver;

    public BaseAddProduct1ToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        element = new WebElementHelper(waitHelper, driver);
    }

    public void baseAddProductToCart() {
        driver.get(PRODUCT_URL);
        TestProduct1 testProduct1 = new TestProduct1(driver);
        testProduct1.clickOnAddCartButton();
        testProduct1.clickOnCartButton();
        testProduct1.clickOnCheckoutButton();
    }

}