package com.selenium.training.pages.endava;

import com.selenium.training.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class EndavaHomePage extends BasePage {

    public EndavaHomePage(WebDriver webDriver) {
        super(webDriver);
        webDriver.get("https://www.endava.com/");
    }

    //JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookiesButton;

    @FindBy(className = "play-button")
    private WebElement videoPlayButton;

    @FindBy(className = "vbox-overlay")
    private WebElement youTubeVideo;

    @FindBy(className = "ytp-large-play-button")
    private WebElement youTubePlayButton;

    public void acceptCookies() throws InterruptedException {
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(acceptCookiesButton));
        Thread.sleep(2000);
        acceptCookiesButton.click();
    }

    public void searchVideo() throws InterruptedException {
        //js.executeScript("arguments[0].scrollIntoView();", videoPlayButton);
        moveToElement(videoPlayButton);
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(videoPlayButton));
        videoPlayButton.click();

        getWebDriverWait().until(ExpectedConditions.visibilityOf(youTubeVideo));
        Thread.sleep(3000);
        youTubeVideo.click();
        Thread.sleep(5000);

    }

}
