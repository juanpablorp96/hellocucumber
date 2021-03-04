package com.selenium.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    private final WebDriver webDriver;
    private final WebDriverWait webDriverWait;
    private final Actions actionsBuilder;

    public BasePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 20);
        actionsBuilder = new Actions(getWebDriver());
        this.webDriver.manage().window().maximize();
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public WebDriverWait getWebDriverWait(){
        return webDriverWait;
    }

    public void moveToElement(WebElement element){
        Action scroll = actionsBuilder.moveToElement(element).build();
        scroll.perform();
    }

}
