package org.softpost;
//Video 12: Integrating cucumber scenarios with Junit test

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:selenium.feature",
       // features = "src/test/resources", //Runs all the feature files
        //tags = {"~@sanity"},
        //name = {"PIN"},
        //plugin = {"html:target/selenium-report","rerun:target/rerun.txt"},
        glue = "classpath:org.softpost",
        plugin = {"html:target/myreport"}
        )
public class MyTests {

}
