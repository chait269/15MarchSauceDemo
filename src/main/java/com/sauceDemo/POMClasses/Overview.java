package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overview 
{
	private WebDriver driver;
	
@FindBy(xpath="//button[@id='finish']")
private WebElement Finish;

@FindBy(xpath="//button[@id='cancel']")
private WebElement cancel;

@FindBy(xpath="//div[text()='58.29']")
private WebElement Total;

public Overview(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
}

public String GetTotalText()
{
	String TotalTexT=Total.getText();
	return TotalTexT;
}
public void FinishClick()
{
	 Finish.click();
	
}
public void cancelclick()
{
	cancel.click();
	
}



}
