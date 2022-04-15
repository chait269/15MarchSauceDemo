package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

public class TC03AddToCartSingleElement extends BaseTestClass 
{ 
	
	@Test(priority=3)
	public void AddToCartSingleElement()
	{
		HomePage hp=new HomePage (driver);
		hp.AddToCartClick();
		
		log.info("product is added to cart");
		
		String ActualText=hp.Gettext1();
		
		log.info("Actual text is-"+ActualText);
		
		String ExpectedText="REMOVE";
		Assert.assertEquals(ActualText,  ExpectedText,"Fail to Add to cart product");
		log.info("product is added to cart successfully");
		
		
		
		
	}

}
