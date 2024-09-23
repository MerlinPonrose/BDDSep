package com.bdd.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.utility.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExercise_test extends BaseClass{
	
	@Given("User launch the browser and open the application {string}")
	public void launchbrowserr(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	
	}

	@When("User click the product link")
	public void user_click_the_product_link() throws IOException {
		hmpg.clickProduct_Link();
	 
	}

	@When("User search the product {string} in the search box")
	public void user_search_the_product_in_the_search_box(String product) throws IOException {
	   
		prdpg.searchProduct(product);
	}

	@When("User clcik the first product which is displayed")
	public void user_clcik_the_first_product_which_is_displayed() throws IOException {
	  
		com.scrolldown();
		prdpg.clickFrstProduct();
	}

	@When("User enter the quantity {string} in the quantity textbox")
	public void user_enter_the_quantity_in_the_quantity_textbox(String quantity) throws IOException {
		prdpg.enterquantity(quantity);
		
	}

	@When("User click the add to cart button")
	public void user_click_the_add_to_cart_button() throws IOException, InterruptedException {
	  
	prdpg.clickAddToCart();
		
		Thread.sleep(2000);	
	}

	@When("User click the view cart link")
	public void user_click_the_view_cart_link() throws IOException {
	   
		prdpg.clcikViewCartButton();
	}

	@Then("User validate the product {string} in the cart")
	public void user_validate_the_product_in_the_cart(String product) throws InterruptedException {
	   
		cartpg.validateProduct(product);
	}
	
	


}
