Feature: Subscription Packages


  Scenario Outline: Validate subscription packages (types, prices, currency) for all countries (SA, Kuwait, Bahrain)
    Given user is redirected to StcTv home page
    And   click on country button in main landing header in home page
    Then  country wrapper should be opened
    When  click on country card in country wrapper with "<countryCard>"
    Then  price and currency of "<packageName>" in "<countryName>" should be "<price>" and "<currency>"
    Examples:
      | countryName | countryCard | packageName    | price               | currency        |
      | KSA         | KSA         | litePackage    | litePriceKSA        | currencyKSA     |
      | KSA         | KSA         | classicPackage | classicPriceKSA     | currencyKSA     |
      | KSA         | KSA         | premiumPackage | premiumPriceKSA     | currencyKSA     |
      | Kuwait      | Kuwait      | litePackage    | litePriceKuwait     | currencyKuwait  |
      | Kuwait      | Kuwait      | classicPackage | classicPriceKuwait  | currencyKuwait  |
      | Kuwait      | Kuwait      | premiumPackage | premiumPriceKuwait  | currencyKuwait  |
      | Bahrain     | Bahrain     | litePackage    | litePriceBahrain    | currencyBahrain |
      | Bahrain     | Bahrain     | classicPackage | classicPriceBahrain | currencyBahrain |
      | Bahrain     | Bahrain     | premiumPackage | premiumPriceBahrain | currencyBahrain |

