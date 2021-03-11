package hellocucumber;

import com.selenium.training.MyDriver;
import com.selenium.training.pages.wikipedia.WikiHomePage;

public abstract class BaseTest {

    MyDriver myDriver;

    private WikiHomePage wikiHomePage;



    public WikiHomePage getWikiHomePage(){
        return wikiHomePage;
    }

}
