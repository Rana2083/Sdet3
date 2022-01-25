package com.vtiger.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createorganzationPage 
{
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement givename;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement save;
	
	@FindBy(name="industry")
	private WebElement industrydd;
	
	@FindBy(name="accounttype")
	private WebElement accounttypedd;
	
	@FindBy(name="rating")
	private WebElement ratingdd;
	
	@FindBy(id="phone")
	private WebElement phonenumber;
	
	@FindBy(xpath="//a[@title='Organizations']")
	private WebElement compare;
	
	
	

	public WebElement getCompare() {
		return compare;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getGivename() 
	{
		return givename;
	}

	public WebElement getSave()
	{
		return save;
	}

	public WebElement getIndustrydd() 
	{
		return industrydd;
	}

	public WebElement getAccounttypedd() 
	{
		return accounttypedd;
	}

	public WebElement getRatingdd()
	{
		return ratingdd;
	}

	public createorganzationPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	webdriverUtil web=new webdriverUtil(driver);
	public void dropdown1(String sheetname,int cellvalue,String value) throws IOException
	{
		String dd1=ExcelUtil.objectoffileutil().selectvaluefordd(sheetname, cellvalue, value);
		industrydd.click();
		web.selectvaluefromdd(industrydd, dd1);
	}
	
	public void dropdown2(String sheetname,int cellvalue,String value) throws IOException
	{
		String dd1=ExcelUtil.objectoffileutil().selectvaluefordd(sheetname, cellvalue, value);
		//industrydd.click();
		web.selectvaluefromdd(accounttypedd, dd1);
	}
	
	public void dropdown3(String sheetname,int cellvalue,String value) throws IOException
	{
		String dd1=ExcelUtil.objectoffileutil().selectvaluefordd(sheetname, cellvalue, value);
		//industrydd.click();
		web.selectvaluefromdd(ratingdd, dd1);
	}


	
	
	

	
	
	
}
