package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver_handler.WebDriverHandler;

public class HomePage extends Base {

    private By countryBtn = By.id("country-btn");
    private By countryName = By.id("country-name");
    private By languageBtn = By.id("translation-btn");
    private By bahrainWrapperCard = By.id("bh");
    private By kuwaitWrapperCard = By.id("kw");
    private By ksaWrapperCard = By.id("sa");
    private By litePrice[] = {By.xpath("//div[@id='currency-lite']/b"),By.xpath("//div[@id='currency-لايت']/b")};
    private By liteCurrency[] = {By.xpath("//div[@id='currency-lite']/i"),By.xpath("//div[@id='currency-لايت']/i")};
    private By classicPrice[] = {By.xpath("//div[@id='currency-classic']/b"),By.xpath("//div[@id='currency-الأساسية']/b")};
    private By premiumPrice[] = {By.xpath("//div[@id='currency-premium']/b"),By.xpath("//div[@id='currency-بريميوم']/b")};
    private By deviceAccessClassic = By.xpath("(//div[contains(@class,'classic')])[6]");
    private By liteTrialBtn[] ={By.id("lite-selection"),By.id("لايت-selection")};
    private By classicTrialBtn[]={By.id("classic-selection"),By.id("الأساسية-selection")};
    private By premiumTrialBtn[]={By.id("premium-selection"),By.id("بريميوم-selection")};



    public WebElement getCountryName(){return WebDriverHandler.getWebDriver().findElement(countryName);}
    public WebElement getLitePrice(){return WebDriverHandler.getWebDriver().findElement(litePrice[utilities.langIndex]);}
    public WebElement getLiteCurrency(){return WebDriverHandler.getWebDriver().findElement(liteCurrency[utilities.langIndex]);}
    public WebElement getClassicPrice(){return WebDriverHandler.getWebDriver().findElement(classicPrice[utilities.langIndex]);}
    public WebElement getPremiumPrice(){return WebDriverHandler.getWebDriver().findElement(premiumPrice[utilities.langIndex]);}
    public WebElement getDeviceAccessClassic(){return WebDriverHandler.getWebDriver().findElement(deviceAccessClassic);}
    public void clickOnCountryBtn() {WebDriverHandler.getWebDriver().findElement(countryBtn).click();}
    public void clickOnLanguageBtn() {WebDriverHandler.getWebDriver().findElement(languageBtn).click();}
    public void clickOnKsaCard() {WebDriverHandler.getWebDriver().findElement(ksaWrapperCard).click();}
    public void clickOnBahrainCard() {WebDriverHandler.getWebDriver().findElement(bahrainWrapperCard).click();}
    public void clickOnKuwaitCard() {WebDriverHandler.getWebDriver().findElement(kuwaitWrapperCard).click();}
    public void clickOnLiteTrialBtn() {WebDriverHandler.getWebDriver().findElement(liteTrialBtn[utilities.langIndex]).click();}
    public void clickOnClassicTrialBtn() {WebDriverHandler.getWebDriver().findElement(classicTrialBtn[utilities.langIndex]).click();}
    public void clickOnPremiumTrialBtn() {WebDriverHandler.getWebDriver().findElement(premiumTrialBtn[utilities.langIndex]).click();}






}
