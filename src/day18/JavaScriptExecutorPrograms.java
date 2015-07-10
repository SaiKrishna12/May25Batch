package day18;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorPrograms {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void alertHandling() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('hello world');");
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		a.accept();

	}

}
