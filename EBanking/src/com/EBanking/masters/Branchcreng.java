package com.EBanking.masters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Branchcreng extends Base

{
 
  @Test(dataProvider = "branchdata")
  public void Branchcrea(String bn, String ad, String zc, String cnry, String st, String ct) throws InterruptedException
  {
	  li.Branches(bn, ad, zc, cnry, st, ct);
  }
  
  @DataProvider
  public Object[][] branchdata()
  {
	  Object[][] ob = new Object[2][6];
	  
	  ob[0][0] = "sbidghj";
	  ob[0][1] = "vetdgfjh";
	  ob[0][2] = "58956";
	  ob[0][3] = "INDIA";
	  ob[0][4] = "GOA";
	  ob[0][5] = "GOA";
	  
	  ob[1][0] = "sbidghji";
	  ob[1][1] = "vetdgjh";
	  ob[1][2] = "58916";
	  ob[1][3] = "INDIA";
	  ob[1][4] = "GOA";
	  ob[1][5] = "GOA";
	  
	  return ob;
	  
			  
  }
}
