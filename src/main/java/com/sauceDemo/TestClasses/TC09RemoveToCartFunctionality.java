package com.sauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.CartPage;
import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

public class TC09RemoveToCartFunctionality 
{
	public static void main(String[] args) 
	{System.setProperty("webdriver.chrome.driver", "F:\\chrome\\chromedriver.exe");
	System.out.println("set properties for browser");
	 
	WebDriver driver=new ChromeDriver();
	System.out.println("browser is open");
	
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
	
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL Open");
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Loginpage li=new Loginpage(driver);
	li.sendusername();
	System.out.println("username entered");
	li.sendpassword();
	System.out.println("password entered");
	li.loginclick();
	System.out.println("login button click");
	HomePage hp=new HomePage (driver);
	hp.ADDToCartAll();
	System.out.println("All container added to cart");
	hp.Cartcontainerclick();
	System.out.println("click on container button");
	
	CartPage cp=new CartPage(driver);
	cp.Remove1Click();
		
	}

}
