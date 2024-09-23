package com.bdd.stepdefinition;

import com.bdd.utility.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before(order=2)
	public void precondition1()
	{
		System.out.println("pre-conition");
	}


	@Before(order=1)
	public void precondition2()
	{
		System.out.println("pre-conition2");
	}
	
	@After(order=2)
	public void quitbrowser()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void postcondition1()
	{
		System.out.println("post condition1");
	}
	
	@Before("@testtt")
	public void precondition3()
	{
		System.out.println("precondition3");
	}
	
	@After("@testtt")
	public void postcondition()
	{
		System.out.println("postcondition_testtt");
	}
}
