package com.selenium.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WikiHomePage extends BasePage{

    public WikiHomePage(WebDriver webDriver) {
        super(webDriver);
        webDriver.get("http://wikipedia.org");
    }

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(className = "pure-button-primary-progressive")
    private WebElement searchButton;

    public ArticlePage search(String text){
        searchInput.sendKeys(text);
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
        return new ArticlePage(getWebDriver());
    }
}
