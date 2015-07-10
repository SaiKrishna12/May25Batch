package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HiddenComponentClick {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://yssofindia.org");
	}
	@Test
	public void hiddenTest() throws InterruptedException
	{
		Thread.sleep(7000);
		WebElement element=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/ul/li[5]/ul/li[9]/ul/li[3]/a"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);

	}

}
