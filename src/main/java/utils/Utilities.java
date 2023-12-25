package utils;

import base.Base;

import java.io.IOException;
import org.testng.Assert;

public class Utilities extends Base {

    public int langIndex = 0;
    public int countryIndex = 0;
    public int planPaymentIndex = 0;
    private String languageOptions[] = {"En", "Ar"};
    private String countryOptions[] = {"KSA", "KW", "BH"};
    private String planPaymentOptions[]= {"Lite","Classic","Premium"};
    private String homeTestDataFile = "resources/homePageTestData.json";
    private String paymentTestDataFile = "resources/paymentTestData.json";

    public void countrySelect(String country) {
        if (country.equals("KSA") && countryIndex == 0) {
            System.out.println("\nKSA is selected");
        } else if (country.equals("KSA")) {
            browser.homePage.clickOnCountryBtn();
            browser.homePage.clickOnKsaCard();
            System.out.println("KSA country is selected");
            countryIndex = 0;
        } else if (country.equals("KW") && countryIndex == 1) {
            System.out.println("\nKW is selected");
        } else if (country.equals("KW")) {
            browser.homePage.clickOnCountryBtn();
            browser.homePage.clickOnKuwaitCard();
            System.out.println("\nKW is selected");
            countryIndex = 1;
        } else if (country.equals("BH") && countryIndex == 2) {
            System.out.println("\nBH is selected");
        } else if (country.equals("BH")) {
            browser.homePage.clickOnCountryBtn();
            browser.homePage.clickOnBahrainCard();
            System.out.println("\nBH is selected");
            countryIndex = 2;
        }
        else {
            browser.homePage.clickOnCountryBtn();
            System.out.println("\n country is not supported");
        }
    }

    public void languageSelect(String language) {
        if (language.equals("English") && langIndex == 0) {
            System.out.println("language: " + language);
        } else if (language.equals("English") && langIndex != 0) {
            System.out.println("language: " + language);
            browser.homePage.clickOnLanguageBtn();
            langIndex = 0;
        } else if (language.equals("Arabic") && langIndex == 1) {
            System.out.println("language: " + language);
        } else if (language.equals("Arabic")) {
            System.out.println("language: " + language);
            browser.homePage.clickOnLanguageBtn();
            langIndex = 1;
        }
    }

    public void planPaymentSelect(String packageName) {
        if (packageName.equals("Lite") ) {
            browser.homePage.clickOnLiteTrialBtn();
            System.out.println("plan: " + packageName);
            planPaymentIndex = 0;
        } else if (packageName.equals("Classic") ) {
            browser.homePage.clickOnClassicTrialBtn();
            System.out.println("plan: " + packageName);
            planPaymentIndex = 1;
        } else if (packageName.equals("Premium")) {
            browser.homePage.clickOnPremiumTrialBtn();
            System.out.println("plan: " + packageName);
            planPaymentIndex = 2;
        }
    }


