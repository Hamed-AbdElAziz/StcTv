package base;


import browser.Browser;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import utils.ConfigProperties;
import utils.JsonFormatter;
import utils.Utilities;
import webDriver_handler.WebDriverHandler;

public class Base {

    protected static WebDriverHandler webDriverHandler;
    protected static Browser browser;
    protected static ConfigProperties configBrowser;
    protected static ConfigProperties configTestData;
    protected static Utilities utilities;
    protected static JsonFormatter jsonFormatter;
    protected static ExtentReports extend;
    protected static ExtentTest logger;
}