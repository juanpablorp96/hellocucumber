package hellocucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        //dryRun = true,
        tags = {"@YouTube"},
        plugin = {"pretty"},
        features = {"./src/test/java/hellocucumber/features"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
