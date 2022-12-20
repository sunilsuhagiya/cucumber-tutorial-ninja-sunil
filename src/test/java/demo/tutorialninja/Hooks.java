package demo.tutorialninja;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import demo.tutorialninja.propertyreader.PropertyReader;
import demo.tutorialninja.utility.Utility;

import java.io.IOException;


public class Hooks extends Utility {
    // Make sure @Before is selected for cucumber.api.java
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    // Make sure @After is selected for cucumber.api.java
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        closeBrowser();
    }
}
