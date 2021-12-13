package com.sdet2.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukariTest
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> windowid=driver.getWindowHandles();
		
		for(String id:windowid)
		{
			String winname=driver.switchTo().window(id).getTitle();
			System.out.println(winname);
			if(winname.equalsIgnoreCase("Cognizant"))
			{
				driver.manage().window().maximize();
			}
		     
	    }
		
	}

}
