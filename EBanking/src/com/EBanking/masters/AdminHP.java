package com.EBanking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP 
{
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement Branch;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement Role;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement Employe;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")
	WebElement Lgout;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[1]/a/img")
	WebElement Home;
	
	public void Bran()
	{
		Branch.click();
	}

	public void Rol()
	{
		Role.click();
	}
	
	public void Emp()
	{
		Employe.click();
	}
	
	public void Logout()
	{
		Lgout.click();
	}
	
	public void Hm()
	{
		Home.click();
	}
	
}

