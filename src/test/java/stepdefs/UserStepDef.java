package stepdefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserStepDef 

{
	
	WebDriver driver;

	@Given("User is on Login page")
	public void user_is_on_login_page() 
	{
		 	WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
	}
	
	//@When("User enters login cred")
	 // public void user_enters_login_cred() 
	// {
		// driver.get("http://the-internet.herokuapp.com/login");
	   //  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	   // driver.findElement(By.cssSelector("input[name=password]")).sendKeys("SuperSecretPassword!");
       // driver.findElement(By.className("radius")).click();
	    
	//}
	

//@When("User enters {string} and {string}")
//public void user_enters_and(String strUsr, String strPwd) 
//{
//	driver.get("http://the-internet.herokuapp.com/login");
//    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUsr);
//    driver.findElement(By.cssSelector("input[name=password]")).sendKeys(strPwd);
//    driver.findElement(By.className("radius")).click();
//}

//@When("User enters login cred") //fetching dataTable as list
//public void user_enters_login_cred(DataTable dataTable)
//
//{
//	driver.get("http://the-internet.herokuapp.com/login");
//	String strUsr;
//	String strPwd;
//	List<List<String>> creds = dataTable.asLists();
//	strUsr = creds.get(0).get(0);
//	strPwd = creds.get(0).get(1);
//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUsr);
//    driver.findElement(By.cssSelector("input[name=password]")).sendKeys(strPwd);
//    driver.findElement(By.className("radius")).click();
//}

@When("User enters login cred") //fetching dataTable as Maps
public void user_enters_login_cred(DataTable dataTable)

{
	driver.get("http://the-internet.herokuapp.com/login");
	String strUsr;
	String strPwd;
	List<Map<String, String>> creds = dataTable.asMaps();
	strUsr = creds.get(0).get("username");
	strPwd = creds.get(0).get("password");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUsr);
    driver.findElement(By.cssSelector("input[name=password]")).sendKeys(strPwd);
    driver.findElement(By.className("radius")).click();
}
	@Then("Should navigate to Home page")
	public void should_navigate_to_home_page() 
	{
		boolean isValidUser = driver.findElement(By.cssSelector(".flash.success")).isDisplayed();
        Assert.assertTrue(isValidUser);
	}
}
