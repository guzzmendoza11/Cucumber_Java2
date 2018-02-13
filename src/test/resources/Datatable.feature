Feature: Run Selenium Scenarios
#Video 10: Passing data table to steps
  Scenario: Check the title of website - softpost.
    Given I verify that website title as mentioned below
          | website | http://www.softpost.org |
          | title   | tutorial                |
          | user    | xyz                     |


  Scenario: Check the title of website - google.
    Given I verify that website title as mentioned below
      | website | http://www.google.com |
      | title   | Google                |