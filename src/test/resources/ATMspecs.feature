

Feature: ATM Card feature
  User should be asked for PIN once ATM card is inserted into the ATM.
  User should be given warning message if PIN number entered is wrong.
  User should be authenticated successfully if PIN number entered is correct.

  Scenario: Enter correct PIN at ATM
    Given I insert the ATM card in ATM machine
    And I am asked to enter the PIN
    When I enter the correct PIN
    Then I should be able to see option to withdraw money

  @sanity
  Scenario: Enter wrong PIN at ATM
    Given I insert the ATM card in ATM machine
    And I am asked to enter the PIN
    When I enter the wrong PIN
    Then I should not be able to see option to withdraw money