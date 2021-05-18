package com.EBanking.masters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad_RoleCreation {

	public static void main(String[] args) throws IOException {
		
		Library LB = new Library();
		
		LB.Launch("http://122.175.8.158/ranford2/");
		
		LB.Admin_Login("Admin", "Testing@");
		
		String Fpath = "C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\testdata\\Notepad_RoleCreation_testdata.txt";
		
		String Rpath = "C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\results\\RoleRes_np.txt_";
		
		String SD;
		
		FileReader FR = new FileReader(Fpath);
		
		BufferedReader BR = new BufferedReader(FR);
		
		String Sread = BR.readLine();
		
		System.out.println(Sread);
		
		FileWriter FW = new FileWriter(Rpath);
		
		BufferedWriter BW = new BufferedWriter(FW);
		
		BW.write(Sread);
		
		BW.newLine();
		
		while((SD = BR.readLine())!=null)
			
		{
			System.out.println(SD);
			
			String SR[] = SD.split("###");
			
			String Rname = SR[0];
			
			String Rtype = SR[1];
			
			String Res = LB.Roles(Rname, Rtype);
			
			System.out.println(Res);
			
			BW.write(SD+"$$$"+Res);
			
			BW.newLine();
			
		}
		
		BW.close();
		BR.close();
		
	}

}
