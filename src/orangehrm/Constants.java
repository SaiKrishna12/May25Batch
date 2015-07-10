package orangehrm;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.qedge.utility.ExcelOperations;
import com.qedge.utility.ReadProperties;

public class Constants {
	static FirefoxDriver driver=null;;
	ExcelOperations eo=new ExcelOperations();
	String path1="E:\\May25\\WebdriverProject\\src\\com\\qedge\\keywords\\LoginKeywords.xlsx";
	ReadProperties rp=new ReadProperties();
	String path2="E:\\May25\\WebdriverProject\\Orangehrm.properties";
	
}
