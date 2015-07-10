package day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DropdownExcel {
	
	@Test
	public void dropdowntest() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\Dropdown.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row r=null;
		Cell c=null;
		 
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));

		for(int i=0;i<dropdown.size();i++)
		{
			r=ws.createRow(i);
			c=r.createCell(0);
			c.setCellValue(dropdown.get(i).getText());
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				r.createCell(1).setCellValue("Passed");
				
			}
			else
			{
				r.createCell(1).setCellValue("Failed");
				
			}
		}
		FileOutputStream f1=new FileOutputStream("C:\\Users\\sai\\Desktop\\Dropdown.xlsx");
		wb.write(f1);
		f1.close();
			
			
			
			
			
			
			
			
			
	
	}

}
