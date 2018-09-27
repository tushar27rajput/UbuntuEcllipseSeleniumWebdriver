package com.SeleniumWebDriver;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test13 
{
	static WebDriver driver;
    public  String url = "https://www.naukri.com/";
    
    @BeforeClass
    public void setupBrowser()
    {
    	System.out.println("Test Start");
		System.out.println("Enter the Browser Name");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		
		//WebDriver driver = null;
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
		sc.close();
    }
    
    @Test
    public void testMultipleWindows() throws Exception
    {
    	driver.get(url);
    	driver.manage().window().maximize();
    	ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles());
    		for(int i=0;i<whs.size();i++)
    		{
    			System.out.println(whs.get(i));
    			
    		}
    	String firstWindow=driver.switchTo().window(whs.get(0)).getTitle();
    	String secondWindow=driver.switchTo().window(whs.get(1)).getTitle();
    	String thridWindow=driver.switchTo().window(whs.get(2)).getTitle();
    	System.out.println(firstWindow+" " +secondWindow+ " "+thridWindow);
    	Thread.sleep(5000);
    	
    }
    
    @AfterClass
    public void quitDriver()
    {
    	driver.quit();
    }
}
