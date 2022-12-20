package demo.tutorialninja.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


// Very important line @Runwith should be from junit

@RunWith(Cucumber.class)
@CucumberOptions(
        // Feature file path by right click on feature folder and copy path of folder use root path
        features = "src/test/java/resources/featurefile",
        // path copy as root source
        glue = "demo/tutorialninja",
        // To generate report and path of the file and extend report as well as jason
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                "json:target/RunCuke/cucumber.json"
        },
        tags = "@sanity"
        // Grouping in cucumber
        // To give more tag use curly brackets
        //tags = {"@smoke"}

)

public class SanityRunner {

    @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.9");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }
}
