package com.EBanking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RoleCreationHP 
{
	@FindBy(id = "txtRname")
    WebElement rolename;
		
	@FindBy(id = "lstRtypeN")
	WebElement roltype;
	
	@FindBy(id = "btninsert")
	WebElement submit;
	
	public void rolecreation(String rname, String rtyp)
	{
		rolename.sendKeys(rname);
		
		Select rtype = new Select(roltype);
		
		rtype.selectByVisibleText(rtyp);
		
		submit.click();
	}
	
	
}
