package com.SeleniumWebDriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test7 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Test Start");
		System.out.println("Enter the Browser Name");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		
		WebDriver driver = null;
		if(x.equals("chrome"))
		{
			//Run chromedriver.exe to get chrome browser
			 System.setProperty("webdriver.chrome.driver","/home/rajput/Downloads/Selenium WebDriver Library Jar/chromedriver/chromedriver");
					
			//create object to access chrome browser
			 driver=new ChromeDriver();
		}
		else if(x.equals("firefox"))
		{
			//Run chromedriver.exe to get firefox browser
			 System.setProperty("webdriver.gecko.driver","/home/rajput/Downloads/Selenium WebDriver Library Jar/geckodriver/geckodriver");
					
			//create object to access firefox browser
			 driver=new FirefoxDriver();
		}
		else if(x.equals("ie"))
		{
			 System.setProperty("webdriver.ie.driver","E:\\batch238\\iedriverserver.exe");
			 driver=new InternetExplorerDriver();
		}
		else if(x.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver", "/home/rajput/Downloads/Selenium WebDriver Library Jar/operadriver/operadriverdriver_linux64");
			OperaOptions o = new OperaOptions();
			o.setBinary("/usr/lib/x86_64-linux-gnu/opera/opera");
			 driver = new OperaDriver(o);
		}
		else
		{
			System.out.println("Wrong Browser");
			System.exit(0);//Stop execution forcibly
		}
		
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		
		//validation for visibility
				
		if(driver.findElement(By.name("q")).isDisplayed())
				{
					System.out.println("Diplayed");
				}
		else
				{
					System.out.println("Not Diplayed");
				}
		
		//Validation for operatable
		if(driver.findElement(By.name("q")).isEnabled())
		{
					System.out.println("Enabled");
		}
		else
		{
					System.out.println("Disabled");
		}
			
		//Validation for focus
		if(driver.findElement(By.name("q")).isSelected())
		{
					System.out.println("Focused now");
		}
		else
		{
					System.out.println("No focus on element");
		}
		
		//Close site
		driver.close();

	}

}
