package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("gandham.saikrishna");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Passwd")).sendKeys("password@123");
		driver.findElement(By.id("signIn")).click();
		

	}

}
