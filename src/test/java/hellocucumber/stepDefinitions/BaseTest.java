package hellocucumber.stepDefinitions;

import com.selenium.training.MyDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest {

    private static MyDriver myDriver;

    @Before
    public void beforeSuite(){
        myDriver = new MyDriver("chrome");
    }

    @After
    public void afterSuite(Scenario scenario){
        System.out.println(scenario.getId());
        System.out.println(scenario.getLines());
        System.out.println(scenario.getStatus());
        System.out.println(scenario.getName());
        System.out.println(scenario.getSourceTagNames());

        if(myDriver != null){
            myDriver.getWebDriver().quit();
        }
    }

    public static MyDriver getMyDriver() {
        return myDriver;
    }
}
