package com.EBanking.Hybrid;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.EBanking.Keyword.LibraryK;

public class Hybrid 

   {

	public static void main(String[] args) throws IOException, InterruptedException
	
	{
		LibraryH Lb = new LibraryH();
		
		String Res = null;
		
		FileInputStream fi = new FileInputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\Hybrid\\Hybrid_data.xlsx");
		
		XSSFWorkbook Wb = new XSSFWorkbook(fi);
		
		XSSFSheet TCSheet = Wb.getSheet("TestCase");
		
		XSSFSheet TSSheet = Wb.getSheet("TestSteps");
		
		XSSFSheet BSheet = Wb.getSheet("Bdata");
		
		XSSFSheet RSheet = Wb.getSheet("Rdata");
		
		XSSFSheet ESheet = Wb.getSheet("Empdata");
		
		int TCRowcount = TCSheet.getLastRowNum();
		
		System.out.println(TCRowcount);
		
		int TSRowcount = TSSheet.getLastRowNum();
		
		System.out.println(TSRowcount);
		
		int BRowcount = BSheet.getLastRowNum();
		
		System.out.println(BRowcount);
		
		for(int i=1; i<=TCRowcount; i++)
		{
			String Exe = TCSheet.getRow(i).getCell(2).getStringCellValue();
			
			if(Exe.equalsIgnoreCase("Y"))
			{
				String TCID = TCSheet.getRow(i).getCell(0).getStringCellValue();
				
				System.out.println(TCID);
				
				for(int j = 1; j<=TSRowcount; j++ )
				{
					String TSTCID = TSSheet.getRow(j).getCell(0).getStringCellValue();
					
					if(TCID.equalsIgnoreCase(TSTCID))
					{
						String Key = TSSheet.getRow(j).getCell(3).getStringCellValue();
						
						System.out.println(Key);
						
						switch (Key) 
						{
						    case "RLanch":
						    	   
					               Res = Lb.Launch("http://122.175.8.158/ranford2/");
						    	
						           break;
						    
						    case "RLogin":
						    	
						            Res = Lb.Admin_Login("Admin", "Testing@");
							    	
						            break;
						       
						    case "RLogout":
						    	
							       Res = Lb.Log_out();
								    	
							       break;
							       
						          
						    case "RBranch":
						    	
						    	for(int k=1 ; k<=BRowcount; k++)
						    		
						    	{
						    		XSSFRow Br = BSheet.getRow(k);
						    		
						    		XSSFCell Wc = Br.getCell(0);
						    		
						    		XSSFCell Wc1 = Br.getCell(1);
						    		
						    		XSSFCell Wc2 = Br.getCell(2);
						    		
						    		XSSFCell Wc3 = Br.getCell(3);
						    		
						    		XSSFCell Wc4 = Br.getCell(4);
						    		
						    		XSSFCell Wc5 = Br.getCell(5);
						    		
						    		XSSFCell Wc6 = Br.createCell(6);
						    		
						    		String Bname = Wc.getStringCellValue();
						    		
						    		String Addr1 = Wc1.getStringCellValue();
						    		
						    		String Zcode = Wc2.getStringCellValue();
						    		
						    		String Cntry = Wc3.getStringCellValue();
						    		
						    		String Sta = Wc4.getStringCellValue();
						    		
						    		String Cty = Wc5.getStringCellValue();
						          
							        Res = Lb.Branches(Bname, Addr1, Zcode, Cntry, Sta, Cty);
							        
							        System.out.println(Res);
							        
							        Wc6.setCellValue(Res);
							        
						    	   }
						    	
						    	   FileOutputStream Fos = new FileOutputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\Hybrid\\HybridRes_data.xlsx");
						    	   
						    	   Wb.write(Fos);
						    	   
						    	  // Wb.close();
						    	   
						    	   break;
							       
						    case "RRole":
						    	
						    	   Res = Lb.Roles("AsstManman", "E");
						    	   
						    	   break;
						    	   
						    case "REmR":
						    	
						    	   Res = Lb.Employee("Navbadreddy", "Navreddy$", "AsstManman", "Bankasdfgh");
						    	   
						    	   break;
						    	   
						    case "RClose":
						    	
							      Res = Lb.Close();
								    	
							       break;
							       
							default:
								
								System.out.println( "Pass a valid keyword");
							    
								break;
						    	   
						}
						
						TSSheet.getRow(j).createCell(4).setCellValue(Res);
						
						if (!TSSheet.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							TCSheet.getRow(i).createCell(3).setCellValue(Res);
						}
						
						else
							
						{
							TCSheet.getRow(i).createCell(3).setCellValue("Fail");
						}
						
						
					}
					
				}
			}
			
			else
				
			{
				
				TCSheet.getRow(i).createCell(3).setCellValue("Blocked");
			}
		}
	
		Thread.sleep(3000);
		
	FileOutputStream Fo = new FileOutputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\Hybrid\\HybridRes_data.xlsx");
	
	Wb.write(Fo);
	
	Thread.sleep(3000);
	
	Wb.close();
	
}
}
