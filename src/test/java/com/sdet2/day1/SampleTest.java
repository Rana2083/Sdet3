package com.sdet2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest 
{ 
	@Test
	public void pass_parameter()
	{
		WebDriver driver;
		String Browser = System.getProperty("browser");
		String url = System.getProperty("url");
		System.out.println(Browser);
		System.out.println(url);
		
	
		if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.get(url);
	}

}
