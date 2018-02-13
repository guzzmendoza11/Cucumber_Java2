package org.softpost;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

//Videos 6-8 & 15
public class StepDef_V6to8 {

//Video 15: Sharing the Webdriver among step definition classes
    WebDriver driver;
    public StepDef_V6to8 (MySharedClass mySharedClass){
        driver = mySharedClass.startBrowser();
        System.out.println(mySharedClass.id);
    }
//Video 6: Running scenarios from feature
    @Given("^I am on the home page of softpost$")
    public void iAmOnTheHomePageOfSoftpost() throws Throwable {

        driver.get("http://www.softpost.org");
    }
//Video 6: Running scenarios from feature
    @Then("^I should see that title contains tutorials$")
    public void iShouldSeeThatTitleContainsTutorials() throws Throwable {
        Thread.sleep(3000);
        assert driver.getTitle().toLowerCase().contains("tutorials");
        System.out.println("Title found");
    }

//Video 8: Scenario Outlines
    @Given("^I am on the home page of the (.*)$")
    public void iAmOnTheHomePageOfTheWebsite(String website) throws Throwable {

        driver.get(website);
    }
//Video 8: Scenario Outlines
    @Then("^I verify that title contains (.*)$")
    public void iVerifyThatTitleContainsWord(String word) throws Throwable {

        assert driver.getTitle().toLowerCase().contains(word);
    }

}
