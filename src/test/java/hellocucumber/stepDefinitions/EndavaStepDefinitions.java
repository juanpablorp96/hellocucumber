package hellocucumber.stepDefinitions;

import com.selenium.training.pages.endava.EndavaHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EndavaStepDefinitions {

    private EndavaHomePage endavaHomePage;

    @Given("I am in the Endava home page")
    public void iAmInTheEndavaHomePage() throws InterruptedException {
        endavaHomePage = new EndavaHomePage(BaseTest.getMyDriver().getWebDriver());
        endavaHomePage.acceptCookies();
    }

    @When("I find a video")
    public void iFindAVideo() throws InterruptedException {
        endavaHomePage.searchVideo();
    }
}
