package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver_handler.WebDriverHandler;

public class PaymentWrapper extends Base {
    private By ksaCheckBox= By.id("stc-checkbox");
    private By ksaPrice = By.xpath("//span[@id='stc-price']/b");
    private By ksaCurrency = By.xpath("//span[@id='stc-price']/i");
    private By ksaVisaCheckBox= By.id("cc_ksa-checkbox");
    private By ksaVisaPrice = By.xpath("//span[@id='cc_ksa-price']/b");
    private By ksaVisaCurrency = By.xpath("//span[@id='cc_ksa-price']/i");

    private By kwCheckBox= By.id("vk-checkbox");
    private By kwPrice = By.xpath("//span[@id='vk-price']/b");
    private By kwCurrency = By.xpath("//span[@id='vk-price']/i");
    private By kwVisaCheckBox= By.id("cc_kuw-checkbox");
    private By kwVisaPrice = By.xpath("//span[@id='cc_kuw-price']/b");
    private By kwVisaCurrency = By.xpath("//span[@id='cc_kuw-price']/i");

    private By bhCheckBox= By.id("vb-checkbox");
    private By bhPrice = By.xpath("//span[@id='vb-price']/b");
    private By bhCurrency = By.xpath("//span[@id='vb-price']/i");
    private By bhVisaCheckBox= By.id("cc_brn-checkbox");
    private By bhVisaPrice = By.xpath("//span[@id='cc_brn-price']/b");
    private By bhVisaCurrency = By.xpath("//span[@id='cc_brn-price']/i");


    private By orderTierName = By.id("order-tier-name");
    private By orderPrice = By.id("order-tier-price");
    private By orderTotalPrice = By.id("order-total-price");

    public WebElement getOrderTierName (){return WebDriverHandler.getWebDriver().findElement(orderTierName);}
    public WebElement getKsaPrice (){return WebDriverHandler.getWebDriver().findElement(ksaPrice);}
    public WebElement getKsaCurrency (){return WebDriverHandler.getWebDriver().findElement(ksaCurrency);}
    public WebElement getKsaVisaPrice (){return WebDriverHandler.getWebDriver().findElement(ksaVisaPrice);}
    public WebElement getKsaVisaCurrency (){return WebDriverHandler.getWebDriver().findElement(ksaVisaCurrency);}
    public WebElement getKuwaitPrice (){return WebDriverHandler.getWebDriver().findElement(kwPrice);}
    public WebElement getKuwaitCurrency (){return WebDriverHandler.getWebDriver().findElement(kwCurrency);}
    public WebElement getKuwaitVisaPrice (){return WebDriverHandler.getWebDriver().findElement(kwVisaPrice);}
    public WebElement getKuwaitVisaCurrency (){return WebDriverHandler.getWebDriver().findElement(kwVisaCurrency);}
    public WebElement getBahrainPrice (){return WebDriverHandler.getWebDriver().findElement(bhPrice);}
    public WebElement getBahrainCurrency (){return WebDriverHandler.getWebDriver().findElement(bhCurrency);}
    public WebElement getBahrainVisaPrice (){return WebDriverHandler.getWebDriver().findElement(bhVisaPrice);}
    public WebElement getBahrainVisaCurrency (){return WebDriverHandler.getWebDriver().findElement(bhVisaCurrency);}
}
