package StcTv_taf.pages;

import StcTv_taf.webDriver_handler.WebDriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home {
    private By countryName = By.id("country-name");
    private By countryBtn = By.id("country-btn");
    private By litePackageName = By.id("name-lite");
    private By litePrice = By.xpath("//div[@id='currency-lite']/b");
    private By liteCurrency = By.xpath("//div[@id='currency-lite']/i");
    private By classicPackageName = By.id("name-classic");
    private By classicPrice = By.xpath("//div[@id='currency-classic']/b");
    private By classicCurrency = By.xpath("//div[@id='currency-classic']/i");
    private By premiumPackageName = By.id("name-premium");
    private By premiumPrice = By.xpath("//div[@id='currency-premium']/b");
    private By premiumCurrency = By.xpath("//div[@id='currency-premium']/i");

    public WebElement getCountryName(){return WebDriverHandler.getWebDriver().findElement(countryName);}
    public WebElement getLitePackageName(){return WebDriverHandler.getWebDriver().findElement(litePackageName);}
    public WebElement getLitePrice(){return WebDriverHandler.getWebDriver().findElement(litePrice);}
    public WebElement getLiteCurrency(){return WebDriverHandler.getWebDriver().findElement(liteCurrency);}
    public WebElement getClassicPackageName(){return WebDriverHandler.getWebDriver().findElement(classicPackageName);}
    public WebElement getClassicPrice(){return WebDriverHandler.getWebDriver().findElement(classicPrice);}
    public WebElement getClassicCurrency(){return WebDriverHandler.getWebDriver().findElement(classicCurrency);}
    public WebElement getPremiumPackageName(){return WebDriverHandler.getWebDriver().findElement(premiumPackageName);}
    public WebElement getPremiumPrice(){return WebDriverHandler.getWebDriver().findElement(premiumPrice);}
    public WebElement getPremiumCurrency(){return WebDriverHandler.getWebDriver().findElement(premiumCurrency);}

    public void clickOnCountryBtn() {WebDriverHandler.getWebDriver().findElement(countryBtn).click();}

}

