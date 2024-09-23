package com.bdd.stepdefinition;

import java.io.IOException;

import com.bdd.utility.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automationexercise_cart extends BaseClass{
	
	@When("User click the cart link")
	public void clickcart() throws IOException
	{
		hmpg.clickcartLink();
	}
	
	@Then("User validatde whether it landed in cart page")
	public void validateCartPage()
	{
		com.validatePageTitle();
	}

}
