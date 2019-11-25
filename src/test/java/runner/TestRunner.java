package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:features",
		glue={"stepDefinitions"},
		//tags = {"@First", "@Second"},
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
		        monochrome = true
		                )
		

public class TestRunner {
	
	 @AfterClass
	    public static void writeExtentReport() {
	        Reporter.loadXMLConfig(new File("config/report.xml"));
	 }
	
	
}
