package com.EBanking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EmployeeCreationHP 
{
	@FindBy(id = "txtUname")
	WebElement empname;
	
	@FindBy(id = "txtLpwd")
	WebElement logpassword;
	
	@FindBy(id = "lst_Roles")
	WebElement rol;
	
	@FindBy(id = "lst_Branch")
	WebElement branch;
	
	@FindBy(id = "BtnSubmit")
	WebElement submit;
	
	public void empcreation()
	{
		empname.sendKeys("navbadraj");
		
		logpassword.sendKeys("navbad$");
		
		Select role = new Select(rol);
		
		role.selectByVisibleText("Managerthbu");
		
		Select bran = new Select(branch);
		
		bran.selectByVisibleText("AibIreland");
		
		submit.click();
	}

}
