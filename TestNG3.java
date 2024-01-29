package com.kruthika.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestNG3 
//Main method
{
public static void main(String[] args)
{
	
//Launch application    
		WebDriver driver = new ChromeDriver();
      driver.get("http://live.techpanda.org/");
		driver.manage().window().maximize();
//Verify Home Page Title
		String exptitle = "Home page";
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
//If Else Condition		
		if (exptitle.equals(acttitle))
		{
			System.out.println("Home page title is verified");
		}
		else
		{
			System.out.println("Home page title is not being verified");
		}
//click on mobile		
		driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
//Verify mobile page title
		String exptitle1 = "Mobile";
		String acttitle1 = driver.getTitle();
		System.out.println(acttitle1);
//If Else Condition
		if (exptitle1.equals(acttitle1))
		{
			System.out.println("Home page title is verified");
		}
		else
		{
			System.out.println("Home page title is not being verified");
		}
//drop down handling display all options and select name 		
		  Select select = new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
	        List<WebElement>list=select.getOptions();
	        System.out.println("The dropdown options are : ");
	        for(WebElement Options : list)
	        System.out.println(Options.getText());
	        select.selectByVisibleText("Name");
//Verify the value of the mobile 100$
	       String Xperia = driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span")).getText();
	       System.out.println(Xperia);
//Click on Xperia Image	        
		    driver.findElement(By.id("product-collection-image-1")).click();
//Add to cart handle push button
		    WebElement radioElement = driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[4]/div/div/div[2]/button"));
		    boolean selectstate = radioElement.isSelected();
		    if (selectstate == false)
		    {
		    	radioElement.click();
		    	System.out.println("SonyXperia added to the cart");
		    }
//change QTY to 1000
		    driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).sendKeys("000");
		    driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button")).click();
//Verify the error
		    String msg1 = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")).getText();
		    System.out.println(msg1);
//click on Empty cart
		    driver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]/span/span")).click();
//Verify the message shopping cart is empty
		    String msg2 = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1")).getText();
		    System.out.println(msg2);
//Quit the page
		    driver.close();
}
}

