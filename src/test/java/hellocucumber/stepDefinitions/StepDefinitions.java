package hellocucumber.stepDefinitions;

import com.selenium.training.MyDriver;
import com.selenium.training.pages.ArticlePage;
import com.selenium.training.pages.TalkPage;
import com.selenium.training.pages.WikiHomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import hellocucumber.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.util.List;

public class StepDefinitions {

    private WikiHomePage wikiHomePage;
    private ArticlePage articlePage;
    private TalkPage talkPage;

    MyDriver myDriver;

    @Given("I'm in the wikipedia home page")
    public void todayIsSunday() {
        wikiHomePage = new WikiHomePage(myDriver.getWebDriver());
    }

    @Then("I should see the language links")
    public void iShouldSeeTheLanguageLinks(List<String> languages) {
        Assert.assertTrue(wikiHomePage.isAllLanguages(languages));
    }

    @When("I search {string}")
    public void iAskWhetherItsFridayYet(String text) {
        articlePage = wikiHomePage.search(text);
    }

    @Then("I should see the article title {string}")
    public void iShouldBeTold(String text) {
        Assert.assertEquals(articlePage.getPageTitle(), text);
    }

    @Then("I should see the {string} tab")
    public void iShouldSeeTheTab(String tabName) {
        Assert.assertEquals(articlePage.getTabText(), tabName);
    }

    @When("I click on the Talk tab")
    public void iClickOnTheTalkTab() {
        talkPage = articlePage.clickOnTalkTab();
    }

    @Then("I should see the {string} title")
    public void iShouldSeeTheTitle(String tabTitle) {
        Assert.assertEquals(talkPage.getPageTitle(), tabTitle);
    }

    @Before
    public void beforeSuite(){
        myDriver = new MyDriver("chrome");
    }

    @After
    public void afterSuite(){
        wikiHomePage.dispose();
    }

}
