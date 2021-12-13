package com.vtiger.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationcreate 
{ 
	WebDriver driver;
	//click on Create Organization
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorganization;
	

	
	@FindBy(xpath="//input[@class='txtBox']")
	private WebElement searchtext;
	
	@FindBy(id="bas_searchfield")
	private WebElement dropdown1;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@title='Organizations']")
	private WebElement expected;
	
	public WebElement getCreateorganization() {
		return createorganization;
	}
	
	

	public WebElement getExpected() {
		return expected;
	}

	public WebElement getDropdown1() {
		return dropdown1;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSearchtext() {
		return searchtext;
	}

	

	
	public organizationcreate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	webdriverUtil web=new webdriverUtil(driver);
	public void dropdown()
	{
		
		web.selectvaluefromdd(dropdown1, 1);
	}
	 public void dropdown1()
	 {
		 web.selectvaluefromdd(dropdown1, 4);
		 
	 }
	
	
}	
