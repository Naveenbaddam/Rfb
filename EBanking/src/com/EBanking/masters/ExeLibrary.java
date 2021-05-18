package com.EBanking.masters;

import java.io.IOException;

public class ExeLibrary {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Library lib = new Library();
		
		String rvalue = lib.Launch("http://122.175.8.158/ranford2/");
		
		System.out.println(rvalue);
		
		lib.Admin_Login("Admin","Testing@");
		
		rvalue = lib.Branches("RFBVtr", "AreaManager", "56236","INDIA","GOA", "GOA");
		
		System.out.println(rvalue);
		
		rvalue = lib.Roles("AreaManager", "E");
		
		System.out.println(rvalue);
		
		rvalue = lib.Employee("NaveenKumar", "Jaanu548$", "AreaManager", "RFBVtr");
				
	    System.out.println(rvalue);
	    
	    lib.Log_out();

	}

}
