package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting2 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		String expurl=driver.findElement(By.linkText("Advertising")).getAttribute("href");
		driver.findElement(By.linkText("Advertising")).click();
		String acturl=driver.getCurrentUrl();
		if(acturl.contains(expurl))
		{
			System.out.println("Advertising link working correctly");
		}
		else
		{
			System.out.println("Advertising link not working correctly");
		}
		driver.close();

	}

}


