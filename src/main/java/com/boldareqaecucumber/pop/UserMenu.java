package com.boldareqaecucumber.pop;

import com.boldareqaecucumber.baseTest.BasePage;
import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMenu extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Log out')]")
    private WebElement logoutButton;

    public UserMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        element = new WebElementHelper(waitHelper, driver);
    }

    public void logOut() {
        element.click(logoutButton);
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }
}
