package org.softpost;
//Video 12: Integrating cucumber scenarios with Junit test

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "classpath:org.softpost",
        plugin = {"html:target/selenium-report","rerun:target/rerun.txt"}
        )
public class RerunMyTests {
}
