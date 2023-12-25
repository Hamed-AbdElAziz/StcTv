package webDriver_handler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverHandler {

    public static WebDriver webDriver;

   public WebDriverHandler() {
       FirefoxOptions options = new FirefoxOptions();
       options.addArguments("--headless");
       webDriver = new FirefoxDriver(options);
    }

    public static WebDriver getWebDriver() { return webDriver;}
    public void navigateToUrl(String link) {
        webDriver.navigate().to(link);
    }
    public void resetCache() {webDriver.manage().deleteAllCookies();}
    public void close() {webDriver.quit();}


}
