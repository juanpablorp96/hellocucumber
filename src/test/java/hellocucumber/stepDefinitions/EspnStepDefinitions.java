package hellocucumber.stepDefinitions;

import com.selenium.training.MyDriver;
import com.selenium.training.pages.espn.EspnHomePage;
import cucumber.api.java.en.Given;

public class EspnStepDefinitions {

    private EspnHomePage espnHomePage;

    MyDriver myDriver;

    @Given("I am in the ESPN home page")
    public void iAmInTheESPNHomePage() {
        espnHomePage = new EspnHomePage(myDriver.getWebDriver());
    }


}
