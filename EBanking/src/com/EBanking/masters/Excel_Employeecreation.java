package com.EBanking.masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Employeecreation {

	public static void main(String[] args) throws IOException {
		
        Library LB = new Library();
		
		LB.Launch("http://122.175.8.158/ranford2/");
		
		LB.Admin_Login("Admin", "Testing@");
		
		FileInputStream Fis = new FileInputStream("\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\testdata\\Employeecreation_testdata.xlsx");
		
		XSSFWorkbook WB = new XSSFWorkbook(Fis);
		
		XSSFSheet WS = WB.getSheet("Employeedata");
		
		int Rcount = WS.getLastRowNum();
		
		System.out.println(Rcount);
		
		for(int i=1; i<=Rcount; i++)
			
		{
			
			XSSFRow WR = WS.getRow(i);
			
			XSSFCell WC = WR.getCell(0);
			
			XSSFCell WC1 = WR.getCell(1);
			
			XSSFCell WC2 = WR.getCell(2);
			
			XSSFCell WC3 = WR.getCell(3);
			
			XSSFCell WC4 = WR.createCell(4);
			
			String EmpName = WC.getStringCellValue();
			
			String LogPass= WC1.getStringCellValue();
			
			String Rol = WC2.getStringCellValue();
			
			String Branc = WC3.getStringCellValue();
			
			String Res = LB.Employee(EmpName, LogPass, Rol, Branc);
			
			System.out.println(Res);
			
			WC4.setCellValue(Res);
			
		}
		
		FileOutputStream Fos = new FileOutputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\results\\EmployeeRes.xlsx");
		
		WB.write(Fos);
		
		WB.close();


	}

}
