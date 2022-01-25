package com.sdet2.day1;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CalenderTest {

	public static WebDriver driver;
	
	@Test
	public void calenderPractice()
	{
		Date d = new Date();
		//Date todayDate = Calendar.getInstance().getTime();
		String todayDate = d.toString();
		String[] arr = todayDate.split(" ");
		String day = arr[0];
		String month = arr[1];
		String date = arr[2];
		String year = arr[5];
		String cDate = day+" "+month+" "+date+" "+year;
		
		System.out.println(cDate);

		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		driver.findElement(By.xpath("//li[@data-cy='account']")).click();


		driver.findElement(By.id("fromCity")).sendKeys("HYD");

		driver.findElement(By.xpath("//div[.='HYD']")).click();


		driver.findElement(By.id("toCity")).sendKeys("GOI");

		driver.findElement(By.xpath("//div[.='GOI']")).click();

		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();

		driver.findElement(By.xpath("//div[@aria-label='"+cDate+"']")).click();


	}
	

}