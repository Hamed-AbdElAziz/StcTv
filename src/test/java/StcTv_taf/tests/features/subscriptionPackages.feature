Feature: Validate Subscription Planes

  Scenario Outline: Validate subscription packages price and currency with preferred language for all countries
    Given user is redirected to StcTv home page
    When  select country "<countryName>"
    And   set language "<languageName>"
    Then  should see country name in the selected language
    And   should see lite plan price and country currency with selected "<languageName>"
    And   should see classic plan price and country currency with selected "<languageName>"
    And   should see premium plan price and country currency with selected "<languageName>"
    Examples:
      | languageName | countryName |
      | English      | KSA         |
      | Arabic       | KSA         |
      | English      | KW          |
      | Arabic       | KW          |
      | English      | BH          |
      | Arabic       | BH          |

  Scenario Outline: Validate invalid price of the selected country
    Given user is redirected to StcTv home page
    When  select country "<countryName>"
    And   set language "<languageName>"
    Then  should see country name in the selected language
    And   should see invalid lite plan price and country currency with selected "<languageName>"
    Examples:
      | languageName | countryName |
      | English      | KSA         |
      | Arabic       | KSA         |
      | English      | KW          |
      | Arabic       | KW          |
      | English      | BH          |
      | Arabic       | BH          |

  Scenario Outline: Validate invalid device access value of classic plan
    Given user is redirected to StcTv home page
    When  select country "<countryName>"
    And   set language "<languageName>"
    Then  should see country name in the selected language
    And   should see invalid classic plan device access with selected "<languageName>"
    Examples:
      | languageName | countryName |
      | English      | KSA         |
      | Arabic       | KSA         |
      | English      | KW          |
      | Arabic       | KW          |
      | English      | BH          |
      | Arabic       | BH          |



