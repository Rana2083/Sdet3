package com.sdet2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Qspider");
		driver.findElement(By.xpath("//ul[@jsname='bw4e9b']//li)).click();

	}

}
