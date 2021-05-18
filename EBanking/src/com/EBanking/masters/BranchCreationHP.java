package com.EBanking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationHP 
{

    @FindBy(id = "txtbName")
	WebElement Branchname;
	
	@FindBy(id = "txtAdd1")
	WebElement Address1;
	
	@FindBy(id = "txtZip")
	WebElement Zipcode;
	
	@FindBy(id = "lst_counrtyU")
	WebElement Country;
	
	@FindBy(id = "lst_stateI")
	WebElement State;
	
	@FindBy(id= "lst_cityI")
	WebElement City;
	
	@FindBy(id = "btn_insert")
	WebElement Submit;
	
	
	public void Branchcreatn(String bname, String addre, String zcode, String ctr, String st, String ct)
	{
		Branchname.sendKeys(bname);
		
		Address1.sendKeys(addre);
		
		Zipcode.sendKeys(zcode);
		
		Select Cnry = new Select(Country);
		
		Cnry.selectByVisibleText(ctr);
		
		Select Sta = new Select(State);
		
		Sta.selectByVisibleText(st);
		
		Select Cit = new Select(City);
		
		Cit.selectByVisibleText(ct);
		
		Submit.click();
		
		
      }
	
}

