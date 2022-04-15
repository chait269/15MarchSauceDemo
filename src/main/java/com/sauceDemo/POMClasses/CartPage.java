package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
private WebDriver driver;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement Checkout1;
	
	@FindBy(xpath="// button[@id='remove-sauce-labs-backpack']")
    WebElement remove1cart;
	
	@FindBy(xpath="// button[@id='continue-shopping']")
	WebElement ContinueShopping;
	
	public CartPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Checkout1Click()
	{
		Checkout1.click();
		
	}
	
	public void Remove1Click()
	{
	    remove1cart.click();
		
	}
	public void ContinueShoppingClick()
	{
		ContinueShopping.click();
		
	}

	
}
