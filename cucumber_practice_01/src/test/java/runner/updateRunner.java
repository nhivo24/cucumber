package runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Feature"
,glue= "stepdefinitions",
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
monochrome = true  
        )
public class updateRunner {
	@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File("config/report.xml"));
		}
}
