package com.EBanking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoleHP 
{
	@FindBy(id = "btnRoles")
	WebElement NewRole;
	
	@FindBy(xpath = "/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Home;
	
	public void newRole()
	{
		NewRole.click();
	}
    
	public void home()
	{
		Home.click();
	}
}
