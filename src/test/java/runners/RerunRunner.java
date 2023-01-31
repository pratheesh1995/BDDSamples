package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = "@target/failedScenarios.txt",
	glue = "stepdefs",
	monochrome=true,
	dryRun=false
)

public class RerunRunner extends AbstractTestNGCucumberTests

{

}
