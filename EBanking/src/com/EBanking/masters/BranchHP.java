package com.EBanking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchHP 
{
	@FindBy(id = "BtnNewBR")
	WebElement NewBranch;
	
	@FindBy(xpath = "/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Home;

	public void newBranch()
	{
		NewBranch.click();
	}
	
	public void home()
	{
		Home.click();
	}
}

