package org.softpost;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Video 15: Sharing the Webdriver among step definition classes
public class MySharedClass {

    WebDriver driver = null;
    public String id = "9393";

    @Before("@selenium")
    public WebDriver startBrowser() {

        System.setProperty("webdriver.chrome.driver", "/Users/Gus/Documents/Selenium_Projects/Drivers/Chrome_Drivers/ChromeDriver_2.32/chromedriver");

        if (driver==null)
        driver = new ChromeDriver();

        return driver;
    }

    @After("@selenium")
    public void closeBrowser(Scenario scenario) {

        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
            scenario.write("scenario failed");
        }else {
            scenario.write("Scenario passed");
        }
        driver.close();
        driver.quit();
        driver = null;
    }
}
