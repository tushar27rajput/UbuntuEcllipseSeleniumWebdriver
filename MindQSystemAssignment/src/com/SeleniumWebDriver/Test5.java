package com.SeleniumWebDriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.Select;

public class Test5
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
		
		driver.get("http://newtours.demoaut.com");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Click Register link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		
		//Fill Fields
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Tushar");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Rajput",Keys.TAB,"9579778909");
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("trajput@gmail.com");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("5 A Prem Nagar");
		driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("Near Bajrang Subway");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Jalgaon");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("425001");
		
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.xpath("//*[@name='country']"));
		Select s= new Select(e);
		s.selectByVisibleText("NORWAY ");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("trajput774");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("12345",Keys.ENTER);
		
		driver.close();
		System.out.println("Test End");
		

	}

}
