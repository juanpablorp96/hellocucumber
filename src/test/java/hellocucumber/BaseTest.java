package hellocucumber;

import com.selenium.training.MyDriver;
import com.selenium.training.pages.WikiHomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public abstract class BaseTest {

    MyDriver myDriver;

    private WikiHomePage wikiHomePage;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})
    public void beforeSuite(String browser){
        System.out.println("BEFORE----------");
        myDriver = new MyDriver(browser);
        wikiHomePage = new WikiHomePage(myDriver.getWebDriver());
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        wikiHomePage.dispose();
    }

    public WikiHomePage getWikiHomePage(){
        return wikiHomePage;
    }

}
