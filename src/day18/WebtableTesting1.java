package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebtableTesting1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.timeanddate.com/worldclock/");
	}
	@Test
	public void webtableTest()
	{
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[1]";
		for(int i=1;i<=37;i++)
		{
			String x=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
