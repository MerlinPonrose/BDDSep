package com.bdd.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.utility.BaseClass;

import cucumber.api.java.en.When;

public class DataTable_AutomationExercise extends BaseClass{
	
	
	@When("User search the product in the search box")
	public void user_search_the_product_in_the_search_box(io.cucumber.datatable.DataTable dataTable) throws IOException {
		
		/*List<String> a = dataTable.asList();
		String product = a.get(0);*/
		
		
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		System.out.println(map);
		String product = map.get("Product");
		
		prdpg.searchProduct(product);
	   
	}

	@When("User enter the quantity and Name in the quantity textbox")
	public void user_enter_the_quantity_and_Name_in_the_quantity_textbox(io.cucumber.datatable.DataTable dataTable) throws IOException {
		
	/*	List<List<String>> a = dataTable.asLists();
		
		String Quantity = a.get(0).get(0);
		String Name = a.get(0).get(1);
		*/
		
		List<Map<String, String>> asMaps = dataTable.asMaps();
		
		String Quantity = asMaps.get(0).get("Quatity");
		String Name = asMaps.get(0).get("Name");
		
		prdpg.enterquantity(Quantity);
		
		com.scrolldown();
		
		WebElement YourName = driver.findElement(By.xpath("//input[@placeholder='Your Name']"));
		YourName.click();
		YourName.clear();
		YourName.sendKeys(Name);
	   
	}


}
