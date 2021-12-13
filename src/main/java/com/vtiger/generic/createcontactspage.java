package com.vtiger.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createcontactspage
{
	WebDriver driver;
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement ddconatacts;

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Fname;

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Lname;

	@FindBy(xpath="//img[@title='Select']")
	private WebElement search;

	@FindBy(xpath="//input[@type='text']")
	private WebElement enterorgname;

	@FindBy(xpath="//input[@name='search']")
	private WebElement searchbtn;

	@FindBy(id="bas_searchfield")
	private WebElement contactdd;

	public WebElement getContactdd() 
	{
		return contactdd;
	}

	public WebElement getDdconatacts() {
		return ddconatacts;
	}



	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getEnterorgname() {
		return enterorgname;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public createcontactspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	webdriverUtil web=new webdriverUtil(driver);
	public void contactsdd(int value)
	{
		web.selectvaluefromdd(ddconatacts, value); 	
	}
	public void contactsdd2(int value)
	{
		web.selectvaluefromdd(contactdd, value);
	}




}
