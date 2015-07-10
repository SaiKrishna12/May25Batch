package day27;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailLoginDataProvider {
	@DataProvider(parallel=true)
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="gandham.saikrishna";
		data[0][1]="pass@123";
		data[0][2]="firefox";
		
		data[1][0]="gandham.saikrishna";
		data[1][1]="pass@123";
		data[1][2]="chrome";
		
		return data;
		
	}
	
	@Test(dataProvider="getData")
	public void loginTest(String u,String p,String b) throws InterruptedException, MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		Thread.sleep(5000);
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys(u);
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Passwd")).sendKeys(p);
		driver.findElement(By.id("signIn")).click();
	}
	

}
