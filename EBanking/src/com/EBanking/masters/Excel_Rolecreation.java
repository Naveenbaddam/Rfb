package com.EBanking.masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Rolecreation {

	public static void main(String[] args) throws IOException {
	
		Library LB = new Library();
		
		LB.Launch("http://122.175.8.158/ranford2/");
		
		LB.Admin_Login("Admin","Testing@");
		
		FileInputStream FIL = new FileInputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\testdata\\Rolecreation_testdata.xlsx");
		
		XSSFWorkbook WB = new XSSFWorkbook(FIL);
		
		XSSFSheet WS = WB.getSheet("Roledata");
		
		int RCount = WS.getLastRowNum();
		
		System.out.println(RCount);
		
		for(int i=1 ; i<=RCount; i++)
			
		{
			XSSFRow WR = WS.getRow(i);
			
			XSSFCell WC = WR.getCell(0);
			
			XSSFCell WC1 = WR.getCell(1);
			
			XSSFCell WC2 = WR.createCell(2);
			
			String Rolename = WC.getStringCellValue();
			
			String RoleType = WC1.getStringCellValue();
			
			String Res = LB.Roles(Rolename, RoleType);
			
			System.out.println(Res);
			
			WC2.setCellValue(Res);
			
		}
			
			FileOutputStream FOS = new FileOutputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\results\\RoleRes.xlsx");
			
			WB.write(FOS);
			
			WB.close();
			
    }
		
}


