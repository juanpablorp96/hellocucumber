package hellocucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        //dryRun = true,
        tags = {"@Endava"},
        plugin = {"pretty"},
        features = {"./src/test/java/hellocucumber/features"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
