package com.boldareqaecucumber.baseTest;


import com.boldareqaecucumber.support.WaitHelper;
import com.boldareqaecucumber.support.WebElementHelper;

public abstract class BasePage {

    protected WaitHelper waitHelper;
    protected WebElementHelper element;

    public abstract boolean isPageDisplayed();
}
