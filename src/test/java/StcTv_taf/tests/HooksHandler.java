package StcTv_taf.tests;

import StcTv_taf.base.Base;
import StcTv_taf.browser.Browser;
import StcTv_taf.utils.ConfigProperties;
import StcTv_taf.webDriver_handler.WebDriverHandler;
import io.cucumber.java.*;

import java.io.IOException;

public class HooksHandler extends Base {

    @Before()
    public void setUpStcTvWebsite() throws IOException {

        configTestData = new ConfigProperties("resources/configTestData.properties");
        configBrowser = new ConfigProperties("resources/configBrowser.properties");
        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        webDriverHandler.navigateToUrl(configBrowser.getProperty("url"));
    }

    @After()
    public void closeStcTvWebsite() {
        webDriverHandler.resetCache();
        webDriverHandler.close();
    }

}
