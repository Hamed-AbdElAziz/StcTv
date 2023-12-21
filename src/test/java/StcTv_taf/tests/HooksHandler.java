package StcTv_taf.tests;

import base.Base;
import browser.Browser;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.ConfigProperties;
import io.cucumber.java.*;
import utils.JsonFormatter;
import utils.Utilities;
import webDriver_handler.WebDriverHandler;

import java.io.File;
import java.io.IOException;


public class HooksHandler extends Base {

    @Before()
    public void StcTvWebsiteSetUp() throws IOException {
        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        utilities = new Utilities();
        jsonFormatter = new JsonFormatter();
        configTestData = new ConfigProperties("resources/configTestData.properties");
        configBrowser = new ConfigProperties("resources/configBrowser.properties");
        webDriverHandler.navigateToUrl(configBrowser.getProperty("url"));
    }

    @BeforeSuite
    public void start(){
        extend = new ExtentReports("reports/index.html", true);
        extend.addSystemInfo("report name","StcTv Report");
    }

    @AfterSuite
    public void end(){
        extend.flush();
    }

    @BeforeMethod
    public void startTestLogger() {
        logger = extend.startTest("startTestReport");
    }

    @AfterMethod
    public void endTestLogger(ITestResult result) throws IOException {

        if(result.getStatus()==ITestResult.SUCCESS)
        {
            logger.log(LogStatus.PASS,"Test Pass");
            File srcFile = ((TakesScreenshot)WebDriverHandler.getWebDriver()).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(srcFile,new File("reports/screenShot.png"));

            logger.log(LogStatus.PASS,"<a href='" + result.getName() + ".png" + "'><span class='lable info'>Download Snapshot</span></a>");
        }
        else if(result.getStatus() == ITestResult.FAILURE)
        {
            logger.log(LogStatus.FAIL, "Test Failed");
            logger.log(LogStatus.FAIL,"<a href='" + result.getName() + ".png" + "'><span class='lable info'>Download Snapshot</span></a>");
        }
        else
        {
            logger.log(LogStatus.SKIP, "Test Skipped");
        }
    }

    @After()
    public void StcTvWebsiteTearDown() {
        webDriverHandler.resetCache();
        webDriverHandler.close();
    }

}