    public String getExpectedCountryName() {
        String jsonPathToName = getJsonPathForAssertions("name");
        String name = "";
        try {name = jsonFormatter.formatJsonValue(homeTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return name;
    }

    public String getExpectedLitePrice() {
        String jsonPathToName = getJsonPathForAssertions("priceLite");
        String lite = "";
        try {lite = jsonFormatter.formatJsonValue(homeTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return lite;
    }

    public String getExpectedClassicPrice() {
        String jsonPathToName = getJsonPathForAssertions("priceClassic");
        String classic = "";
        try {classic = jsonFormatter.formatJsonValue(homeTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return classic;
    }

    public String getExpectedPremiumPrice() {
        String jsonPathToName = getJsonPathForAssertions("pricePremium");
        String premium = "";
        try {premium = jsonFormatter.formatJsonValue(homeTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return premium;
    }

    public String getExpectedCurrency() {
        String jsonPathToName = getJsonPathForAssertions("currency");
        String currency = "";
        try {currency = jsonFormatter.formatJsonValue(homeTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return currency;
    }

    public String getExpectedStcPaymentCurrency() {
        String jsonPathToName = getJsonPathForAssertions("stcCurrency");
        String currency = "";
        try {currency = jsonFormatter.formatJsonValue(paymentTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return currency;
    }

    public String getExpectedVisaPaymentCurrency() {
        String jsonPathToName = getJsonPathForAssertions("visaCurrency");
        String currency = "";
        try {currency = jsonFormatter.formatJsonValue(paymentTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return currency;
    }

    public String getExpectedStcPaymentPrice() {
        String jsonPathToName = getPaymentJsonPathForAssertions("stcPrice");
        String stcPrice = "";
        try {stcPrice = jsonFormatter.formatJsonValue(paymentTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return stcPrice;
    }

    public String getExpectedVisaPaymentPrice() {
        String jsonPathToName = getPaymentJsonPathForAssertions("visaPrice");
        String visaPrice = "";
        try {visaPrice = jsonFormatter.formatJsonValue(paymentTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return visaPrice;
    }

    public String getInvalidPrice() {
        String jsonPathToName = getJsonPathForAssertions("invalidPrice");
        String invalidPrice = "";
        try {invalidPrice = jsonFormatter.formatJsonValue(homeTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return invalidPrice;
    }

    public String getInvalidDeviceAccess() {
        String jsonPathToName = getJsonPathForAssertions("invalidDeviceAccess");
        String invalidDeviceAccess = "";
        try {invalidDeviceAccess = jsonFormatter.formatJsonValue(homeTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return invalidDeviceAccess;
    }

    public String getUnsupportedCurrency() {
        String jsonPathToName = getJsonPathForAssertions("unsupportedCurrency");
        String unsupportedCurrency = "";
        try {unsupportedCurrency = jsonFormatter.formatJsonValue(homeTestDataFile, jsonPathToName);}
        catch (IOException e) {e.printStackTrace();}
        return unsupportedCurrency;
    }

    private String getJsonPathForAssertions(String key) {
        return String.format("%s.%s.%s", countryOptions[countryIndex], languageOptions[langIndex], key);
    }
    
    private String getPaymentJsonPathForAssertions(String key) {
        return String.format("%s.%s.%s.%s", countryOptions[countryIndex], languageOptions[langIndex],planPaymentOptions[planPaymentIndex],key) ;
    }

    public void countryCurrencyHandler(String language) {
        switch (language) {
            case "Arabic": {
                if (utilities.countryIndex == 2) {
                    String str = browser.homePage.getLiteCurrency().getText().replaceAll("/شهر\\\u202B", "");
                    String currency = str.replaceAll("/شهر", "");
                    System.out.println("Currency: " + currency);
                } else {
                    Assert.assertEquals(utilities.getExpectedCurrency(), browser.homePage.getLiteCurrency().getText().replaceAll("/شهر", ""));
                    System.out.println("Currency: " + browser.homePage.getLiteCurrency().getText().replaceAll("/شهر", "") );
                }
            }
            break;
            case "English": {
                Assert.assertEquals(utilities.getExpectedCurrency(), browser.homePage.getLiteCurrency().getText().replaceAll("/month", ""));
                System.out.println("Currency: " + browser.homePage.getLiteCurrency().getText().replaceAll("/month", "") );
            }
            break;
        }
    }

    public void stcPaymentCurrencyHandler(String language) {
        if(utilities.countryIndex==0) {
            Assert.assertEquals(utilities.getExpectedStcPaymentCurrency(), browser.paymentWrapper.getKsaCurrency().getText());
            System.out.println("stcPaymentCurrency: " + browser.paymentWrapper.getKsaCurrency().getText());
        }
        else if (utilities.countryIndex==1) {

            Assert.assertEquals(utilities.getExpectedStcPaymentCurrency(), browser.paymentWrapper.getKuwaitCurrency().getText());
            System.out.println("stcPaymentCurrency: " + browser.paymentWrapper.getKuwaitCurrency().getText());
        }
        else if (utilities.countryIndex==2){
            switch (language){
                case "Arabic": {
                    String str = browser.paymentWrapper.getBahrainCurrency().getText().replaceAll("/شهر\\\u202B", "");
                    //                            String currency = str.replaceAll("/شهر", "");
                    System.out.println("stcPaymentCurrency: " + str);
                }
                break;
                case "English": {
                    Assert.assertEquals(utilities.getExpectedStcPaymentCurrency(), browser.paymentWrapper.getBahrainCurrency().getText());
                    System.out.println("stcPaymentCurrency: " + browser.paymentWrapper.getBahrainCurrency().getText());
                }
                break;
            }
        }
    }

    public void visaPaymentCurrencyHandler(String language) {
        if(utilities.countryIndex==0) {
            Assert.assertEquals(utilities.getExpectedVisaPaymentCurrency(), browser.paymentWrapper.getKsaVisaCurrency().getText());
            System.out.println("visaPaymentCurrency: " + browser.paymentWrapper.getKsaVisaCurrency().getText());
        }
        else if (utilities.countryIndex==1) {

            Assert.assertEquals(utilities.getExpectedVisaPaymentCurrency(), browser.paymentWrapper.getKuwaitVisaCurrency().getText());
            System.out.println("visaPaymentCurrency: " + browser.paymentWrapper.getKuwaitVisaCurrency().getText());
        }
        else if (utilities.countryIndex==2){
            switch (language){
                case "Arabic": {
                    String str = browser.paymentWrapper.getBahrainVisaCurrency().getText().replaceAll("/شهر\\\u202B", "");
                    //                            String currency = str.replaceAll("/شهر", "");
                    System.out.println("visaPaymentCurrency: " + str);
                }
                break;
                case "English": {
                    Assert.assertEquals(utilities.getExpectedVisaPaymentCurrency(), browser.paymentWrapper.getBahrainVisaCurrency().getText());
                    System.out.println("visaPaymentCurrency: " + browser.paymentWrapper.getBahrainVisaCurrency().getText());
                }
                break;
            }
        }
    }

    public void unsupportedCurrencyHandler(String language) {
        switch (language) {
            case "Arabic": {
                if (utilities.countryIndex == 2) {
                    String str = browser.homePage.getLiteCurrency().getText().replaceAll("/شهر\\\u202B", "");
                    String supportedCurrency = str.replaceAll("/شهر", "");
                    Assert.assertNotEquals(utilities.getUnsupportedCurrency(),supportedCurrency);
                    System.out.println("unsupportedCurrency: " + utilities.getUnsupportedCurrency()) ;
                    System.out.println("valid supportedCurrency: " + supportedCurrency) ;

                } else {
                    Assert.assertNotEquals(utilities.getUnsupportedCurrency(), browser.homePage.getLiteCurrency().getText().replaceAll("/شهر", ""));
                    System.out.println("unsupportedCurrency: " + utilities.getUnsupportedCurrency()) ;
                    System.out.println("valid supportedCurrency: " + browser.homePage.getLiteCurrency().getText().replaceAll("/شهر", "")) ;
                }
            }
            break;
            case "English": {
                Assert.assertNotEquals(utilities.getUnsupportedCurrency(), browser.homePage.getLiteCurrency().getText().replaceAll("/month", ""));
                System.out.println("unsupportedCurrency: " + utilities.getUnsupportedCurrency()) ;
                System.out.println("valid supportedCurrency: " + browser.homePage.getLiteCurrency().getText().replaceAll("/month", "")) ;
            }
            break;
        }
    }

}