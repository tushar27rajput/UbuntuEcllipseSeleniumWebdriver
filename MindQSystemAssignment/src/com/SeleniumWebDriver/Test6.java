package com.SeleniumWebDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test6 
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
		
		driver.get("http://www.way2sms.com/");
		WebDriverWait w = new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h3[contains(text(),'Login to Way2SMS')]")));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@id='mobileNo'])[1]")).sendKeys("7972942322");
		driver.findElement(By.xpath("(//*[@id='password'])[1]")).sendKeys("*******");
		driver.findElement(By.xpath("//div[@class='w2-form-grp']//button[@type='button']")).click();
		
		//Send SMS
		driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("8208866760");
		driver.findElement(By.xpath("//*[@id='message']")).sendKeys("Hello Welcome to Navi Mumbai");
		driver.findElement(By.xpath("//*[@id='sendButton']")).click();
		driver.findElement(By.xpath("//*[@class='fa icon-logout hidden-xs']")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h3[contains(text(),'Login to Way2SMS')]")));
		driver.close();
		System.out.println("Test End");


	}

}
