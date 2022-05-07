package UtilityPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sauceDemo.TestClasses.BaseTestClass;

public class Listeners implements ITestListener
{
	WebDriver driver;
	public void onTestStart(ITestResult result)
	{
		System.out.println("Execution is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case successfully passed");
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case fail and hence take screenshot");
		this.driver=(( BaseTestClass )result.getInstance()).driver;
		try {
			UtilityClass.TakeScreenshot(driver);
		} catch (IOException e) 
		{
			System.out.println("error");
		}
	}

}
