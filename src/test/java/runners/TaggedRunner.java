package runners;

import java.util.List;

import org.testng.annotations.BeforeTest;

import io.cucumber.core.options.RuntimeOptions;
import io.cucumber.cucumberexpressions.Expression;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = "src//test//resources//taggedFeatures//",
	
			// features = "src//test//resources//features//", to run all test case
	glue = "stepdefs",
	monochrome=true,
	//tags="@SmokeTest",
	//tags="@RegressionTest",//It will execute only smoke test
	//tags="@SmokeTest and @RegressionTest",
	//tags="@SmokeTest or @RegressionTest",
	//tags="not @RegressionTest",
	//tags="@PhaseOne",
	//tags="@PhaseOne and @SmokeTest", //It will execute smokeTest of phaseOne alone
	//tags="@PhaseTwo and not @SmokeTest", //It will not execute smokeTest 
	//tags="@PhaseTwo and not @SmokeTest or @PhaseOne and @SmokeTest",
	//tags="@PhaseOne and not @SmokeTest and not @RegressionTest", 
	//tags="@PhaseOne and @SmokeTest",
	tags="@PhaseTwo"
	
	)

public class TaggedRunner extends AbstractTestNGCucumberTests
{
//	@BeforeTest
//	public void setTags()
//	{
//		Runtime.Builder rb = Runtime.builder();
//		RuntimeOptions ro = RuntimeOptions.defaultOptions();
//		List<Expression> tagEx = ro.getTagExpressions();
//	}
}
