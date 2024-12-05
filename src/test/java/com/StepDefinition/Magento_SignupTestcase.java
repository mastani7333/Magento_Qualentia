 package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObject.Magento_Signup_Pageobject;

import io.cucumber.java.en.*;


public class Magento_SignupTestcase
{
	public static WebDriver driver;
	Magento_Signup_Pageobject sp;
	@Given("Browser is open and open the application")
	public void browser_is_open_and_open_the_application() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		sp=new Magento_Signup_Pageobject(driver);
	    
	}

	@Given("the user is on the Magento home page")
	public void the_user_is_on_the_magento_home_page()
	{
		System.out.println("user enter into magento_home_page");
	    
	}

	@When("the user clicks on the Create an Account link")
	public void the_user_clicks_on_the_create_an_account_link() 
	{
		
	    sp.click_CreateAccLink();
	}

	@When("the user redirected to create New Customer Account page")
	public void the_user_redirected_to_create_new_customer_account_page()
	{
		
	  System.out.println("New Customer Account page is opened");
	}

	@When("User enters the First and Last name")
	public void user_enters_the_first_and_last_name() 
	{
		sp.setFirstName("shaik");
		sp.setLastName("mastani");
	   
	}

	@When("User enters the  valid Email, Strong Password and Confirm Password")
	public void user_enters_the_valid_email_strong_password_and_confirm_password() 
	{
		sp.setMail("shahajadalam@gmail.com");
		sp.setPassword("Shad@123");
		sp.cnfrmPassword("Shad@123");
	    
	}

	@When("clicks on the Create an Account button")
	public void clicks_on_the_create_an_account_button() 
	{
		sp.click_CreateAcc_Btn();
	    
	}

	@Then("the user should see a success message Thank you for registering with Main Website Store.")
	public void the_user_should_see_a_success_message_thank_you_for_registering_with_main_website_store() 
	{
		
	    System.out.println("Thank you for registeration");
	}

	@Then("the user should be redirected to the account dashboard")
	public void the_user_should_be_redirected_to_the_account_dashboard()
	{
		String Exp_title= driver.getTitle();
		String Act_tittle= "My Account";
		
		if(Exp_title.equals(Act_tittle)) {
			
			Assert.assertTrue(true);
			
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
			Assert.assertTrue(false);
		}
		
	   
	}


}
