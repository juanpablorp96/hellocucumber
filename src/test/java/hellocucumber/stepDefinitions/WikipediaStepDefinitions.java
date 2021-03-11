package hellocucumber.stepDefinitions;

import com.selenium.training.pages.wikipedia.ArticlePage;
import com.selenium.training.pages.wikipedia.TalkPage;
import com.selenium.training.pages.wikipedia.WikiHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class WikipediaStepDefinitions {

    private WikiHomePage wikiHomePage;
    private ArticlePage articlePage;
    private TalkPage talkPage;


    @Given("I am in the wikipedia home page")
    public void iAmInTheWikipediaHomePage() {
        wikiHomePage = new WikiHomePage(BaseTest.getMyDriver().getWebDriver());
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


}
