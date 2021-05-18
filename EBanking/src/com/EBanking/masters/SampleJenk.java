package com.EBanking.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleJenk {

	public static void main(String[] args)
	
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\badda\\OneDrive\\Desktop\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testzenlabs.ie/");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/nav/div/ul/li[3]/a")).click();
		
		driver.close();
		
	}
}