package com.sauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;
@Listeners(UtilityPackage.Listeners.class)
public class BaseTestClass 
{   WebDriver driver;
Logger log;
@Parameters("browsername")
@BeforeClass
public void Browserpoen(String browsername)
{
	if(browsername.equals("chrome"))
	{

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.out.println("set properties for browser");
	 
	 driver=new ChromeDriver();
	System.out.println("browser is open");
	}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "F:\\chrome\\geckodriver.exe");
		System.out.println("set properties for browser");
		 
		 driver=new FirefoxDriver();        ;
		System.out.println("browser is open");
		
	}
	else
	{
		System.out.println("error");
	}
	
	 log=Logger.getLogger("MSauceDemo");
	PropertyConfigurator.configure("log4j.properties");
	
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
	log.info("browser is maximized");
	
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL Open");
	log.info("URL open");
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	System.out.println("Implicit wait is applied");
	log.info("wait applied");
	
	
}
	
	@BeforeMethod
	public void SetUp()
	{
		
		Loginpage li=new Loginpage(driver);
		li.sendusername();
		log.info("username passed");
		li.sendpassword();
		log.info("password pass");
		li.loginclick();
		log.info("login click");
		
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		HomePage hp=new HomePage (driver);
		hp.clickmenubutton();
		System.out.println("click on menu button");
		hp.Logoutclick();
		System.out.println("click on logout button");
		driver.close();
	}
	
	@AfterClass
	public void browserClose()
	{
		driver.quit();
		System.out.println("Browser close method");
		log.info("logout");
		
	}
	
	
}
