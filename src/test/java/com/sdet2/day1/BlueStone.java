package com.sdet2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BlueStone 
{
	@Test
	public void sceanrio1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Search']")).click();

		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Price']"))).perform();

		driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();

		List<WebElement> totalrings = driver.findElements(By.xpath("//span[@id='bst-discounted-price']"));
		for(int i=0;i<totalrings.size();i++)
		{
			String[] price = totalrings.get(i).getText().split("[.]");
			//System.out.println(price[1]);
//			//RS.6,500
//			//RS[0] 6,500[1]
            String[] pr = price[1].split(",");
            String pric=pr[0]+pr[1];
            //System.out.println(pric);
            int price1=Integer.parseInt(pric);
		    if(price1<10000)
		    {
		    	System.out.println(+price1+ "is lessthan 10000");
		    }
			
			
		}
	}

	@Test
	public void sceanraio2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Search']")).click();
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Price']"))).perform();
		driver.findElement(By.xpath("//label[@for='filter_ndd']/span")).click();

		List<WebElement> totalrings = driver.findElements(By.xpath("//a[@target='_blank' and @class='link-overlay']"));
		for(int i=0;i<totalrings.size();i++)
		{
			String[] price = totalrings.get(i).getText().split(".");
		    String[] pr = price[1].split(",");
		    String pric=pr[0]+pr[1];
		    int price1=Integer.parseInt(pric);
		    if(price1<10000)
		    {
		    	System.out.println(+price1+ "is lessthan 10000");
		    }
		}
	}
}
