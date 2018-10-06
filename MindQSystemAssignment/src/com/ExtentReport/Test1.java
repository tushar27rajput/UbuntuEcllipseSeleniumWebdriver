package com.ExtentReport;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test1 
{

	public static void main(String[] args) throws Exception 
	{
		//Open HTML File / Results
		
		ExtentReports er = new ExtentReports("/home/rajput/Documents/index.html",false);
		ExtentTest et = er.startTest("Google Site Title Test");
		
		//Launch Site
		System.setProperty("webdriver.chrome.driver","/home/rajput/Downloads/Selenium WebDriver Library Jar/chromedriver/chromedriver");
		
		//create object to access chrome browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String t =driver.getTitle();
		
		if(t.equals("Google"))
		{
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("/home/rajput/Documents/ss1.png");
			FileUtils.copyFile(src, dest);
			et.log(LogStatus.PASS, "Title Test was PASS"+et.addScreenCapture("/home/rajput/Documents/ss1.png"));
			
		}
		else
		{
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("/home/rajput/Documents/ss2.png");
			FileUtils.copyFile(src, dest);
			et.log(LogStatus.PASS, "Title Test was FAIL"+et.addScreenCapture("/home/rajput/Documents/ss2.png"));
			
		}
		
		//close site
		driver.close();
		
		//Save HTML File
		er.endTest(et);
		er.flush();
		
		

	}

}
