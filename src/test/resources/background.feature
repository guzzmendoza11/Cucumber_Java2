Feature: Run Selenium Scenarios
#Video 7: Scenario backgrounds
#Going to a webpage is a common scenario
  Background: This is a simple background
    Given I am on the home page of softpost

    Scenario: Check the title of softpost.org
      Then I should see that title contains tutorials

    Scenario: Check the source of softpost.org
      Then I should see that source contains tutorials
