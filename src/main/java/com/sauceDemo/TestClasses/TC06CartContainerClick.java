package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

public class TC06CartContainerClick extends BaseTestClass 
{
	@Test 
	public void CartContainerClick() 
	{
		
		HomePage hp=new HomePage (driver);
		hp.ADDToCartAll();
		log.info("All container added to cart");
		hp.Cartcontainerclick();
		log.info("Click on container");
		
		String ExpectedCartPageUrl="https://www.saucedemo.com/cart.html";
		log.info("Expected Cart page url is-"+ExpectedCartPageUrl);		
		String ActualPageUrl=driver.getCurrentUrl();
		log.info("Actual Cart PageUrl is-"+ActualPageUrl);
		
		log.info("validating all products sucessfully moved to the cart page");
		
		Assert.assertEquals( ActualPageUrl, ExpectedCartPageUrl, "failed to click on cart container");
		log.info("After Clicking On cart button We sucessfully moved to cart page");
		
		
		
	}

}
