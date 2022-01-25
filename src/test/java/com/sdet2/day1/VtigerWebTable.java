package com.sdet2.day1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.generic.loginPage;

public class VtigerWebTable 
{
	@Test
	public void orgPresent() throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
        loginPage lg = new loginPage(driver);
		lg.loginintoApp();
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		List<WebElement> org = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr"));
		   int size=org.size();
		  
    	for(int i=3;i<=size-1;i++)
     	{
		 String ben =driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+i+"]/td[3]")).getText();
         System.out.println(ben);
         if(ben.equals("Ezra572"))
         {
        	 System.out.println("present");
        	 break;
         }
		}
	}
}
