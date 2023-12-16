package StcTv_taf.webDriver_handler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHandler {

    private static WebDriver webDriver;
/*
    public WebDriverHandler() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
    }
*/
    public WebDriverHandler() {
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
    }

    public static WebDriver getWebDriver() { return webDriver;}
    public void navigateToUrl(String link) {
        webDriver.navigate().to(link);
    }
    public void resetCache() {webDriver.manage().deleteAllCookies();}
    public void close() {webDriver.quit();}


}
