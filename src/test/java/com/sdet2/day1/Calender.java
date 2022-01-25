package com.sdet2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender 
{
	public static void main(String[] args) 
	{
		String expected="March 2022";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		String actual = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
		System.out.println(actual);
		
		while (!actual.equalsIgnoreCase(expected))
		{
			//System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]")).getText());
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			break;
		}
		
		driver.findElement(By.xpath("//"))
		
		
	}

}
