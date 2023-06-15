package Runner;

import com.aventstack.extentreports.ExtentReports;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@CucumberOptions(
        features = "src/test/java/features/login.feature", //the path of the feature files
        glue={"stepDefinitions"}, //the path of the step definition files
        plugin = {"pretty","json:target/cucumber-reports/reports.json",

                "junit:target/cucumber-reports/Cucumber.xml",

                "html:target/cucumber-reports/reports2.html"},
        monochrome = true, //display the console output in a proper readable format

        dryRun = false //to check the mapping is proper between feature file and step def file
)
@RunWith(Cucumber.class)
public class TestRunner {

}