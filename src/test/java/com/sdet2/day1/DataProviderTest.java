package com.sdet2.day1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.generic.ExcelUtil2;
import com.vtiger.generic.createorganzationPage;
import com.vtiger.generic.homePage;
import com.vtiger.generic.loginPage;

public class DataProviderTest
{
	@org.testng.annotations.DataProvider
	public Iterator<Object[]> getdata() throws IOException
	{
		ExcelUtil2 excel=new ExcelUtil2();
		ArrayList<Object[]> exl = excel.selectvaluefordd();
		return exl.iterator();
	}
	@Test(dataProvider="getdata")
	public void Dataprovider()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		loginPage lg=new loginPage(driver);
		lg.getUsername();
		lg.getPassword1();
		lg.getSubmitbutton();
		homePage hp=new homePage(driver);
		hp.getOrgname().click();
		
		
		
		 
		
		
		
	}
}
