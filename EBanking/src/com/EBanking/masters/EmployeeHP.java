package com.EBanking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeHP 
{
    @FindBy(id = "BtnNew")
    WebElement newEmployee;
    
    @FindBy(xpath = "/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
    WebElement home;
    
    public void newEmployee()
    {
    	newEmployee.click();
    }
    
    public void Hom()
    {
    	home.click();
    }
}
