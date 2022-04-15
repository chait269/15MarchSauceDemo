package UtilityPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
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
		
	}

}
