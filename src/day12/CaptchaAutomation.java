package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CaptchaAutomation {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.harvard.edu/feedback");
	}
	@Test
	public void captchaTest() throws InterruptedException
	{
		
		driver.findElement(By.id("edit-submitted-name")).sendKeys("tester");
		driver.findElement(By.id("edit-submitted-email")).sendKeys("tester@gmail.com");
		driver.findElement(By.id("edit-submitted-comment")).sendKeys("Stupid...change the capthca");
		String x=driver.findElement(By.xpath("//*[@id='webform-client-form-1884']/div/fieldset/div/div[2]/span")).getText();
		String[] a= x.split(" ");
		int i=Integer.parseInt(a[0]);
		int j=Integer.parseInt(a[2]);
		int k=i+j;
		String str=Integer.toString(k);
		driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
		driver.navigate().refresh();
		
		
	}

}
