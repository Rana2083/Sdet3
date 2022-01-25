package com.sdet2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IccWebTable 
{
	/**
	 * Getting team Name using Rank
	 */
	@Test
	public void webtable()
	{
		WebDriver driver=new ChromeDriver();

		String ran="2,480";

		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");

		List<WebElement> Ranking = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));

		for(int i=1;i<Ranking.size();i++)
		{

			String rank = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
			//3200,2000,1000,11
			if(rank.equalsIgnoreCase(ran))
				//3200==2480
			{
				String teamname = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				System.out.println(teamname);
				break;

			}


		}		
	}

	@Test
	public void webtablesplit()
	{
		WebDriver driver=new ChromeDriver();

		int ran=896;

		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");

		List<WebElement> Ranking = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for(int i=1;i<Ranking.size();i++)
		{
          String rank = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
			
          if(ran>1000)
          {
          String[] ram = rank.split(",");
          String ram1=ram[0]+ram[1];
          System.out.println(ram1);  
		  int Rank=Integer.parseInt(rank);
      
            if(Rank==ran)
			{
				String teamname = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				System.out.println(teamname);
				break;	
			}
            else {
            	System.out.println("");
            }
          }
            else {
            	String teamname = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				System.out.println(teamname);
				break;
            }
          }

          }
		
	

	/**
	 *$$$$$ *****From points getting teamname****$$$$
	 */
	@Test
	public void webtable2()
	{
		WebDriver driver=new ChromeDriver();

		String ran="124";

		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");

		List<WebElement> Ranking = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for(int i=1;i<Ranking.size();i++)
		{
			String rank = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

			if(rank.equalsIgnoreCase(ran))
			{
				String teamname = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				System.out.println(teamname);
				break;
			}

		}

	}
	
	/**
	 * Getting last Row
	 */
	@Test
	public void getlatteam()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		
		String teamname = driver.findElement(By.xpath("(//table/tbody/tr/td[2])[last()]")).getText();
		System.out.println(teamname);	
	}
	
	/**
	 * Lenskart get dropdown values
	 * @throws InterruptedException 
	 */
	@Test
	public void Lenskart() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).click();
		Thread.sleep(3000);
		List<WebElement> drop = driver.findElements(By.xpath("//div[@class='trending_block']/ul/li"));
	     
		for(int i=1;i<drop.size();i++)
		{	
			String dd = driver.findElement(By.xpath("//div[@class='trending_block']/ul/li["+i+"]")).getText();
			
			System.out.println(dd);
		}
	
	}
	
	/**
	 * lenskart mousehover get text
	 * 
	 */
	@Test
	public void lenskarttext()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//img[@alt='Lenskart']"))).perform();
		System.out.println(driver.findElement(By.xpath("//img[@alt='Lenskart']")).getAttribute("title"));
		
	
		
	}
	
}
