package com.SeleniumWebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 
{

	public static void main(String[] args)
	{
		System.out.println("Test Start");
		
		System.setProperty("webdriver.ie.driver","E:\\batch238\\iedriverserver.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		
		System.out.println("Test End");
	}

}
