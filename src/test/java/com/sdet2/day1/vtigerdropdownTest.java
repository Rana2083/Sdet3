package com.sdet2.day1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vtiger.generic.FileUtil;
import com.vtiger.generic.loginPage;
import com.vtiger.generic.webdriverUtil;

public class vtigerdropdownTest {
	
public static WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		String Browser=FileUtil.objectoffileutil().readdatafrompropfile("browser");
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
		String url=FileUtil.objectoffileutil().readdatafrompropfile("url");
		driver.get(url);
		loginPage lg=new loginPage(driver);
		lg.loginintoApp();
		webdriverUtil webdriver=new webdriverUtil(driver);
		webdriver.maximizewindow();
		webdriver.pageloadtimeout(10);
		driver.findElement(By.id("qccombo")).click();
		driver.findElement(By.xpath("//select[@id=\"qccombo\"]/descendant::option[@value=\"Campaigns\"]")).click();
		String element=driver.findElement(By.id("qccombo")).getText();
		if(element.equalsIgnoreCase("New Campaign"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
	
	}

}
