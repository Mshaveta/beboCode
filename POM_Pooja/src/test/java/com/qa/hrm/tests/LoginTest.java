package com.qa.hrm.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
 

public class LoginTest extends BaseTest {
	

	@Test
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
		driver.findElement(By.id("btnLogin")).click();
	}

	
}
