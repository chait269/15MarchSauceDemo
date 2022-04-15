package UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	public static void TakeScreenshot(WebDriver driver) throws IOException
	{
		Date date=new Date();
		DateFormat d=new SimpleDateFormat("MM-dd-yy& HH-mm-ss");
		String NewDate=d.format(date);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		File Dest=new File("F:\\filpkart\\img" +NewDate+".jpg");
		FileHandler.copy(Source, Dest);
		
	}

}
