package com.SeleniumWebDriverWithTestNG;

import org.testng.annotations.Test;

public class Test4 
{
	@Test(priority = 2)
	public void firstTest () {
	    System.out.println("1st Test is Started.");
	}
	 
	@Test (priority = 1)
	public void secondTest () {
	    System.out.println("2nd Test is Started.");
	}
	 
	@Test (priority = 0)
	public void thirdTest () {
	    System.out.println("3rd Test is Started.");
	}
	
}
