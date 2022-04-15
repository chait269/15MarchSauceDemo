package com.sauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.CartPage;
import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;
import com.sauceDemo.POMClasses.Overview;
import com.sauceDemo.POMClasses.YourInformationPage;

public class TC12TotBillCheckFunctionality 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chrome\\chromedriver.exe");
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
		System.out.println("click on cart container");
		
		CartPage cp=new CartPage(driver);
		cp.Checkout1Click();
		System.out.println("click on checkout button");
		
		YourInformationPage yip=new YourInformationPage(driver);
		yip.sendFirstName();
		System.out.println("First Name is entered");
		
		yip.SendLastName();
		System.out.println("Last name is Entered");
		
		yip.SendPostalCode();
		System.out.println("send postal code");
		
		yip.Continue1Click();
		System.out.println("Click on continue button");
		
		Overview ov=new Overview(driver);
		String ActualTotalText=ov.GetTotalText();
		System.out.println("Actual total value is-"+ActualTotalText);
		
		String ExpectedTotalText="Total: $58.29";
		System.out.println("Expected total value is-"+ExpectedTotalText);
		
		if(ExpectedTotalText.equals(ActualTotalText))
		{
			System.out.println("Total value of product calculated correctly");
			System.out.println("Test Case is passed");
		}
		else
		{
			System.out.println("Total value of product is calculated incorrectly");
			System.out.println("Test case is Failed");
		}
		
		
	}

}
