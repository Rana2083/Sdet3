package com.sdet2.day1;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownvaluesTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Enter login Details
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		
		//click on organization
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		//Create the organization 
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		
		WebElement dd1=driver.findElement(By.name("industry"));
		Select sel1=new Select(dd1);
		
		
		WebElement dd2=driver.findElement(By.name("accounttype"));
		Select sel2=new Select(dd2);
		List<WebElement> options=sel2.getOptions();
		for(int i=0;i<options.size()-1;i++)
		{
		     System.out.println(options.get(i).getText());
		}
		
		
		WebElement dd3=driver.findElement(By.name("rating"));
		Select sel3=new Select(dd3);
		List<WebElement> options2=sel3.getOptions();
		for(int i=0;i<options2.size()-1;i++)
		{
		     System.out.println(options2.get(i).getText());
		}
		

	}

}
