package StcTv_taf.tests.step_definitions;

import base.Base;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class PackagesTDDStepDefs extends Base {

    @When("click on country button in main landing header in home page")
    public void clickOnCountryButtonInMainLandingHeaderInHomePage() {
        browser.home.clickOnCountryBtn();
    }

    @Then("country wrapper should be opened")
    public void countryWrapperShouldBeOpened() {
        Assert.assertTrue(browser.elementIsDisplayed(browser.home.getCountryHeader()));
    }

    @When("click on country card in country wrapper with {string}")
    public void clickOnCountryCardInCountryWrapperWith(String countryCard) {
         switch (countryCard)
        {
            case "KSA":
                browser.home.clickOnKsaCard();
                break;
            case "Bahrain":
                browser.home.clickOnBahrainCard();
                break;
            case "Kuwait":
                browser.home.clickOnKuwaitCard();
                break;
        }
    }

    @Then("price and currency of {string} in {string} should be {string} and {string}")
    public void priceAndCurrencyOfInShouldBe(String packageName, String countryName, String price, String currency) {
        switch (countryName)
        {
            case "KSA":
                Assert.assertEquals(browser.home.getCountryName().getText(), countryName);
                System.out.println("\ncountryName: " + browser.home.getCountryName().getText());
                switch (configTestData.getProperty(packageName))
                {
                    case "LITE":
                        Assert.assertEquals(browser.home.getLitePackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("packageName: " + browser.home.getLitePackageName().getText());
                        Assert.assertEquals(browser.home.getLitePrice().getText(), configTestData.getProperty(price));
                        System.out.println("priceKSA: " + browser.home.getLitePrice().getText());
                        Assert.assertEquals((browser.home.getLiteCurrency().getText()).replaceAll("[^\"SAR\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKSA: "+browser.home.getLiteCurrency().getText().replaceAll("[^\"SAR\"]",""));
                        break;
                    case "CLASSIC":
                        Assert.assertEquals(browser.home.getClassicPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("packageName: " + browser.home.getClassicPackageName().getText());
                        Assert.assertEquals(browser.home.getClassicPrice().getText(), configTestData.getProperty(price));
                        System.out.println("priceKSA: " + browser.home.getClassicPrice().getText());
                        Assert.assertEquals((browser.home.getClassicCurrency().getText()).replaceAll("[^\"SAR\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKSA: " + browser.home.getClassicCurrency().getText().replaceAll("[^\"SAR\"]",""));
                        break;
                    case "PREMIUM":
                        Assert.assertEquals(browser.home.getPremiumPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("packageName: " + browser.home.getPremiumPackageName().getText());
                        Assert.assertEquals(browser.home.getPremiumPrice().getText(), configTestData.getProperty(price));
                        System.out.println("priceKSA: " + browser.home.getPremiumPrice().getText());
                        Assert.assertEquals((browser.home.getPremiumCurrency().getText()).replaceAll("[^\"SAR\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKSA: " + browser.home.getPremiumCurrency().getText().replaceAll("[^\"SAR\"]",""));
                        break;
                }
                break;
            case "Kuwait":
                Assert.assertEquals(browser.home.getCountryName().getText(), countryName);
                System.out.println("\ncountryName: " + browser.home.getCountryName().getText());
                switch (configTestData.getProperty(packageName))
                {
                    case "LITE":
                        Assert.assertEquals(browser.home.getLitePackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("packageName: " + browser.home.getLitePackageName().getText());
                        Assert.assertEquals(browser.home.getLitePrice().getText(), configTestData.getProperty(price));
                        System.out.println("priceKuwait: " + browser.home.getLitePrice().getText());
                        Assert.assertEquals((browser.home.getLiteCurrency().getText()).replaceAll("[^\"KWD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKuwait: " + browser.home.getLiteCurrency().getText().replaceAll("[^\"KWD\"]",""));
                        break;
                    case "CLASSIC":
                        Assert.assertEquals(browser.home.getClassicPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("packageName: " + browser.home.getClassicPackageName().getText());
                        Assert.assertEquals(browser.home.getClassicPrice().getText(), configTestData.getProperty(price));
                        System.out.println("priceKuwait: " + browser.home.getClassicPrice().getText());
                        Assert.assertEquals((browser.home.getClassicCurrency().getText()).replaceAll("[^\"KWD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKuwait: " + browser.home.getClassicCurrency().getText().replaceAll("[^\"KWD\"]",""));
                        break;
                    case "PREMIUM":
                        Assert.assertEquals(browser.home.getPremiumPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("packageName: " + browser.home.getPremiumPackageName().getText());
                        Assert.assertEquals(browser.home.getPremiumPrice().getText(), configTestData.getProperty(price));
                        System.out.println("priceKuwait: " + browser.home.getPremiumPrice().getText());
                        Assert.assertEquals((browser.home.getPremiumCurrency().getText()).replaceAll("[^\"KWD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyKuwait: " + browser.home.getPremiumCurrency().getText().replaceAll("[^\"KWD\"]",""));
                        break;
                }
                break;
            case "Bahrain":
                Assert.assertEquals(browser.home.getCountryName().getText(), countryName);
                System.out.println("\ncountryName: " + browser.home.getCountryName().getText());
                switch (configTestData.getProperty(packageName))
                {
                    case "LITE":
                        Assert.assertEquals(browser.home.getLitePackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("packageName: " + browser.home.getLitePackageName().getText());
                        Assert.assertEquals(browser.home.getLitePrice().getText(), configTestData.getProperty(price));
                        System.out.println("priceBahrain: " + browser.home.getLitePrice().getText());
                        Assert.assertEquals((browser.home.getLiteCurrency().getText()).replaceAll("[^\"BHD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyBahrain: " + browser.home.getLiteCurrency().getText().replaceAll("[^\"BHD\"]","")) ;
                        break;
                    case "CLASSIC":
                        Assert.assertEquals(browser.home.getClassicPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("packageName: " + browser.home.getClassicPackageName().getText());
                        Assert.assertEquals(browser.home.getClassicPrice().getText(), configTestData.getProperty(price));
                        System.out.println("priceBahrain: " + browser.home.getClassicPrice().getText());
                        Assert.assertEquals((browser.home.getClassicCurrency().getText()).replaceAll("[^\"BHD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyBahrain: " + browser.home.getClassicCurrency().getText().replaceAll("[^\"BHD\"]",""));
                        break;
                    case "PREMIUM":
                        Assert.assertEquals(browser.home.getPremiumPackageName().getText(), configTestData.getProperty(packageName));
                        System.out.println("packageName: " + browser.home.getPremiumPackageName().getText());
                        Assert.assertEquals(browser.home.getPremiumPrice().getText(), configTestData.getProperty(price));
                        System.out.println("priceBahrain: " + browser.home.getPremiumPrice().getText());
                        Assert.assertEquals((browser.home.getPremiumCurrency().getText()).replaceAll("[^\"BHD\"]",""), configTestData.getProperty(currency));
                        System.out.println("currencyBahrain: " + browser.home.getPremiumCurrency().getText().replaceAll("[^\"BHD\"]",""));
                        break;
                }
                break;
        }
    }

}
