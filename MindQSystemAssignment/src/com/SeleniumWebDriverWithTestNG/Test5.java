package com.SeleniumWebDriverWithTestNG;

import org.testng.annotations.Test;

public class Test5
{
	@Test(priority=0)
	public void firstTest()
	{
		System.out.println("1st Test Started");
	}
	
	@Test(priority=1,enabled=false)
	public void secondTest()
	{
		System.out.println("2nd Test Started");
	}
	
	@Test(priority=2)
	public void thridTest()
	{
		System.out.println("3rd Test Started");
	}
}
