package com.bdd.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.utility.BaseClass;



public class HomePage extends BaseClass{
	

	public static By productLink = By.xpath("//a[@href='/products']");
	public static By cartLink = By.xpath("//a[@href='/view_cart']");
	
	
	public static void clickProduct_Link() throws IOException
	{
		com.clickelement(productLink,"Product Link");
	
	}
	
	public static void clickcartLink() throws IOException
	{
		com.clickelement(cartLink, "Cart Link");
	}

}
