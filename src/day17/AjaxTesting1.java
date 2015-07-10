package day17;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxTesting1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test
	public void ajaxTest()
	{
		driver.findElement(By.className("gsfi")).sendKeys("Rajnikanth");
		WebElement block=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]"));
		List<WebElement> ajax=block.findElements(By.tagName("li"));
		System.out.println(ajax.size());
		for(int i=0;i<ajax.size();i++)
		{
			System.out.println(ajax.get(i).getText());
		}
	}

}
