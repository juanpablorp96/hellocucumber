package hellocucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.cucumber.CucumberWithSerenityRuntime;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //dryRun = true,
        tags = "@YouTube",
        plugin = {"pretty"},
        features = {"./src/test/java/hellocucumber/features"})
public class RunCucumberTest {

}
