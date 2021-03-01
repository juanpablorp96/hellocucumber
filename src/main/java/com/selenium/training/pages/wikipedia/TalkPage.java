package com.selenium.training.pages.wikipedia;

import com.selenium.training.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TalkPage extends BasePage {
    public TalkPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "firstHeading")
    private WebElement pageTitle;

    public String getPageTitle(){
        return pageTitle.getText();
    }
}
