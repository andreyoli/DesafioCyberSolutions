Feature: Write on input inside of iframe
  As user
  I want write on input inside the iframe

  Scenario: Should write on input inside the frame
    Given that i open the page Frames
    And i enter in iframe
    And write on input
    And left the iframe
    And i click on "Iframe with in an Iframe" button
    And i enter in multiple iframe
    Then write on input in sub frame
