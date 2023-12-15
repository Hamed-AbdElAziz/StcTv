package StcTv_taf.base;


import StcTv_taf.browser.Browser;
import StcTv_taf.utils.ConfigProperties;
import StcTv_taf.webDriver_handler.WebDriverHandler;

public class Base {

    protected static WebDriverHandler webDriverHandler;
    protected static Browser browser;
    protected static ConfigProperties configBrowser;
    protected static ConfigProperties configTestData;
}