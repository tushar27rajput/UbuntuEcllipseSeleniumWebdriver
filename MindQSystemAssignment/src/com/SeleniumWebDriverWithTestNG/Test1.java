package com.SeleniumWebDriverWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1
{
	//-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
	public WebDriver driver;
	
	//Declare a test URL variable
	public String testURL="http://swtestacademy.com/";
	
	//-----------------------------------Suite Suite-----------------------------------
    //You can set suite level setup such as test environment, Database connection string etc.
    @BeforeSuite
    public void setupSuite () 
    {
        System.out.println("@BeforeSuite started.");
    }
 
    //-----------------------------------All Tests Setup-----------------------------------
    //All Tests setup
    @BeforeTest
    public void setupTests ()
    {
        System.out.println("@BeforeTest started.");
    }
 
    //-----------------------------------Class Setup-----------------------------------
    //All Tests setup
    @BeforeClass
    public void setupClass () 
    {
        System.out.println("@BeforeClass started.");
    }
 
    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest ()
    {
        //Print console that code is in @BeforeMethod!
        System.out.println("@BeforeMethod has started.");
        System.setProperty("webdriver.chrome.driver","/home/rajput/Downloads/Selenium WebDriver Library Jar/chromedriver/chromedriver");
        //Create a new ChromeDriver
        driver = new ChromeDriver();
    }
 
    //-----------------------------------Tests-----------------------------------
    @Test
    public void firstTest ()
    {
        System.out.println("First Test is Started.");
 
        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
 
        //Get page title
        String title = driver.getTitle();
 
        //Print page's title
        System.out.println("Page Title: " + title);
    }
 
    @Test
    public void secondTest ()
    {
        System.out.println("Second Test is Started.");
 
        //Go to www.amazon.com
        driver.navigate().to("https://www.amazon.com/");
 
        //Get page title
        String title = driver.getTitle();
 
        //Print page's title
        System.out.println("Page Title: " + title);
    }
 
    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest ()
    {
        System.out.println("@AfterMethod has started.");
        //Close browser and end the session
        driver.quit();
    }
 
    //-----------------------------------Class TearDown-----------------------------------
    @AfterClass
    public void teardownClass ()
    {
        System.out.println("@AfterClass has started.");
    }
 
    //-----------------------------------All Tests TearDown-----------------------------------
    @AfterTest
    public void teardownTests ()
    {
        System.out.println("@AfterTest has started.");
    }
 
    //-----------------------------------Suite TearDown-----------------------------------
    @AfterSuite
    public void teardownSuite ()
    {
        System.out.println("@AfterSuite has started.");
    }
}
	

