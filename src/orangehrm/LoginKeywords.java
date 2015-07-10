package orangehrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginKeywords extends Constants{
	
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://localhost:8090/orangehrm");
	}
	public void enterUsername() throws IOException
	{
		String locator=rp.read(path2,"username");
		driver.findElement(By.id(locator)).sendKeys("Admin");
	}
	public void enterPassword() throws IOException
	{
		String locator=rp.read(path2,"password");
		driver.findElement(By.id(locator)).sendKeys("Admin");
	}
	public void clickLogin() throws IOException
	{
		String locator=rp.read(path2,"login");
		driver.findElement(By.id(locator)).click();
	}
	

}
