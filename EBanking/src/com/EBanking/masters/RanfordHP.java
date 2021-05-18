package com.EBanking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP 
{
    @FindBy (id = "txtuId")
    WebElement Username;
    
    @FindBy(id = "txtPword")
    WebElement Password;
    
    @FindBy (id = "login")
    WebElement Lgn;

    
    public void Login()
    {
    	Username.sendKeys("Admin");
    	Password.sendKeys("Testing@");
    	Lgn.click();
    }
    
    
    
    
    
    
}
