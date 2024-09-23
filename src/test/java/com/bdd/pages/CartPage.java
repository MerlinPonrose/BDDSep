package com.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.utility.BaseClass;



public class CartPage extends BaseClass{
	
	public static By productInCart = By.xpath("//tr[@id='product-1']");

	
	public void validateProductInCart()
	{

		List<WebElement> products = driver.findElements(productInCart);
		
		if(products.size()!=0)
		{
			System.out.println("Product is added to cart");
		}
		else
		{
			System.out.println("cart is empty !!");
		}
	}
	
	public void validateProduct(String product) throws InterruptedException
	{
		Thread.sleep(5000);
		
		List<WebElement> products = driver.findElements(By.tagName("//a[text()='"+product+"']"));
		
		Thread.sleep(5000);
		
		System.out.println("//a[text()='"+product+"']");
		
		if(products.size()!=0)
		{
			System.out.println("Product is added to the cart");
		}
		else
		{
			System.out.println("Product is not available");
		}
	}

}
