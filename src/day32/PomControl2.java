package day32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day32.pom.RegisterMercuryTours1;
import day32.pom.RegisterMercuryTours2;
import day32.pom.WelcomeMercuryTours;

public class PomControl2 {
	
	@Test
	public void pomControlTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\May25\\WebdriverProject\\src\\com\\qedge\\excelfiles\\registration.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wm=PageFactory.initElements
					           (driver,WelcomeMercuryTours.class);
		RegisterMercuryTours1 rm1=PageFactory.initElements(driver,RegisterMercuryTours1.class);
		RegisterMercuryTours2 rm2=PageFactory.initElements(driver,RegisterMercuryTours2.class);
		wm.menu.register();
		while(row.hasNext())
		{
			Row r=row.next();
			rm1.contactInformation(r);
			boolean result=rm2.validateRegistration(r.getCell(9).getStringCellValue());
			if(result==true)
			{
				r.createCell(12).setCellValue("Passed");
			}
			else
			{
				r.createCell(12).setCellValue("Failed");
			}
			driver.navigate().back();
		}
		FileOutputStream f1=new FileOutputStream("E:\\May25\\WebdriverProject\\src\\com\\qedge\\resultexcelfiles\\registration.xlsx");
		wb.write(f1);
		f1.close();
		
	}

}
