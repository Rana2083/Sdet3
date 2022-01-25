package com.sdet2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakemyTrip
{
	@Test
	public void calender() throws InterruptedException
	{
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath(" //div[@class=\'landingContainer']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='fromCity']")).click();
	
	driver.findElement(By.id("fromCity")).sendKeys("chen");
	driver.findElement(By.xpath( "//div[@id='react-autowhatever-1']//p[text()='Chennai, India']")).click();
	driver.findElement(By.xpath(" //div[@class=\"fsw_inputBox searchToCity inactiveWidget \"] ")).click();
	driver.findElement(By.id("toCity")).sendKeys("abh");
	driver.findElement(By.xpath("//div[@class='calc60'] //p[text()='Abu Dhabi, United Arab Emirates']")).click();
	}

}
