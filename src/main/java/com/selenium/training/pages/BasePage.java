package com.selenium.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public BasePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 10);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public WebDriverWait getWebDriverWait(){
        return webDriverWait;
    }

    public void dispose(){
        if(webDriver != null){
            webDriver.quit();
        }
    }
}
