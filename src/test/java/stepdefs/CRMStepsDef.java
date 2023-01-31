package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepsDef 
{

	@Before(value="@RegressionTest", order=1) //different pre-req we have to use tagged hooks with ordering
	public void readFromPF()
	{
		System.out.println("Read From property file");
	}
	@Before(value="@RegressionTest", order=2)
	public void connectDB()
	{
		System.out.println("Connect with DB");
	}
	@Before(value="@SmokeTest", order=1)
	public void readFromPFSmoke()
	{
		System.out.println("Read From property file for SmokeTest");
	}
	@Before(value="@SmokeTest", order=2)
	public void connectDBSmoke()
	{
		System.out.println("Connect with SmokeTest DB");
	}
//	@Before(order=2)
//	public void initBrowserSmoke()
//	{
//		System.out.println("Init Browser SmokeTest each Scenario.....");
//	}
//	@BeforeAll
//	public static void setup()
//	{
//		System.out.println("Before All Scenarios.....");
//	}
//	@Before("@SmokeTest") //hooks
//	public void initBrowserSmoke()
//	{
//		System.out.println("Init Browser SmokeTest each Scenario.....");
//	}
//	@Before("@RegressionTest")
//	public void initBrowserReg()
//	{
//		System.out.println("Init Browser RegressionTest each Scenario.....");
//	}
//	@After
//	public void teardown()
//	{
//		System.out.println("Close the driver after each scenario.....");
//	}
	@Given("User is logged in")
	public void user_is_logged_in() 
    {
		System.out.println("user is logged in");
    }
    
    @When("user create a Contact")
	public void user_create_a_contact() 
	{
	   System.out.println("User create a contact");
	}
    
	@When("User update a Contact")
	public void user_update_a_contact() 
	{
	   System.out.println("User Update a contact");
	}
	
	@When("User Delete a Contact")
	public void user_delete_a_contact() 
	{
	   System.out.println("User Delete a contact");
	}
	
	@When("user create a Deals")
	public void user_create_a_deals() 
	{
		System.out.println("Create a deals");
	    
	}
	
	@When("User update a Deals")
	public void user_update_a_deals() 
	{
		System.out.println("Update a deals");
	    
	}
	
	@When("User Delete a Deals")
	public void user_delete_a_deals() 
	{
		System.out.println("Delete a deals");
	    
	}
	
	 @When("user create a task")
	    public void user_create_a_task() 
	    {
	    	System.out.println("create a task");
	    }
	    
	 @When("User update a task")
	    public void user_update_a_task() 
	    {
	    	System.out.println("Update a task");
	    }
	    
	 @When("User Delete a task")
	    public void user_delete_a_task() 
	    {
	    	System.out.println("Delete a task");
	    }
	    
	
}
