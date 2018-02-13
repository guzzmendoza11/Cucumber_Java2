Feature: Run Selenium Scenarios
#Video 9: Passing parameters to steps
  Scenario: Check the title of website - softpost.
    Given I am on the home Parameters page of the "http://www.softpost.org"
    Then I verify that Parameters title contains "tutorials"

  Scenario: Check the title of website - Google.
    Given I am on the home Parameters page of the "http://www.google.com"
    Then I verify that Parameters title contains "Google"
