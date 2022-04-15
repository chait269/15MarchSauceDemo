package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;

public class Tc04AddToCartMutipleElement extends  BaseTestClass 
{
	@Test(priority=4)
	public void AddToCartMutipleElement() 
	{
	HomePage hp=new HomePage (driver);
	hp.ADDToCartAll();
	log.info("Add to cart muliipal product");
	String Actualcontainertext=hp.CartContainergetText();
	log.info("ACtualcontainerText is-"+Actualcontainertext);
	
	String Expectedcontainertext="3";
	log.info("Expected container Text is -");
	
	log.info("validating muliple product added to cart or not");
	Assert.assertEquals(Actualcontainertext, Expectedcontainertext, "failed to click multiple elements");
		log.info("multiple producrs are Added to cart");

	
	
     }

}
