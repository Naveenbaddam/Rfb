package com.EBanking.masters;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
  
	Libraryng li = new Libraryng();
	
  @BeforeTest
  public void beforeTest() 
  {
	  li.Admin_Login("Admin", "Testing@");
  }

  @AfterTest
  public void afterTest()
  {
	  li.Log_out();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  li.Launch("http://122.175.8.158/ranford2/");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  li.close();
  }

}
