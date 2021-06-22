package kwd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import basic.Library;

public class KWDGoogleAds 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Library LB=new Library();				 
		 String Res=null;				 
		 String Kpath="C:\\Users\\SHASHANK\\Desktop\\GoogleAdsA\\GoogleAds\\src\\main\\java\\data\\DataGoogleAds.xls";				 
		 String Kout="C:\\Users\\SHASHANK\\Desktop\\GoogleAdsA\\GoogleAds\\src\\main\\java\\data\\DataGoogleAdsRes.xls";
						 
		 FileInputStream fi=new FileInputStream(Kpath);					
		 
			HSSFWorkbook wb=new HSSFWorkbook(fi);                   
			HSSFSheet ws=wb.getSheet("TestCase");
			HSSFSheet ws1=wb.getSheet("TestSteps");					
				
			int tcRc=ws.getLastRowNum();
	        System.out.println(tcRc);
	        
			int tsRc=ws1.getLastRowNum();
			System.out.println(tsRc);				
		//test cases

			for (int i = 1;i<=tcRc-1;i++)
			{
				String exe=ws.getRow(i).getCell(2).getStringCellValue();
				if (exe.equalsIgnoreCase("Y"))
				{
					String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				System.out.println(tcId);						
		//test steps							
					for (int j = 1; j <= tsRc ; j++) 
					{
						String tsTcid=ws1.getRow(j).getCell(0).getStringCellValue();
						//System.out.println(tsTcid);
						if (tcId.equalsIgnoreCase(tsTcid))
						{
							String key=ws1.getRow(j).getCell(3).getStringCellValue();
							System.out.println(key);
							switch (key) 
							{
							case "OpBr":
								Res=LB.OpenBrowser("https://ads.google.com");
								break;
							case "RPS":
								Res=LB.RelatedProducts();
								break;
							case "DAPS": 	
								Res=LB.DevelopersAndPartners();
								break;
							case "LASS":
								Res=LB.LearningAndsupport();
								break;
							case "MSS":
								Res=LB.MoreSolution();
								break;
							case "AGAS":
								Res=LB.AboutGoogleAds();
								break;
							case "HLS":
								Res=LB.HeaderLinks();
								break;
							case "ILS":
								Res=LB.InternalLinks();
								break;
							case "HBS":
								Res=LB.HeaderButton();
								break;
							case "ClBr":
								Res=LB.CloseBrowser();
								break;
							case "BLS":
								Res=LB.BottomLinks();
								break;
			
							default:
								System.out.println("Pass a Valid Keyword");
								break;
							}
												
							ws1.getRow(j).createCell(4).setCellValue(Res);									
												
							if (!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
							{
								ws.getRow(i).createCell(3).setCellValue(Res);
							}
							else
							{
								ws.getRow(i).createCell(3).setCellValue("Fail");
							}										
						}									
					}							
				}
				else
				{
					ws.getRow(i).createCell(3).setCellValue("BLOCKED");
				}
			}
			FileOutputStream fo=new FileOutputStream(Kout);
			wb.write(fo);
			wb.close();
	}

}
