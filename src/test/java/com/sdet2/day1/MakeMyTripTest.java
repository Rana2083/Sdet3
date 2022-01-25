package com.sdet2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTripTest 
{
	@Test
	public void calender() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click on login
		driver.findElement(By.className("landingContainer")).click();
		
		//click on close button
		driver.findElement(By.className("langCardClose")).click();
		
		//select from Flight
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
	     Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin '] //input[@placeholder='From']")).sendKeys("chen");
		driver.findElement(By.xpath("//div[text()='MAA']")).click();
		
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin makeFlex column spaceBetween'] //input")).sendKeys("pune");
		driver.findElement(By.xpath("//div[text()='PNQ']")).click();
		
		
		
		
	}

}
