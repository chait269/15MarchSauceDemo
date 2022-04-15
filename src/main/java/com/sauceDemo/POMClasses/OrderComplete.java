package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderComplete
{
	private WebDriver driver;
	private Actions act;
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement Thankyou;
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement Home;
	
	public OrderComplete(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		 act=new Actions(driver);
		
	}
	public String ThanktouTextMessage()
	{
		String ThankYouM=Thankyou.getText();
		
		return ThankYouM;
			
	}
	
	public void ClickHomePage()
	{
		Home.click();
		
	}
	
	
	
	
	
}
