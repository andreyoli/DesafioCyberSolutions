Feature: Fill register form with valid information
  As user
  I want to register on the site

  Scenario: Should fill fields
    Given that i open the page Register
    And i passed my full name
    And i passed my address
    And i passed my email
    And i passed my phone number
    And i marked my gender
    And i checked my hobbies
    And i select my languages
    And i select my skill
    And i click on my country
    And i select countries
    And i select my date of birth
    And i write my password and confirm him
    Then i click in Submit button