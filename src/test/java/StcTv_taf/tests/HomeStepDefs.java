package StcTv_taf.tests;

import StcTv_taf.base.Base;
import StcTv_taf.webDriver_handler.WebDriverHandler;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class HomeStepDefs extends Base {

    @Given("user is redirected to StcTv home page")
    public void userIsRedirectedToStcTvHomePage() {
        Assert.assertEquals(WebDriverHandler.getWebDriver().getCurrentUrl(),"https://subscribe.stctv.com/sa-en");
        Assert.assertTrue(browser.elementIsDisplayed(browser.stcTvWebsite.home.getLitePackageName()));
    }

    @When("click on country button in main landing header in home page")
    public void clickOnCountryButtonInMainLandingHeaderInHomePage() {
        browser.stcTvWebsite.home.clickOnCountryBtn();
    }

    @Then("country wrapper should be opened")
    public void countryWrapperShouldBeOpened() {
        Assert.assertTrue(browser.elementIsDisplayed(browser.stcTvWebsite.countryWrapper.getCountryHeader()));
    }

    @When("click on country card in country wrapper with {string}")
    public void clickOnCountryCardInCountryWrapperWith(String countryCard) {
         switch (countryCard)
        {
            case "KSA":
                browser.stcTvWebsite.countryWrapper.clickOnKsaCard();
                break;
            case "Bahrain":
                browser.stcTvWebsite.countryWrapper.clickOnBahrainCard();
                break;
            case "Kuwait":
                browser.stcTvWebsite.countryWrapper.clickOnKuwaitCard();
                break;
        }
    }


    @Then("price and currency of {string} in {string} should be {string} and {string}")
    public void priceAndCurrencyOfInShouldBe(String packageName, String countryName, String price, String currency) {
        switch (countryName)
        {
            case "KSA":
                Assert.assertEquals(browser.stcTvWebsite.home.getCountryName().getText(), countryName);
                System.out.println("countryName: " + browser.stcTvWebsite.home.getCountryName().getText());
                switch (configTestData.getProperty(packageName))
                {
                    case "LITE":
                        Assert.assertEquals(browser.stcTvWebsite.home.getLitePackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("litePackageName: " + browser.stcTvWebsite.home.getLitePackageName().getText());
                        Assert.assertEquals(browser.stcTvWebsite.home.getLitePrice().getText(), configTestData.getProperty(price));
                        System.out.println("litePriceKSA: " + browser.stcTvWebsite.home.getLitePrice().getText());
                        Assert.assertEquals((browser.stcTvWebsite.home.getLiteCurrency().getText()).replaceAll("[^\"SAR\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKSA: " + browser.stcTvWebsite.home.getLiteCurrency().getText().replaceAll("[^\"SAR\"]","") + "\n");
                        break;
                    case "CLASSIC":
                        Assert.assertEquals(browser.stcTvWebsite.home.getClassicPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("classicPackageName: " + browser.stcTvWebsite.home.getClassicPackageName().getText());
                        Assert.assertEquals(browser.stcTvWebsite.home.getClassicPrice().getText(), configTestData.getProperty(price));
                        System.out.println("classicPriceKuwait: " + browser.stcTvWebsite.home.getClassicPrice().getText());
                        Assert.assertEquals((browser.stcTvWebsite.home.getClassicCurrency().getText()).replaceAll("[^\"SAR\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKSA: " + browser.stcTvWebsite.home.getClassicCurrency().getText().replaceAll("[^\"SAR\"]","") + "\n");
                        break;
                    case "PREMIUM":
                        Assert.assertEquals(browser.stcTvWebsite.home.getPremiumPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("premiumPackageName: " + browser.stcTvWebsite.home.getPremiumPackageName().getText());
                        Assert.assertEquals(browser.stcTvWebsite.home.getPremiumPrice().getText(), configTestData.getProperty(price));
                        System.out.println("premiumPriceBahrain: " + browser.stcTvWebsite.home.getPremiumPrice().getText());
                        Assert.assertEquals((browser.stcTvWebsite.home.getPremiumCurrency().getText()).replaceAll("[^\"SAR\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKuwait: " + browser.stcTvWebsite.home.getPremiumCurrency().getText().replaceAll("[^\"SAR\"]","") + "\n");
                        break;
                }
                break;

            case "Kuwait":
                Assert.assertEquals(browser.stcTvWebsite.home.getCountryName().getText(), countryName);
                System.out.println("countryName: " + browser.stcTvWebsite.home.getCountryName().getText());
                switch (configTestData.getProperty(packageName))
                {
                    case "LITE":
                        Assert.assertEquals(browser.stcTvWebsite.home.getLitePackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("litePackageName: " + browser.stcTvWebsite.home.getLitePackageName().getText());
                        Assert.assertEquals(browser.stcTvWebsite.home.getLitePrice().getText(), configTestData.getProperty(price));
                        System.out.println("litePriceKuwait: " + browser.stcTvWebsite.home.getLitePrice().getText());
                        Assert.assertEquals((browser.stcTvWebsite.home.getLiteCurrency().getText()).replaceAll("[^\"KWD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKuwait: " + browser.stcTvWebsite.home.getLiteCurrency().getText().replaceAll("[^\"KWD\"]","") + "\n");
                        break;
                    case "CLASSIC":
                        Assert.assertEquals(browser.stcTvWebsite.home.getClassicPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("classicPackageName: " + browser.stcTvWebsite.home.getClassicPackageName().getText());
                        Assert.assertEquals(browser.stcTvWebsite.home.getClassicPrice().getText(), configTestData.getProperty(price));
                        System.out.println("classicPriceKuwait: " + browser.stcTvWebsite.home.getClassicPrice().getText());
                        Assert.assertEquals((browser.stcTvWebsite.home.getClassicCurrency().getText()).replaceAll("[^\"KWD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKuwait: " + browser.stcTvWebsite.home.getClassicCurrency().getText().replaceAll("[^\"KWD\"]","") + "\n");
                        break;
                    case "PREMIUM":
                        Assert.assertEquals(browser.stcTvWebsite.home.getPremiumPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("premiumPackageName: " + browser.stcTvWebsite.home.getPremiumPackageName().getText());
                        Assert.assertEquals(browser.stcTvWebsite.home.getPremiumPrice().getText(), configTestData.getProperty(price));
                        System.out.println("premiumPriceKuwait: " + browser.stcTvWebsite.home.getPremiumPrice().getText());
                        Assert.assertEquals((browser.stcTvWebsite.home.getPremiumCurrency().getText()).replaceAll("[^\"KWD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKuwait: " + browser.stcTvWebsite.home.getPremiumCurrency().getText().replaceAll("[^\"KWD\"]","") + "\n");
                        break;
                }
                break;

            case "Bahrain":
                Assert.assertEquals(browser.stcTvWebsite.home.getCountryName().getText(), countryName);
                System.out.println("countryName: " + browser.stcTvWebsite.home.getCountryName().getText());
                switch (configTestData.getProperty(packageName))
                {
                    case "LITE":
                        Assert.assertEquals(browser.stcTvWebsite.home.getLitePackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("litePackageName: " + browser.stcTvWebsite.home.getLitePackageName().getText());
                        Assert.assertEquals(browser.stcTvWebsite.home.getLitePrice().getText(), configTestData.getProperty(price));
                        System.out.println("litePriceBahrain: " + browser.stcTvWebsite.home.getLitePrice().getText());
                        Assert.assertEquals((browser.stcTvWebsite.home.getLiteCurrency().getText()).replaceAll("[^\"BHD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyBahrain: " + browser.stcTvWebsite.home.getLiteCurrency().getText().replaceAll("[^\"BHD\"]","")+ "\n") ;
                        break;
                    case "CLASSIC":
                        Assert.assertEquals(browser.stcTvWebsite.home.getClassicPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("classicPackageName: " + browser.stcTvWebsite.home.getClassicPackageName().getText());
                        Assert.assertEquals(browser.stcTvWebsite.home.getClassicPrice().getText(), configTestData.getProperty(price));
                        System.out.println("classicPriceBahrain: " + browser.stcTvWebsite.home.getClassicPrice().getText());
                        Assert.assertEquals((browser.stcTvWebsite.home.getClassicCurrency().getText()).replaceAll("[^\"BHD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyBahrain: " + browser.stcTvWebsite.home.getClassicCurrency().getText().replaceAll("[^\"BHD\"]","") + "\n");
                        break;
                    case "PREMIUM":
                        Assert.assertEquals(browser.stcTvWebsite.home.getPremiumPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("premiumPackageName: " + browser.stcTvWebsite.home.getPremiumPackageName().getText());
                        Assert.assertEquals(browser.stcTvWebsite.home.getPremiumPrice().getText(), configTestData.getProperty(price));
                        System.out.println("premiumPriceBahrain: " + browser.stcTvWebsite.home.getPremiumPrice().getText());
                        Assert.assertEquals((browser.stcTvWebsite.home.getPremiumCurrency().getText()).replaceAll("[^\"BHD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyBahrain: " + browser.stcTvWebsite.home.getPremiumCurrency().getText().replaceAll("[^\"BHD\"]","") + "\n");
                        break;
                }
                break;

        }
    }
}
