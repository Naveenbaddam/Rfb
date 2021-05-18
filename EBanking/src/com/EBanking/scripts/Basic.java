package com.EBanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedVal = "Ranford Bank";
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://122.175.8.158/ranford2");
		
		String actval = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		if(expectedVal.equalsIgnoreCase(actval))
			
		{
			System.out.println("Application is launched successfully");
		}
		
		else
			
		{
			System.out.println("Application is failed to launch");
		}
		
		String tit = driver.getTitle();
		
		System.out.println(tit);
		
		expectedVal = "Welcome to Admin";
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");;
		
		driver.findElement(By.id("txtPword")).sendKeys("Testing@");
		
		driver.findElement(By.id("login")).click();
		
		actval = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
        if(expectedVal.equalsIgnoreCase(actval))
			
		{
			System.out.println("Admin login is successfull");
		}
		
		else
			
		{
			System.out.println("Admin login is unsuccessfull");
		}
		
		expectedVal = "Sucessfully";

		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys("RFBVtr");
		
		driver.findElement(By.id("txtAdd1")).sendKeys("Velkatoor");
				
		driver.findElement(By.id("txtZip")).sendKeys("50321");
		
		Select ctry = new Select(driver.findElement(By.id("lst_counrtyU")));
		
		ctry.selectByVisibleText("INDIA");
		
		Select state = new Select(driver.findElement(By.id("lst_stateI")));
		
		state.selectByVisibleText("GOA");
		
		Select city = new Select(driver.findElement(By.id("lst_cityI")));
		
		city.selectByVisibleText("GOA");
		
		driver.findElement(By.id("btn_insert")).click();
		
		Thread.sleep(5000);
		
		actval = driver.switchTo().alert().getText();
		
		if(actval.contains(expectedVal))
		
		{
			System.out.println("Branch created");
		}
		
		else
		{
			System.out.println("Branch already existed");
		}
		
		driver.switchTo().alert().accept();

		
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		expectedVal = "Sucessfully";
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		
		driver.findElement(By.id("btnRoles")).click();
		
		driver.findElement(By.id("txtRname")).sendKeys("AreaManager");
		
		Select rtype = new Select(driver.findElement(By.id("lstRtypeN")));
		
		rtype.selectByVisibleText("E");
		
		driver.findElement(By.id("btninsert")).click();
		
        Thread.sleep(5000);
        
        actval = driver.switchTo().alert().getText();
        
        if(actval.contains(expectedVal))
        	
        {
        	System.out.println("Role is created successfully");
        }
        
        else
        	
        {
        	System.out.println("Role is already existed");
        }
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		expectedVal = "Successfully";
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		
		driver.findElement(By.id("BtnNew")).click();
		
		driver.findElement(By.id("txtUname")).sendKeys("NaveenKumar");
		
		driver.findElement(By.id("txtLpwd")).sendKeys("Jaanu123$");
		
		Select sel_role = new Select(driver.findElement(By.id("lst_Roles")));
		
		sel_role.selectByVisibleText("AreaManager");
		
		Select sel_branch = new Select(driver.findElement(By.id("lst_Branch")));
		
		sel_branch.selectByVisibleText("RFBVtr");
		
		driver.findElement(By.id("BtnSubmit")).click();
		
		actval = driver.switchTo().alert().getText();
		
		if(actval.contains(expectedVal))
			
		{
			System.out.println("Employee is created successfully");
			
		}
		
		else
	     
		{
			System.out.println("Employess name is already existed");
		}
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
		
		
	}
	

}
