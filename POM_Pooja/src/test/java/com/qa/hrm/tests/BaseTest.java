package com.qa.hrm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import com.qa.hrm.utility.ReadPropertyFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;

	public ReadPropertyFile config;
	@BeforeClass
	public void browserSetUp() {
		config = new ReadPropertyFile();
		String browser = config.getBrowser();
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		//get App URl;
		String appUrl = config.getAppUrl();
		driver.get(appUrl);
		 
		
	}
	
	 
}
