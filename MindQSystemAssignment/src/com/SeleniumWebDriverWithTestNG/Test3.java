package com.SeleniumWebDriverWithTestNG;

import org.testng.annotations.Test;

public class Test3
{
	@Test(dependsOnMethods = {"openWebsite"})
	public void loginWebsite () 
	{
	    System.out.println("Logged-in website!");
	}
	 
	@Test
	public void openWebsite () 
	{
	    System.out.println("Website opened!");
	}
	 
	@Test (dependsOnMethods = {"loginWebsite"})
	public void goToBasket () 
	{
	    System.out.println("We are in basket!");
	}
	 
	@Test (dependsOnMethods = {"goToBasket"})
	public void logOutFromWebsite ()
	{
	    System.out.println("Logged-out from website!");
	}
}
