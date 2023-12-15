package StcTv_taf.browser;

import StcTv_taf.StcTvWebsite;
import org.openqa.selenium.WebElement;

public class Browser {

    public StcTvWebsite stcTvWebsite;

    public Browser(){
        stcTvWebsite = new StcTvWebsite();
    }

    public boolean elementIsDisplayed (WebElement element)
    {
        try{
            return element.isDisplayed();
        }catch (Exception e) {
            return false;
        }
    }


}
