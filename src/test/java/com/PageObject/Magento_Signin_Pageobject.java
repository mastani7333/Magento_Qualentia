package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Magento_Signin_Pageobject extends Magento_Baseclass
{
	 WebDriver driver;
	public Magento_Signin_Pageobject(WebDriver driver)
	{
		super(driver);
	}
	
	//finding elements 
	@FindBy(xpath="(//li[@class='authorization-link'])[1]/a")
	WebElement signInLink;
	@FindBy(id="email")
	WebElement emailInput;
	@FindBy(id="pass")
	WebElement passInput;
	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	WebElement signIn;
	//performing actions
	public void clickSignInLink()
	{
		signInLink.click();
	}
	public void setEmail(String mail)
	{
		emailInput.sendKeys(mail);
	}
	public void setPass(String pass)
	{
		passInput.sendKeys(pass);
	}
	public void clickSigninBtn()
	{
		signIn.click();
	}

}
