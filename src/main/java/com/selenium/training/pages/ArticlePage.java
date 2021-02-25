package com.selenium.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ArticlePage extends BasePage{

    public ArticlePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "firstHeading")
    private WebElement pageTitle;

    @FindBy(id = "ca-talk")
    private WebElement talkTab;

    public String getPageTitle(){
        return pageTitle.getText();
    }

    public String getTabText(){
        return talkTab.getText();
    }

    public TalkPage clickOnTalkTab(){
        talkTab.click();
        return new TalkPage(getWebDriver());
    }
}
