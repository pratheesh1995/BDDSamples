package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef 
{
	
    WebDriver driver;
	@Given("User is on Google home page")
	public void user_is_on_google_home_page() 
	{
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() 
	{
	   WebElement searchbox = driver.findElement(By.name("q"));
	   searchbox.sendKeys("Java Tutorial");
	   searchbox.submit();
	}
	@Then("Should display Java Result page")
	public void should_display_java_result_page() 
	{
	    Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	}
    
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() 
	{

		   WebElement searchbox = driver.findElement(By.name("q"));
		   searchbox.sendKeys("Selenium Tutorial");
		   searchbox.submit();
	}
	@Then("Should display Selenium Result page")
	public void should_display_selenium_result_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	    
	}
		
	@When("User search Cypress Tutorial")
	public void user_search_cypress_tutorial()
	{
		WebElement searchbox = driver.findElement(By.name("q"));
		   searchbox.sendKeys("Cypress Tutorial");
		   searchbox.submit();
	}
	@Then("Should display Cypress Result page")
	public void should_display_cypress_result_page()
	{
		Assert.assertEquals(driver.getTitle(), "Cypress Tutorial - Google Search");
	}
	@After // hooks ....execute after each scenario
	public void attachScreenshot(Scenario scenario)
	{
		if(scenario.isFailed()) 
		{
			TakesScreenshot screen = (TakesScreenshot)driver;
			byte[] img = screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img, "image/png", "FailureImage");
		}
	}
}

	
