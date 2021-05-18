package com.EBanking.Hybrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LibraryH {
	
	WebDriver driver;
	
	String expectedVal, actval;
	
	FileInputStream fil;
	
	Properties pr;
	
	public String Launch(String url) throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\badda\\OneDrive\\Desktop\\geckodriver.exe");
		
		fil = new FileInputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\properties\\Repo.properties");
		
		pr = new Properties();
		
		pr.load(fil);
		
		expectedVal = "Ranford Bank";
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		String actval = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		if(expectedVal.equalsIgnoreCase(actval))
			
		{
			System.out.println("Application is launched successfully");
			
			return "Pass";
		}
		
		else
			
		{
			System.out.println("Application is failed to launch");
			
			return "Fail";
		}
		
		
	}
	
	public String Admin_Login(String username, String Password)
	{
        expectedVal = "Welcome to Admin";
		
		driver.findElement(By.id(pr.getProperty("Username"))).sendKeys(username);;
		
		driver.findElement(By.id(pr.getProperty("Password"))).sendKeys(Password);
		
		driver.findElement(By.id(pr.getProperty("Login"))).click();
		
		actval = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
        if(expectedVal.equalsIgnoreCase(actval))
			
		{
			System.out.println("Admin login is successfull");
			
			return "Pass";
			
		}
		
		else
			
		{
			System.out.println("Admin login is unsuccessfull");
			
			return "Fail";
		}

	}
	
	public String Branches(String Branchname, String Address1, String Zipcode, String Country, String State, String City) throws InterruptedException
	{
		expectedVal = "Sucessfully";

		driver.findElement(By.xpath(pr.getProperty("BranchButoon"))).click();
		
		driver.findElement(By.id(pr.getProperty("NewBranch"))).click();
		
		driver.findElement(By.id(pr.getProperty("BranchName"))).sendKeys(Branchname);
		
		driver.findElement(By.id(pr.getProperty("Address1"))).sendKeys(Address1);
				
		driver.findElement(By.id(pr.getProperty("Zipcode"))).sendKeys(Zipcode);
		
		Select ctry = new Select(driver.findElement(By.id(pr.getProperty("Country"))));
		
		ctry.selectByVisibleText(Country);
	
		Select state = new Select(driver.findElement(By.id(pr.getProperty("State"))));
		
		state.selectByVisibleText(State);
		
		Select city = new Select(driver.findElement(By.id(pr.getProperty("City"))));
		
		city.selectByVisibleText(City);
		
		driver.findElement(By.id(pr.getProperty("Submit"))).click();
		
		Thread.sleep(5000);
		
		actval = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath(pr.getProperty("Home"))).click();
		
		if(actval.contains(expectedVal))
		
		{
			System.out.println("Branch created");
			
			return "Pass";
		}
		
		else
		{
			System.out.println("Branch already existed");
			
			return "Fail";
		}
		
	
		
		//driver.switchTo().alert().accept();

		
		//driver.findElement(By.xpath(pr.getProperty("Home"))).click();
       
	}
	
	public String Roles(String Role_name, String Role_type) 
	{ 
		expectedVal = "Sucessfully";
		
		driver.findElement(By.xpath(pr.getProperty("RolesButton"))).click();
		
		driver.findElement(By.id(pr.getProperty("NewRole"))).click();
		
		driver.findElement(By.id(pr.getProperty("RoleName"))).sendKeys(Role_name);
		
		//driver.findElement(By.id(pr.getProperty("RoleDesc"))).sendKeys(Role_desc);
		
		Select role_type = new Select(driver.findElement(By.id(pr.getProperty("RoleType"))));
		
		role_type.selectByVisibleText(Role_type);
		
		driver.findElement(By.id(pr.getProperty("Submits"))).click();
		
		actval = driver.switchTo().alert().getText();
		
		if(actval.contains(expectedVal))
			
		{
			System.out.println("Role is created successfully");
			
			return "Pass";
		}
		
		else
			
		{
			System.out.println("Role is already existed");
			
			return "Fail";
		}
		
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath(pr.getProperty("Home"))).click();
		
		//return actval;
		
	}
	
	public String Employee(String Employee_name, String Login_password, String Role_of_employee, String Branch_of_employee)
	
	{
		expectedVal = "Successfully";
		
		driver.findElement(By.xpath(pr.getProperty("EmployeeButton"))).click();
		
		driver.findElement(By.id(pr.getProperty("NewEmployee"))).click();
		
		driver.findElement(By.id(pr.getProperty("EmployeeName"))).sendKeys(Employee_name);
		
		driver.findElement(By.id(pr.getProperty("LoginPassword"))).sendKeys(Login_password);
		
		Select rol = new Select(driver.findElement(By.id(pr.getProperty("RoleSel"))));
		
		rol.selectByVisibleText(Role_of_employee);
		
		Select branc = new Select(driver.findElement(By.id(pr.getProperty("BranchSel"))));
		
		branc.selectByVisibleText(Branch_of_employee);
		
		driver.findElement(By.id(pr.getProperty("Submit1"))).click();
		
		actval = driver.switchTo().alert().getText();
		
		if(actval.contains(expectedVal))
			
		{
			System.out.println("Employee is created successfully");
			
			return "Pass";
		}
		
		else
			
		{
			System.out.println("Employee is already existed");
			
			return "Fail";
		}
		
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath(pr.getProperty("Home"))).click();
		
		//return actval;
		
		}
	
	    public String Log_out()
	    
	    {
	     expectedVal = "Ranford Bank";
	     
	     driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
	     
	     actval = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	   
	     if(expectedVal.equalsIgnoreCase(actval))
	    	 
	     {
	    	 System.out.println("Logout successfully");
	    	 
	    	 return "Pass";
	     }
	     
	     else
	    	 
	     {
	    	 System.out.println("Logout unsuccessful");
	    	 
	    	 return "Fail";
	     }
	     
	    }
	     
	     public String Close()
	     
	     {
	    	 driver.close();
	    	 
	    	 System.out.println("Application closed successfully");
	    	 
	    	 return "Pass";
			
	     }
	     
	    
	    
	    
	    }
	    
	
	//Roles, Employee , Logout , Close() -methods


