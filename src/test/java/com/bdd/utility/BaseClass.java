package com.bdd.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bdd.pages.CartPage;
import com.bdd.pages.HomePage;
import com.bdd.pages.ProductPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static HomePage hmpg = new HomePage();
	public static ProductPage prdpg = new ProductPage();
	
	public static CartPage cartpg = new CartPage();
	
	public static Common com = new Common();
	
	public static HashMap<String, String> map = new HashMap<String, String>();
	

	
	
	public void launchbrowser() throws IOException
	{
		File f = new File("C:\\neworkspace\\DataDrivenn_Sep\\src\\test\\java\\com\\datadriven\\config\\environmentdetails.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String url = prop.getProperty("URL");
		String browser = prop.getProperty("Browser");
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();			
		}
		
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
			
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
	}
	

	public void closebrowser()
	{
		driver.close();
	}
	
}
