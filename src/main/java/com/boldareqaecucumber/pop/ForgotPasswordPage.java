package com.boldareqaecucumber.pop;

import com.boldareqaecucumber.baseTest.BasePage;
import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends BasePage {

    WebDriver driver;

    @FindBy(xpath = "//h2[contains(@class, 'sw-page-subheadline')]")
    private WebElement forgotPasswordHeader;

    @FindBy(xpath = "//button[@class='sw-link-button']")
    private WebElement goBackButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement mailField;

    @FindBy(xpath = "//span[@class='sw-button__label']")
    private WebElement resetButton;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        element = new WebElementHelper(waitHelper, driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return element.isDisplayed(forgotPasswordHeader);
    }

    public void goBack() {
        element.click(goBackButton);
    }

    public void enterMail() {
        element.type(mailField, "alighieri.dante1508@gmail.com");
    }

    public void submitForm() {
        element.click(resetButton);
    }



}
