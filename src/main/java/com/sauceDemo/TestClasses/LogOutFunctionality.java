package com.sauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.Loginpage;


public class LogOutFunctionality 
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
		System.out.println("Implicit wait is applied");
		
		Loginpage li=new Loginpage(driver);
		li.sendusername();
		li.sendpassword();
		li.loginclick();
		
		HomePage hp=new HomePage (driver);
		hp.clickmenubutton();
		System.out.println("click on menu button");
		hp.Logoutclick();
		System.out.println("click on logout button");
		
		String ExpectedLogoutUrl="https://www.saucedemo.com/";
		System.out.println("ExpectedLogoutUrl-"+ExpectedLogoutUrl);
		
		String ActualLogoutUrl=driver.getCurrentUrl();
	    System.out.println("ActuallogoutUrl is-"+ActualLogoutUrl);
		
		System.out.println("validating logout functionality");
		
		if(ExpectedLogoutUrl.equals(ActualLogoutUrl))
		{
			System.out.println("sucessfully logout from application");
			System.out.println("Logout test case is Passed");
		}
		
		else
		{
			System.out.println("Logout Functionality failed");
			System.out.println("logout test case is failed");
			
		}
		
		
		
		
	}

}
