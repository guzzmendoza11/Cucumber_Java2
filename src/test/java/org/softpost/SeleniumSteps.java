package org.softpost;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

//Video 6: Running scenarios from feature file
public class SeleniumSteps {

    WebDriver driver;
    public SeleniumSteps (MySharedClass mySharedClass){

        driver = mySharedClass.startBrowser();
        System.out.println(mySharedClass.id);
    }
//Video 9: Passing parameters to steps
    @Given("^I am on the home Parameters page of the \"(.*)\"$")
    public void iAmOnTheWebsite(String website) throws Throwable {

        driver.get(website);
    }

//Video 9: Passing parameters to steps
    @Then("^I verify that Parameters title contains \"(.*)\"$")
    public void iShouldSeeThatTitleContains(String title) throws Throwable {

        assert driver.getTitle().toLowerCase().contains(title);
    }

//Video 10: Passing data table to
    @Given("^I verify that website title as mentioned below$")
    public void iVerifyThatWebsiteTitleAsMentionedBelow(Map<String, String> dataMap) throws Throwable {

        String website = dataMap.get("website");
        String title = dataMap.get("tutorials");
        System.out.println(dataMap.get("user"));
        driver.get(website);
        assert driver.getTitle().toLowerCase().contains(title);
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }

//Video 6: Running scenarios from feature
//Video 7: Scenario backgrounds
    @Then("^I should see that source contains tutorials$")
    public void iShouldSeeThatSourceContainsTutorials() throws Throwable {

        assert driver.getPageSource().toLowerCase().contains("tutorials");
    }

//Video 11: Using examples to perform data driven testing
    @Given("^I am on the url \"(.*)\"$")
    public void iAmOnTheUrl(String url) throws Throwable {

        driver.get(url);
    }
//Video 11: Using examples to perform data driven testing
    @Then("^I verify that I can enter first name as (.*)$")
    public void iVerifyThatICanEnterFirstNameAsFirstName(String firstName) throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.id("fn")).sendKeys(firstName);
    }
//Video 11: Using examples to perform data driven testing
    @Then("^I verify that I can enter last name as (.*)$")
    public void iVerifyThatICanEnterLastNameAsLastName(String lastName) throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input) [4]")).sendKeys(lastName);
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
