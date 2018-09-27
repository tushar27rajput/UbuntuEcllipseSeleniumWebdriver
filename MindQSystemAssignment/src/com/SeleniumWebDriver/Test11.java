package com.SeleniumWebDriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test11 
{
	static WebDriver driver;
    public  String url = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
    
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
    public void AlertExampleTest()
    {
    	//Navigate to URL
    	driver.get(url);
    	driver.manage().window().maximize();
    	
    	//Switch to iframeResult iframe because all elements located in this iframe
        //It will be described in next topics
        driver.switchTo().frame("iframeResult");
      
       //Find "Try it" button
       WebElement confirmButton= driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
       
     //Actual Message
       WebElement actualPromptMessage = driver.findElement(By.cssSelector("#demo"));
     
       //Click confirm button ("Try it" button)
       confirmButton.click();
       
     //Send "tushar rajput" to Alert's text box
       driver.switchTo().alert().sendKeys("tushar rajput");
       
     //Accept the alert (Click Ok button)
       driver.switchTo().alert().accept();
       
       //Assertion
       Assert.assertEquals("Hello tushar rajput! How are you today?",(actualPromptMessage.getText()));
       
    }
    
    @AfterClass
    public void quitDriver()
    {
    	driver.quit();
    }
}
