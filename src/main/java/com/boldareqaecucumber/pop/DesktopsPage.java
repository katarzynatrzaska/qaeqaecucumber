package com.boldareqaecucumber.pop;

import com.boldareqaecucumber.baseTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;
import org.openqa.selenium.support.PageFactory;


public class DesktopsPage extends BasePage {

    WebDriver driver;


    @FindBy(linkText = "Test product 1")
    private WebElement testProduct1Link;

    @FindBy(xpath = "//*[@id='content']/h2")
    private WebElement desktopsHeader;

    @FindBy(xpath = "//h2[contains(text(),\"Desktops\")]")
    private WebElement desktopsHeaderName;

    public DesktopsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        element = new WebElementHelper(waitHelper, driver);
    }

    public DesktopsPage clickOnTestProduct1() {
        element.click(testProduct1Link);
        log().info("Clicked on Tested product link");
        return this;
    }


    public boolean isHeaderDisplayed() {
        return element.isDisplayed(desktopsHeaderName);
    }

}



