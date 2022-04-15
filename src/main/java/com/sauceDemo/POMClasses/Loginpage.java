package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
private WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement Login;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername()
	{
		Username.sendKeys("standard_user");
	}
	public void sendpassword()
	{
		 Password.sendKeys("secret_sauce");
		
	}
	public void loginclick()
	{
		Login.click();
	}

}
