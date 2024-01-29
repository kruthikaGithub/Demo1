package com.kruthika.testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG2
{
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
{
	
	//FirefoxDriver driver=new FirefoxDriver();
	
	//System.setProperty("webdriver.chrome.driver","E:\\VIVEK_SELENIUM\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver","E:\\VIVEK_SELENIUM\\chromedriver.exe");
	//WebDriver driver = new FirefoxDriver();
	 driver = new ChromeDriver();
System.out.println("I am Before Logic");
	
}
	@Test
	public void testLogic()
	{
		driver.get("https://google.com");
	String url=driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
//System.out.println(driver.getPageSource());
	driver.navigate().to("http://facebook.com");
	System.out.println("successfully navigated to other page");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	System.out.println("I am the Logic");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I am After Logic");
	driver.close();
	
		
	}
}
