package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement FN;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement LN;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalcode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement coninue1;
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancel;
	
	public YourInformationPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendFirstName() 
	{
		
		FN.sendKeys("Danial");

    }
	
	public void SendLastName()
	{
		LN.sendKeys("sams");
	}
	
	public void SendPostalCode()
	{
		postalcode.sendKeys("123");
		
	}
	public void Continue1Click()
	{
		coninue1.click();
		
	}
	public void Cancel1()
	{
		cancel.click();
		
	}
}
