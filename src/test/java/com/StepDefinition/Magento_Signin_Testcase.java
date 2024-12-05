package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObject.Magento_Signin_Pageobject;

import io.cucumber.java.en.*;

public class Magento_Signin_Testcase 
{
	public static WebDriver driver;
	Magento_Signin_Pageobject msp;
	@Given("browser is open")
	public void browser_is_open() 
	{
		driver=new ChromeDriver();
	    
	}

	@Given("the user should be on the Magento home page")
	public void the_user_should_be_on_the_magento_home_page()
	{
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		msp=new Magento_Signin_Pageobject(driver);
	    
	}

	@When("the user clicks on the Sign In link")
	public void the_user_clicks_on_the_sign_in_link() 
	{
		msp.clickSignInLink();
	    
	}

	@When("user enter (.*)and  (.*)$")
	public void user_enter_email_and_password(String Email,String password)
	{
		msp.setEmail(Email);
		msp.setPass(password);
	   
	}

	@When("user clicks the sign in button")
	public void user_clicks_the_sign_in_button() 
	{
		msp.clickSigninBtn();
	    
	}

	@Then("user should succussfully completed the login functionality")
	public void user_should_succussfully_completed_the_login_functionality()
	{
		System.out.println("sucessfully login into application");
	    
	}

	@Then("user should naviagated into My Home page")
	public void user_should_naviagated_into_my_home_page() 
	{
		String Exp_title= driver.getTitle();
		String Act_tittle= "Home Page";
		
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

	@Then("the user should see a welcome message Thank you for registering with Main Website Store.")
	public void the_user_should_see_a_welcome_message_thank_you_for_registering_with_main_website_store()
	{
		System.out.println("thank_you_for_registering_with_main_website_store");
	    
	}

}
