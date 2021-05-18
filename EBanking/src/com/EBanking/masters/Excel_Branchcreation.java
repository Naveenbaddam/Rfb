package com.EBanking.masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Branchcreation {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Library LB = new Library();
		
		LB.Launch("http://122.175.8.158/ranford2/");
		
		LB.Admin_Login("Admin", "Testing@");
		
		FileInputStream Fis = new FileInputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\testdata\\Branchcreation_testdata.xlsx");
		
		XSSFWorkbook WB = new XSSFWorkbook(Fis);
		
		XSSFSheet WS = WB.getSheet("Branchdata");
		
		int Rcount = WS.getLastRowNum();
		
		System.out.println(Rcount);
		
		for(int i=1; i<=Rcount; i++)
			
		{
			
			XSSFRow WR = WS.getRow(i);
			
			XSSFCell WC = WR.getCell(0);
			
			XSSFCell WC1 = WR.getCell(1);
			
			XSSFCell WC2 = WR.getCell(2);
			
			XSSFCell WC3 = WR.getCell(3);
			
			XSSFCell WC4 = WR.getCell(4);
			
			XSSFCell WC5 = WR.getCell(5);
			
			XSSFCell WC6 = WR.createCell(6);
			
			String Branchnam = WC.getStringCellValue();
			
			String Addres1= WC1.getStringCellValue();
			
			String Zipcod = WC2.getStringCellValue();
			
			String Countr = WC3.getStringCellValue();
			
			String Stat = WC4.getStringCellValue();
			
			String Cit = WC5.getStringCellValue();
			
			String Res = LB.Branches(Branchnam, Addres1, Zipcod, Countr, Stat, Cit);
			
			System.out.println(Res);
			
			WC6.setCellValue(Res);
			
		}
		
		FileOutputStream Fos = new FileOutputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\results\\BranchRes.xlsx");
		
		WB.write(Fos);
		
		WB.close();
			
}
		
}


