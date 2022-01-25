package com.sdet2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class incognito {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
	    WebDriver driver=new ChromeDriver(option);
	    driver.get("https://www.facebook.com/");
	    System.out.println(driver.getTitle());

	}

}
