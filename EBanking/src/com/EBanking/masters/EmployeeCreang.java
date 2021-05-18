package com.EBanking.masters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeCreang extends Base

{
  @Test(dataProvider = "empdata")
  public void employeecrea(String ename, String loginpass, String role, String bran)
  
  {
	  li.Employee(ename,loginpass,role,bran);
  }
  
  @DataProvider
  public Object[][] empdata()
  {
	  Object[][] obj = new Object[2][4];
	  
	 obj[0][0] = "srinubaddam";
	 obj[0][1] = "srinuba$";
	 obj[0][2] = "managerabc";
	 obj[0][3] = "sbidghj";
	 
	 obj[1][0] = "srinubaddams";
	 obj[1][1] = "srinubsa$";
	 obj[1][2] = "managerabc";
	 obj[1][3] = "sbidghj";
	 
	 return obj;
	 
  }
}
