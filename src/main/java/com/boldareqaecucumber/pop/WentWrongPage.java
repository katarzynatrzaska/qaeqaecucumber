package com.boldareqaecucumber.pop;

import com.boldareqaecucumber.baseTest.BasePage;
import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WentWrongPage extends BasePage {

    WebDriver driver;

    @FindBy(xpath = "//h2[contains(@class, 'sw-page-subheadline')]")
    private WebElement wenWrongHeader;

    @FindBy(xpath = "//button[@class='sw-link-button']")
    private WebElement toLoginButton;

    public WentWrongPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        element = new WebElementHelper(waitHelper, driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return element.isDisplayed(wenWrongHeader);
    }

    public void goToLogin() {
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
        element.click(toLoginButton);
    }
}
