package com.EBanking.masters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad_Branchcreation {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Library LB = new Library();
		
		LB.Launch("http://122.175.8.158/ranford2/");
		
		LB.Admin_Login("Admin", "Testing@");
		
		String Fpath = "C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\testdata\\Notepad_BranchCreation_testdata.txt";
		
		String Rpath = "C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\results\\BranchRes_np.txt";
		
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
			
			String SR[] = SD.split("#####");
			
			String BranchNm = SR[0];
			
			String Addr1 = SR[1];
			
			String Zpcode = SR[2];
			
			String Cntry = SR[3];
			
			String Stat = SR[4];
			
			String Cty = SR[5];
			
			String Res = LB.Branches(BranchNm, Addr1, Zpcode, Cntry, Stat, Cty);
			
			System.out.println(Res);
			
			BW.write(SD+"$$$$$"+Res);
			
			BW.newLine();
			
			
		}
		
		
		BW.close();
		
		BR.close();
		
	}

}
