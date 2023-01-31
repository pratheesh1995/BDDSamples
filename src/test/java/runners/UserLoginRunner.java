package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = "src//test//resources//features//UserLogin.feature",
	
			// features = "src//test//resources//features//", to run all test case
	glue = "stepdefs",
	monochrome=true,
	dryRun=false,    
	plugin = {"pretty"}
	
			
)
	
public class UserLoginRunner extends AbstractTestNGCucumberTests
{

//	@DataProvider(parallel=true) 
//	public Object[][] scenarios() 
//	{
//		return super.scenarios();
//	}
}
