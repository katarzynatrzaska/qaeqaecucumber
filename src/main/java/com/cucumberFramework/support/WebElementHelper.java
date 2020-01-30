package com.cucumberFramework.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementHelper {

    WebDriver driver;
    WaitHelper waitHelper;

    public WebElementHelper(WaitHelper waitHelper, WebDriver driver) {
        this.driver = driver;
        this.waitHelper = waitHelper;
    }

    public boolean hasClass(WebElement element, String saidClass) {
        waitHelper.waitForElement(element);
        String classes = element.getAttribute("class");
        for (String c : classes.split(" ")) {
            if (c.equals(saidClass)) {
                return true;
            }
        }
        return false;
    }

    public void clearFields(WebElement ... elements) {
        for (int i = 0; i < elements.length; i++) {
            waitHelper.waitForElement(elements[i]);
            elements[i].clear();
        }
    }

    public void click(WebElement element) {
        waitHelper.waitForPageLoaded(driver);
        waitHelper.waitForElementToBeClickable(element);
        element.click();
    }

    public void type(WebElement element, String string) {
        waitHelper.waitForPageLoaded(driver);
        waitHelper.waitForElementToBeClickable(element);
        element.clear();
        element.sendKeys(string);
    }

    public boolean isDisplayed(WebElement element) {
        waitHelper.waitForElement(element);
        return element.isDisplayed();
    }

    public boolean isEnabled(WebElement element) {
        waitHelper.waitForPageLoaded(driver);
        return element.isEnabled();
    }
}
