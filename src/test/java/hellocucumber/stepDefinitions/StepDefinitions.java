package hellocucumber.stepDefinitions;

import com.selenium.training.MyDriver;
import com.selenium.training.pages.ArticlePage;
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

public class StepDefinitions {

    private WikiHomePage wikiHomePage;
    private ArticlePage articlePage;

    MyDriver myDriver;

    @Given("I'm in the wikipedia home page")
    public void today_is_Sunday() {
        wikiHomePage = new WikiHomePage(myDriver.getWebDriver());
    }

    @When("I search {string}")
    public void i_ask_whether_it_s_Friday_yet(String text) {
        articlePage = wikiHomePage.search(text);
    }

    @Then("I should see the article title {string}")
    public void i_should_be_told(String text) {
        Assert.assertEquals(articlePage.getPageTitle(), text);
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
