package com.boldareqaecucumber.pop;

import com.boldareqaecucumber.baseTest.BasePage;
import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsBar extends BasePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
    private WebElement desktopsLink;

    public ProductsBar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        element = new WebElementHelper(waitHelper, driver);
    }

    public DesktopsPage clickOnDesktopsPage() {
        element.click(desktopsLink);
        return new DesktopsPage(driver);

    }
}
