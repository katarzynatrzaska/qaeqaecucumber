package com.boldareqaecucumber.baseTest;


import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class BasePage {
    private Logger logger = LogManager.getLogger(this.getClass().getName());

    protected WaitHelper waitHelper;
    protected WebElementHelper element;

   // public abstract boolean isPageDisplayed();

    protected Logger log() {
        return logger;
    }
}