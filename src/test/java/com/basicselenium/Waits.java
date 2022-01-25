package com.basicselenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
{
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(20));
	waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("locator")));
	
	/**
	 * 
	 * FluentWait
	 * 
	 */
    Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(5)).withTimeout(Duration.ofSeconds(20)).ignoring(NoSuchElementException.class);
    
    wait.until(new Function<WebDriver, WebElement>() {
    	public WebElement apply(WebDriver driver)
    	{
    		return driver.findElement(By.id("tyss"));
    	}

	
	});
	

}
}
