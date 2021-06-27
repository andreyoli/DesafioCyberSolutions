Feature: Put date of birth in two date pickers
  As user
  I want write my date of birth on input enabled
  and select my date of birth on input disabled

  Scenario: Write my date of birth and select my date of birth
    Given that i open the page Datepicker
    And click on disabled input
    And select my date of birth
    Then write on input enabled