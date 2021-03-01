package com.selenium.training.pages.wikipedia;

import com.selenium.training.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class WikiHomePage extends BasePage {

    public WikiHomePage(WebDriver webDriver) {
        super(webDriver);
        webDriver.get("http://wikipedia.org");
    }

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(className = "pure-button-primary-progressive")
    private WebElement searchButton;

    @FindBy(className = "link-box")
    private List<WebElement> languageLinks;

    public ArticlePage search(String text){
        searchInput.sendKeys(text);
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
        return new ArticlePage(getWebDriver());
    }

    public boolean isAllLanguages(List<String> expectedLanguages){
        List<String> languageLinkTexts = languageLinks.stream().map(x -> x.findElement(By.cssSelector("strong")).getText()).collect(Collectors.toList());
        return languageLinkTexts.containsAll(expectedLanguages);
    }
}
