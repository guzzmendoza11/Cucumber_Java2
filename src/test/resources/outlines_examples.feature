Feature: Run Selenium Scenarios
#Video 8: Scenario Outlines
  Scenario Outline: Check the title of website.
    Given I am on the home page of the <website>
    Then I verify that title contains <word>

#You can have multiple parameters
    Examples: This is a test data
      |website                |word     |
      |http://www.softpost.org|tutorials|
      |http://www.google.com  |Google   |