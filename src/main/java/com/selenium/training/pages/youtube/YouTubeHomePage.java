package com.selenium.training.pages.youtube;

import com.selenium.training.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class YouTubeHomePage extends BasePage {

    public YouTubeHomePage(WebDriver webDriver) {
        super(webDriver);
        webDriver.get("https://www.youtube.com/");
    }

    @FindBy(css = "ytd-guide-section-renderer.style-scope")
    private List<WebElement> sections;

    @FindBy(id = "contents")
    private WebElement videoItemsContainer;

    public boolean isExpectedSectionItems(List<String> expectedItems){
        List<WebElement> bestOfYouTubeSection = sections.stream()
                .filter(x -> x.findElement(By.id("guide-section-title")).getText().equals("BEST OF YOUTUBE"))
                .collect(Collectors.toList());
        List<String> items = bestOfYouTubeSection.get(0).findElements(By.id("endpoint")).stream().map(WebElement::getText).collect(Collectors.toList());
        return items.containsAll(expectedItems);
    }

    public VideoPage openVideo() throws InterruptedException {
        List<WebElement> videoItems = videoItemsContainer.findElements(By.id("content"));
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(videoItems.get(0)));
        System.out.println(videoItems.get(0).getText());
        videoItems.get(0).click();


        Thread.sleep(5000);
        return new VideoPage(getWebDriver());
    }
}
