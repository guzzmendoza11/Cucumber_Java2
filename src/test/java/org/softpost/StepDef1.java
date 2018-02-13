package org.softpost;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Video 5: Writing step definitions
public class StepDef1 {

    String cardnum;

    @Given("^I insert the ATM card in ATM machine$")
    public void i_insert_the_ATM_card_in_ATM_machine() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cardnum = "sdsdsd";
    }

    @Given("^I am asked to enter the PIN$")
    public void i_am_asked_to_enter_the_PIN() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I enter the correct PIN$")
    public void i_enter_the_correct_PIN() throws Throwable {
        System.out.println("I enter correct Pin test");

    }

    @Then("^I should be able to see option to withdraw money$")
    public void i_should_be_able_to_see_option_to_withdraw_money() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


    @When("^I enter the wrong PIN$")
    public void iEnterTheWrongPIN() throws Throwable {
        System.out.println("  " +
                "I enter incorrect Pin test");

    }

    @Then("^I should not be able to see option to withdraw money$")
    public void iShouldNotBeAbleToSeeOptionToWithdrawMoney() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
