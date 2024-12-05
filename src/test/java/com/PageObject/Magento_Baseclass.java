package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Magento_Baseclass
{
	public static WebDriver driver;
	public Magento_Baseclass(WebDriver driver)
	{
		 this.driver=driver;
		  
		  PageFactory.initElements(driver, this); 
	}

}
