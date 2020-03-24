package com.boldareqaecucumber.pop;

import com.boldareqaecucumber.baseTest.BasePage;
import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestProduct1 extends BasePage {

    WebDriver driver;

    @FindBy(xpath = "html/body/div[2]/div[1]")
    private WebElement successMessage;

    @FindBy(xpath = "//*[contains(text(),'2 item(s) - $20,000.00')]")
    private WebElement successMessageDisplayed;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;

    @FindBy(linkText = "Test product 1")
    public WebElement product1link;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/button")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@id='cart']/ul/li[2]/div/p/a[2]")
    public WebElement checkOutButton;


    public TestProduct1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        element = new WebElementHelper(waitHelper, driver);
    }

    public boolean isItemAndPriceDisplayed() {
        return element.isDisplayed(successMessageDisplayed);
    }

    public void clickOnAddCartButton() {
        element.click(addToCartButton);
    }

    public boolean isSuccessMessageDisplayed() {
        return element.isDisplayed(successMessage);
    }
}
