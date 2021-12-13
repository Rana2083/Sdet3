package com.vtiger.generic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webdriverUtil
{
	WebDriver driver;
	public webdriverUtil(WebDriver driver)

	{
		this.driver=driver; 
	}

	public void maximizewindow()
	{
		driver.manage().window().maximize();
	}
	public void pageloadtimeout(int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public void selectvaluefromdd(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	public void selectvaluefromdd(WebElement element,int id)
	{
		Select select=new Select(element);
		select.selectByIndex(id);
	}
	public void selectvaluefromdd(String value,WebElement element)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void moveactions(WebElement element) 
	{
		Actions Act=new Actions(driver);
		Act.moveToElement(element);
	}
	public void rightclickactions(WebElement element) 
	{
		Actions Act=new Actions(driver);
		Act.contextClick(element);

	}
	public void  Offsetmoveactions(WebElement element) 
	{
		Actions Act=new Actions(driver);
		Act.moveByOffset(0, 0);
	}
	public void AcceptAlert()
	{
		driver.switchTo().alert().accept();
	}
	public void DismissAlert()
	{
		driver.switchTo().alert().dismiss();
	}
	public void sendkeys(WebElement element,String keytosend)
	{
		element.sendKeys(keytosend);
	}
	public void switchingofframes(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void scrollby()
	{
		//javascript
	}
	public void SwitchToWindowHandles(String title) 
	{
		Set<String> windowid=driver.getWindowHandles();

		for(String id:windowid)
		{
			String winname=driver.switchTo().window(id).getTitle();
			System.out.println(winname);
			if(winname.contains(title))
			{
				break;
			}

		}
		

	}
}
