package hellocucumber.stepDefinitions;

import com.selenium.training.pages.youtube.VideoPage;
import com.selenium.training.pages.youtube.YouTubeHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class YouTubeStepDefinitions {

    private YouTubeHomePage youTubeHomePage;
    private VideoPage videoPage;

    @Given("I am in the YouTube home page")
    public void iAmInTheYouTubeHomePage() {
        youTubeHomePage = new YouTubeHomePage(BaseTest.getMyDriver().getWebDriver());
    }

    @Then("I should see the following elements under best of YouTube section")
    public void iShouldSeeTheFollowingElementsUnderBestOfYouTubeSection(List<String> items) {
        Assert.assertTrue(youTubeHomePage.isExpectedSectionItems(items));
    }

    @When("I open a video")
    public void iOpenAVideo() throws InterruptedException {
        videoPage = youTubeHomePage.openVideo();
    }

    @When("I skip the video ad")
    public void iSkipTheVideoAd() {
        videoPage.skipAd();
    }

    @Then("I should see the video playing")
    public void iShouldSeeTheVideoPlaying() {
        videoPage.isVideoPlaying();
    }

    @When("I pause the video in time {string}")
    public void iPauseTheVideoInTime(String time) {
        videoPage.pauseVideoAtTime(time);
    }

    @Then("I should see the play button")
    public void iShouldSeeThePlayButton() {
        videoPage.seePlayButton();
    }
}
