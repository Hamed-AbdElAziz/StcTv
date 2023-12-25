Feature: Validate Plans Payments

  Scenario Outline: Validate lite subscription packages payment with preferred language for all countries
    Given user is redirected to StcTv home page
    When  select country "<countryName>"
    And   set language "<languageName>"
    Then  should see country name in the selected language
    When  click on start your trial button for "<packageName>" package
    Then  payment wrapper should be opened
    And   should see lite plan stc payment price and currency with language "<languageName>"
    And   should see lite plan visa payment price and currency with language "<languageName>"
    Examples:
      | languageName | countryName | packageName |
      | English      | KSA         | Lite        |
      | Arabic       | KSA         | Lite        |
      | English      | KSA         | Classic     |
      | Arabic       | KSA         | Classic     |
      | English      | KSA         | Premium     |
      | Arabic       | KSA         | Premium     |
      | English      | KW          | Lite        |
      | Arabic       | KW          | Lite        |
      | English      | KW          | Classic     |
      | Arabic       | KW          | Classic     |
      | English      | KW          | Premium     |
      | Arabic       | KW          | Premium     |
      | English      | BH          | Lite        |
      | Arabic       | BH          | Lite        |
      | English      | BH          | Classic     |
      | Arabic       | BH          | Classic     |
      | English      | BH          | Premium     |
      | Arabic       | BH          | Premium     |
