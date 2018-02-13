Feature: Run Selenium Scenarios

#Video 6: Running scenarios from feature
 @selenium
  Scenario: Check the title of softpost.org
    Given I am on the home page of softpost
    Then I should see that title contains tutorials
