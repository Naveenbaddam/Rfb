package com.EBanking.Keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.EBanking.Keyword.LibraryK;

public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException
	
	{
		LibraryK Lb = new LibraryK();
		
		String Res = null;
		
		FileInputStream fi = new FileInputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\Keyword\\keyword_data.xlsx");
		
		XSSFWorkbook Wb = new XSSFWorkbook(fi);
		
		XSSFSheet Ws = Wb.getSheet("TestCase");
		
		XSSFSheet Ws1 = Wb.getSheet("TestSteps");
		
		int TCRowcount = Ws.getLastRowNum();
		
		System.out.println(TCRowcount);
		
		int TSRowcount = Ws1.getLastRowNum();
		
		System.out.println(TSRowcount);
		
		for(int i=1; i<=TCRowcount; i++)
		{
			String Exe = Ws.getRow(i).getCell(2).getStringCellValue();
			
			if(Exe.equalsIgnoreCase("Y"))
			{
				String TCID = Ws.getRow(i).getCell(0).getStringCellValue();
				
				System.out.println(TCID);
				
				for(int j = 1; j<=TSRowcount; j++ )
				{
					String TSTCID = Ws1.getRow(j).getCell(0).getStringCellValue();
					
					if(TCID.equalsIgnoreCase(TSTCID))
					{
						String Key = Ws1.getRow(j).getCell(3).getStringCellValue();
						
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
						    	
						          Res = Lb.Branches("sbinavegdjjdjk", "hakdjlfldkl", "58956", "INDIA", "GOA","GOA");
								    	
							       break;
							       
						    case "RRole":
						    	
						    	   Res = Lb.Roles("AsstManmann", "E");
						    	   
						    	   break;
						    	   
						    case "REmR":
						    	
						    	   Res = Lb.Employee("Navbadredhdy", "Navrheddy$", "AsstManman", "Bankasdfgh");
						    	   
						    	   break;
						    	   
						    case "RClose":
						    	
							      Res = Lb.Close();
								    	
							       break;
							       
							default:
								
								System.out.println( "Pass a valid keyword");
							    
								break;
						    	   
						}
						
						Ws1.getRow(j).createCell(4).setCellValue(Res);
						
						if (!Ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							Ws.getRow(i).createCell(3).setCellValue(Res);
						}
						
						else
							
						{
							Ws.getRow(i).createCell(3).setCellValue("Fail");
						}
						
						
					}
					
				}
			}
			
			else
				
			{
				
				Ws.getRow(i).createCell(3).setCellValue("Blocked");
			}
		}
	
	FileOutputStream Fo = new FileOutputStream("C:\\ProjectWorkSpace\\EBanking\\src\\com\\EBanking\\Keyword\\KeyworlRes_data.xlsx");
	
	Wb.write(Fo);
	
	Wb.close();
	
}
}
