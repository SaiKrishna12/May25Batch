package orangehrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Login  extends Constants{
	
	LoginKeywords keys=new LoginKeywords();
	Method[] methods=keys.getClass().getMethods();
	@Test
	public void loginTest() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		int rowCount=eo.getRowCount(path1,0);
		for(int i=1;i<=rowCount;i++)
		{
			String action=eo.excelRead(path1,0,i,3);	
			executeActions(action);
		}
	}
	
	public void executeActions(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<methods.length;i++)
		{
			if(methods[i].getName().equals(action))
			{
				methods[i].invoke(keys);
			}
		}
	}

}
