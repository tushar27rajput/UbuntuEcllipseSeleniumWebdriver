package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Test Start");
		
		//Run chromedriver.exe to get chrome browser
		System.setProperty("webdriver.chrome.driver","/home/rajput/Downloads/Selenium WebDriver Library Jar/chromedriver/chromedriver");
				
		//create object to access chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("abdul kalam");
		driver.close();
		System.out.println("Test Start");
	}

}
