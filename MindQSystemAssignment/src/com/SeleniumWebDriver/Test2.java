package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 
{

	public static void main(String[] args) throws Exception 
	{
		
System.out.println("Test Start");
		
		//Run chromedriver.exe to get firefox browser
		System.setProperty("webdriver.gecko.driver","/home/rajput/Downloads/Selenium WebDriver Library Jar/geckodriver/geckodriver");
				
		//create object to access firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("abdul kalam");
		driver.close();
		System.out.println("Test End");

	}

}
