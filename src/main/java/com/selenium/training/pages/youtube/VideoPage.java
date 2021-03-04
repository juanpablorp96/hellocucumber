package com.selenium.training.pages.youtube;

import com.selenium.training.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VideoPage extends BasePage {

    public VideoPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(className = "ytp-ad-skip-button")
    private WebElement skipAdButton;

    @FindBy(className = "ytp-time-current")
    private WebElement currentTime;

    @FindBy(className = "video-stream")
    private WebElement videoContainer;

    @FindBy(className = "ytp-play-button")
    private WebElement playButton;


    public void skipAd() {
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(skipAdButton));
        skipAdButton.click();
    }

    public void isVideoPlaying() {
        getWebDriverWait().until(ExpectedConditions.invisibilityOfElementLocated(By.className("ytp-ad-text")));
    }

    public void pauseVideoAtTime(String time) {
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(currentTime, time));
        videoContainer.click();
    }

    public void seePlayButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(playButton));
    }
}
