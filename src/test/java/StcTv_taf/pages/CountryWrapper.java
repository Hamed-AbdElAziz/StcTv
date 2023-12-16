package StcTv_taf.pages;

import StcTv_taf.webDriver_handler.WebDriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CountryWrapper {
    private By countryHeader = By.id("country-header");
    private By bahrainCard = By.id("bh");
    private By kuwaitCard = By.id("kw");
    private By ksaCard = By.id("sa");

    public WebElement getCountryHeader(){return WebDriverHandler.getWebDriver().findElement(countryHeader);}
    public WebElement getBahrainCard(){return WebDriverHandler.getWebDriver().findElement(bahrainCard);}
    public WebElement getKuwaitCard(){return WebDriverHandler.getWebDriver().findElement(kuwaitCard);}
    public WebElement getKsaCard(){return WebDriverHandler.getWebDriver().findElement(ksaCard);}

    public void clickOnBahrainCard() {WebDriverHandler.getWebDriver().findElement(bahrainCard).click();}
    public void clickOnKuwaitCard() {WebDriverHandler.getWebDriver().findElement(kuwaitCard).click();}

    public void clickOnKsaCard() {WebDriverHandler.getWebDriver().findElement(ksaCard).click();}

}
