package com.boldareqaecucumber.support;

import org.openqa.selenium.WebDriver;

public class MailHelper {

    WebDriver driver;

    public MailHelper(WebDriver driver){
        this.driver = driver;
    }

    public void openInbox(String url) {
        driver.get(url);
    }
}
