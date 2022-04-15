package com.sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	private WebDriver driver;
	//TC02
	@FindBy(xpath="//a[@id='item_4_img_link']")
	private WebElement item4;
	
	
	//Tc03
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement AddToCart;
	
	@FindBy(xpath="(//html//div//button)[1]")
	private WebElement Remove;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> addtobutton;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menu;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement Logout;
	
	@FindBy(xpath="//span[text()='3']")
	private WebElement cartcontainer;
	
	@FindBy(xpath="//select[@class='product_sort_container']")	
	private WebElement filter;
	
	@FindBy(xpath="//option[text()='Price (high to low)']")
	private WebElement price;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Clickonimg()
	{
		item4.click();
	}
	
	public void AddToCartClick()
	{
		AddToCart.click();
	}
	
	public String Gettext1()
	{
		String ElementText=Remove.getText();
		
		return ElementText;

	}
	
	public void ADDToCartAll()
	{
		for(int i=0;i<addtobutton.size();i++)
		{
			addtobutton.get(i).click();
		}
	}
	
	public void clickmenubutton()
	{
		menu.click();
	}
	public void Logoutclick()
	{
		Logout.click();
	}
	
	public String CartContainergetText()
	{
		String cartcontainertext=cartcontainer.getText();
		return cartcontainertext;
		
	}
	
	public void Cartcontainerclick()
	{
		cartcontainer.click();
		
	}
	
	public void Filterclick() 
	{
		filter.click();
		Select s=new Select(filter);
		s.selectByValue("hilo");
		
	}
	public String GetpriceText()
	{
		String pricetag=price.getText();
		return pricetag;
	}

	
	}



