package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Magento_Signup_Pageobject extends Magento_Baseclass
{
	 WebDriver driver;
	public Magento_Signup_Pageobject(WebDriver driver)
	{
		super(driver);
	}
	//finding elements
	@FindBy(xpath="//div[@class='panel header']/ul/li[3]/a")
	WebElement createAccountLink;
	@FindBy(xpath="//input[@id='firstname']")
	WebElement FirstName;
	@FindBy(xpath="//input[@id='lastname']")
	WebElement LastName;
	@FindBy(xpath="//input[@id='email_address']")
	WebElement emailBox;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement confirmPassword;
	@FindBy(xpath="//button[@class='action submit primary']")
	WebElement createAccBtn;
	//performing actions
	public void click_CreateAccLink()
	{
		createAccountLink.click();
	}
	public void setFirstName(String firstName)

	{
		FirstName.sendKeys(firstName);
	}
	public void setLastName(String lastName)
	{
		LastName.sendKeys(lastName);
	}
	public void setMail(String email)
	{
		emailBox.sendKeys(email);
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void cnfrmPassword(String cnfrmPass)
	{
		confirmPassword.sendKeys(cnfrmPass);
	}
	public void click_CreateAcc_Btn()
	{
		createAccBtn.click();
	}

}
