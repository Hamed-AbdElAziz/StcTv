package StcTv_taf.tests.step_definitions;

import base.Base;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class PaymentStepDefs extends Base {

    @Then("payment wrapper should be opened")
    public void paymentWrapperShouldBeOpened() {
        Assert.assertTrue(browser.elementIsDisplayed(browser.paymentWrapper.getOrderTierName()));
    }

    @Then("should see lite plan stc payment price and currency with language {string}")
    public void shouldSeeLitePlanStcPaymentPriceAndCurrencyWithLanguage(String language) {
        if(utilities.countryIndex==0) {
            Assert.assertEquals(utilities.getExpectedStcPaymentPrice() , browser.paymentWrapper.getKsaPrice().getText());
            System.out.println("stcPaymentPrice: " + browser.paymentWrapper.getKsaPrice().getText());
        } else if (utilities.countryIndex==1){
            Assert.assertEquals(utilities.getExpectedStcPaymentPrice() , browser.paymentWrapper.getKuwaitPrice().getText());
            System.out.println("stcPaymentPrice: " + browser.paymentWrapper.getKuwaitPrice().getText());
        }
        else if (utilities.countryIndex==2){
            Assert.assertEquals(utilities.getExpectedStcPaymentPrice() , browser.paymentWrapper.getBahrainPrice().getText());
            System.out.println("stcPaymentPrice: " + browser.paymentWrapper.getBahrainPrice().getText());
        }
        utilities.stcPaymentCurrencyHandler(language);
    }

    @Then("should see lite plan visa payment price and currency with language {string}")
    public void shouldSeeLitePlanVisaPaymentPriceAndCurrencyWithLanguage(String language) {
        if(utilities.countryIndex==0) {
            Assert.assertEquals(utilities.getExpectedVisaPaymentPrice() , browser.paymentWrapper.getKsaVisaPrice().getText());
            System.out.println("visaPaymentPrice: " + browser.paymentWrapper.getKsaVisaPrice().getText());
        } else if (utilities.countryIndex==1){
            Assert.assertEquals(utilities.getExpectedVisaPaymentPrice() , browser.paymentWrapper.getKuwaitVisaPrice().getText());
            System.out.println("visaPaymentPrice: " + browser.paymentWrapper.getKuwaitVisaPrice().getText());
        }
        else if (utilities.countryIndex==2){
            Assert.assertEquals(utilities.getExpectedVisaPaymentPrice() , browser.paymentWrapper.getBahrainVisaPrice().getText());
            System.out.println("visaPaymentPrice: " + browser.paymentWrapper.getBahrainVisaPrice().getText());
        }
        utilities.visaPaymentCurrencyHandler(language);
    }


    @Then("should see {string} visa payment price and currency with language {string}")
    public void shouldSeeVisaPaymentPriceAndCurrencyWithLanguage(String packageName, String language) {
    }
}
