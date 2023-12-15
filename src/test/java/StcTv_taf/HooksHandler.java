package StcTv_taf;

import StcTv_taf.base.Base;
import StcTv_taf.browser.Browser;
import StcTv_taf.utils.ConfigProperties;
import StcTv_taf.webDriver_handler.WebDriverHandler;
import io.cucumber.java.*;

import java.io.IOException;

public class HooksHandler extends Base {

    @Before()
    public void setUpStcTvWebsite() throws IOException {

        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        configTestData = new ConfigProperties("resources/configTestData.properties");
        configBrowser = new ConfigProperties("resources/configBrowser.properties");
        webDriverHandler.navigateToUrl(configBrowser.getProperty("url"));
    }

    @AfterStep
    public void waitTillVisibiltyOfPage() throws InterruptedException {
        Thread.sleep(150);
    }
    @After()
    public void closeWinjiGoWebsite() {
        webDriverHandler.resetCache();
        webDriverHandler.close();
    }

}
