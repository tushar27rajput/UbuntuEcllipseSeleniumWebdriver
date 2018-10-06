package com.SeleniumWebDriverWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Test6 
{
	static WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void setupTest (String browser){
	    //Print console that code is in @BeforeMethod!
	    System.out.println("@BeforeMethod has started.");
	 
	    //Browser Selection based on browser parameter
	    if(browser.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver","/home/rajput/Downloads/Selenium WebDriver Library Jar/chromedriver/chromedriver");
	        driver = new ChromeDriver();
	    } 
	    else if (browser.equals("firefox")) 
	    {
	    	System.setProperty("webdriver.gecko.driver","/home/rajput/Downloads/Selenium WebDriver Library Jar/geckodriver/geckodriver");
	        driver = new FirefoxDriver();
	    } 
	    else 
	    {
	        System.out.println("You set a wrong browser parameter!");
	    }
	}
}
