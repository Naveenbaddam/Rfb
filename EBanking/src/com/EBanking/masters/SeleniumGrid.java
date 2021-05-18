package com.EBanking.masters;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SeleniumGrid 

{
	
	DesiredCapabilities Cap = null;
	
	
	@Test
	public void Gd() throws MalformedURLException
	
	{
		
		Cap = new DesiredCapabilities();
		
		Cap.setBrowserName("firefox");
		
		Cap.setPlatform(Platform.WINDOWS);
		
	
	    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.11:4444/wd/hub"), Cap);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("http://122.175.8.158/ranford2/");
	    
        RanfordHP RHP = PageFactory.initElements(driver, RanfordHP.class);
		
		RHP.Login();
		
	}
}
		
