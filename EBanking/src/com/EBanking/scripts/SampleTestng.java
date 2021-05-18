package com.EBanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTestng {
	
	WebDriver driver;
	
    @Test(priority=1)
	public void Launch()
	{
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://122.175.8.158/ranford2/");
		
	}
	@Test(priority=2)
	public void Admin_log()
	
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Testing@");
		
		driver.findElement(By.id("login")).click();
	}
	
	@Test(priority=3)
	public void Close()
	{
	driver.close();
	}
	
}


