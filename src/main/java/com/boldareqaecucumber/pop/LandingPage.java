package com.boldareqaecucumber.pop;

import com.boldareqaecucumber.baseTest.BasePage;
import com.boldareqaecucumber.support.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.boldareqaecucumber.support.WaitHelper;


public class LandingPage extends BasePage {

    private WebDriver driver;


    @FindBy(xpath = "//span[contains(text(),'No, I´m a user already')]")
    private WebElement proceedToLoginButton;

    @FindBy(xpath = "//span[contains(text(),'Yes, it´s first time')]")
    private WebElement proceedToRegistrationButton;

    @FindBy(xpath = "//span[contains(.,'Demo')]")
    private WebElement demoButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        element = new WebElementHelper(waitHelper, driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return element.isDisplayed(proceedToLoginButton);
    }

    public void proceedToLoginPage() {
        element.click(proceedToLoginButton);
    }

    public void proceedToRegistrationPage() {
        element.click(proceedToRegistrationButton);
    }

    public void proceedToDemoPage() {
        element.click(demoButton);
    }

}
