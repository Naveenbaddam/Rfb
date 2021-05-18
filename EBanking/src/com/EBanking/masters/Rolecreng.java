package com.EBanking.masters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Rolecreng extends Base

{
	
  @Test(dataProvider = "rdata")
  public void Rolecrea(String rn, String rt)
  
  {
	  li.Roles(rn, rt);
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
}
