package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

public class TC05FilterFunctionality extends  BaseTestClass 
{
	@Test
	public void FilterFunctionality ()
	{
		
		HomePage hp=new HomePage (driver);
		hp.Filterclick();
		log.info("Click on filter");
		 String ActualPriceTag=hp.GetpriceText();
		 log.info("Actual tag is-"+ActualPriceTag);
		 String ExpectedPriceTag="Price (high to low)";
		 log.info("ExpectedProceText is-"+ExpectedPriceTag);
		 Assert.assertEquals(ActualPriceTag,ExpectedPriceTag,"Failed filter test case");
		 
		 log.info("Filter is applied Sucessfully");
		 
	
    }

}
