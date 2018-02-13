Feature: Run Selenium Scenarios
#Video 11: Using examples to perform data driven testing
  Scenario Outline: Check that you can enter firstName and lastName.
    Given I am on the url "http://www.softpost.org/selenium-test-page"
    Then I verify that I can enter first name as <firstName>
    Then I verify that I can enter last name as <lastName>

#Each row of data will execute the steps above until the last row
    Examples: This is a test data
    |firstName | lastName |
    | shaun    | loh      |
    | tim      | wilson   |