package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
	features = "src//test//resources//features//",
	glue = "stepdefs",
	monochrome=true,
	dryRun=false,    //It will display missing method if we keep "true"
	plugin = {"pretty", "html:target/CucumberReports/HtmlReport.html",
			 // "usage:target/CucumberReports/UsageReport",
			//  "json:target/CucumberReports/JsonReport.json",
			//  "testng:target/CucumberReports/TestNGReport.xml",
			//  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			  "rerun:target/failedScenarios.txt" // Running failed test cases, we have to create one more runner class tp execute failed test case alone 
			} // folder can be any name
)

public class GooglePageRunner extends AbstractTestNGCucumberTests
{
	
}