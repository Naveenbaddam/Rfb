package com.EBanking.masters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom
{
	WebDriver driver;
	
	AdminHP AHP;
	
	@BeforeTest
	public void login()
	{
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://122.175.8.158/ranford2/");
		
		RanfordHP RHP = PageFactory.initElements(driver, RanfordHP.class);
		
		RHP.Login();
		
	}
	 
	@Test()
	 public void Branches() throws IOException
	 
	 {
        FileInputStream Fis = new FileInputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\testdata\\Branchcreation_testdata.xlsx");
		
		XSSFWorkbook WB = new XSSFWorkbook(Fis);
		
		XSSFSheet WS = WB.getSheet("Branchdata");
		
		int Rcount = WS.getLastRowNum();
		
		System.out.println(Rcount);
		
		for(int i=1; i<=Rcount; i++)
			
		{
			
			XSSFRow WR = WS.getRow(i);
			
			XSSFCell WC = WR.getCell(0);
			
			XSSFCell WC1 = WR.getCell(1);
			
			XSSFCell WC2 = WR.getCell(2);
			
			XSSFCell WC3 = WR.getCell(3);
			
			XSSFCell WC4 = WR.getCell(4);
			
			XSSFCell WC5 = WR.getCell(5);
			
			XSSFCell WC6 = WR.createCell(6);
			
			String Branchnam = WC.getStringCellValue();
			
			String Addres1= WC1.getStringCellValue();
			
			String Zipcod = WC2.getStringCellValue();
			
			String Countr = WC3.getStringCellValue();
			
			String Stat = WC4.getStringCellValue();
			
			String Cit = WC5.getStringCellValue();
			
			AHP = PageFactory.initElements(driver, AdminHP.class);
			
			AHP.Bran();
			
			BranchHP BHP = PageFactory.initElements(driver, BranchHP.class);
					
		    BHP.newBranch();
			
			BranchCreationHP BCHP = PageFactory.initElements(driver, BranchCreationHP.class);
			
			BCHP.Branchcreatn(Branchnam,Addres1,Zipcod,Countr,Stat,Cit);
			
			driver.switchTo().alert().accept();
			
			BHP.home();
	
	   }
		
	 }
	 
	   @Test(dataProvider = "rdata")
	   public void Roles(String rn, String rt) throws InterruptedException
	   
	    {
		   
		AHP.Rol();
		
		RoleHP RolHP = PageFactory.initElements(driver, RoleHP.class);
		
		RolHP.newRole();
		
		RoleCreationHP RCHP = PageFactory.initElements(driver, RoleCreationHP.class);
		
		RCHP.rolecreation(rn,rt);
		
		driver.switchTo().alert().accept();
		
		RolHP.home();
		
		Thread.sleep(3000);
		
	   }
	   
	   @DataProvider
	   public Object[][] rdata()
	   {
	 	Object[][] obj = new Object[3][2];
	 	
	 	obj[0][0] = "managerabc";
	 	obj[0][1] = "E";
	 	
	 	obj[1][0] = "managerpqr";
	 	obj[1][1] = "E";
	 	
	 	obj[2][0] = "managerghj";
	 	obj[2][1] = "E";
	 	
	 	
	 	return obj;
	 	  
	   }
	   
	   
		@Test()
	   public void Employee()
	   
	   {
		   
		AHP.Emp();
		
		EmployeeHP EHP = PageFactory.initElements(driver, EmployeeHP.class);
		
		EHP.newEmployee();
		
		EmployeeCreationHP ECHP = PageFactory.initElements(driver, EmployeeCreationHP.class);
		
		ECHP.empcreation();
		
		driver.switchTo().alert().accept();
		
		EHP.Hom();
		
	   }
		
	}


