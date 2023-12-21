package StcTv_taf.tests.step_definitions;

import base.Base;
import io.cucumber.java.en.*;
import org.testng.Assert;
import webDriver_handler.WebDriverHandler;

public class SubscriptionPackagesStepDefs extends Base {

    @Given("user is redirected to StcTv home page")
    public void userIsRedirectedToStcTvHomePage() {
        Assert.assertEquals(WebDriverHandler.getWebDriver().getCurrentUrl(),configBrowser.getProperty("url"));
        Assert.assertTrue(browser.elementIsDisplayed(browser.home.getLitePackageName()));
    }

    @When("select country {string}")
    public void selectCountry(String countryName) {
            utilities.countrySelect(countryName);
    }

    @When("set language {string}")
    public void setLanguage(String languageName) {
        utilities.languageSelect(languageName);
    }

    @Then("should see country name in the selected language")
    public void shouldSeeCountryNameInTheSelectedLanguage() {
        Assert.assertEquals(utilities.getExpectedCountryName(), browser.homePage.getCountryName().getText());
        System.out.println("countryName: " + browser.homePage.getCountryName().getText());
    }

    @Then("should see lite plan price and country currency with selected {string}")
    public void shouldSeeLitePlanPriceAndCountryCurrencyWithSelected(String language){
        Assert.assertEquals(utilities.getExpectedLitePrice() , browser.homePage.getLitePrice().getText());
        System.out.println("litePrice: " + browser.homePage.getLitePrice().getText());
        utilities.countryCurrencyHandler(language);
    }

    @Then("should see classic plan price and country currency with selected {string}")
    public void shouldSeeClassicPlanPriceAndCountCurrencyWithSelected(String language){
        Assert.assertEquals(utilities.getExpectedClassicPrice() , browser.homePage.getClassicPrice().getText());
        System.out.println("ClassicPrice: " + browser.homePage.getClassicPrice().getText());
        utilities.countryCurrencyHandler(language);
    }

    @Then("should see premium plan price and country currency with selected {string}")
    public void shouldSeePremiumPlanPriceAndCountryCurrencyWithSelected(String language){
        Assert.assertEquals(utilities.getExpectedPremiumPrice() , browser.homePage.getPremiumPrice().getText());
        System.out.println("PremiumPrice: " + browser.homePage.getPremiumPrice().getText());
        utilities.countryCurrencyHandler(language);
    }

    @Then("should see invalid lite plan price and country currency with selected {string}")
    public void shouldSeeInvalidLitePlanPriceAndCountryCurrencyWithSelected(String language){
        Assert.assertNotEquals(utilities.getInvalidPrice() , browser.homePage.getLitePrice().getText());
        System.out.println("invalidPrice: "+utilities.getInvalidPrice());
        System.out.println("valid liteCountryPrice: " + browser.homePage.getLitePrice().getText());
        utilities.unsupportedCurrencyHandler(language);
    }

    @Then("should see invalid classic plan device access with selected {string}")
    public void shouldSeeInvalidClassicPlanDeviceAccessWithSelected(String language){
        Assert.assertNotEquals(utilities.getInvalidDeviceAccess() , browser.homePage.getDeviceAccessClassic().getText());
        System.out.println("invalid deviceAccess: "+utilities.getInvalidPrice());
        System.out.println("valid classicDeviceAccess: "+ browser.homePage.getDeviceAccessClassic().getText());
    }

}
