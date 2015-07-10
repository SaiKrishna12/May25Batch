import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Project1 {

	
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/products-services/banking/citibanking-account-form.htm?site=PORTAL&creative=NGX&section=INHOBACTACF&agencyCode=XER&campaignCode=&productCode=&eOfferCode=INHOBACTACF");
		Thread.sleep(6000);
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[3]/div[3]/div/div/form/div[1]/ul[1]/li[1]/p[2]/div/a[2]")).click();
		driver.findElement(By.linkText("Mr.")).click();
		driver.findElement(By.id("firstname")).sendKeys("sai");
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[3]/div[3]/div/div/form/div[1]/ul[1]/li[2]/p[2]/div/a[2]")).click();
		
		driver.findElement(By.linkText("Bengaluru")).click();
		driver.findElement(By.id("age")).sendKeys("10");
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[3]/div[3]/div/div/form/div[1]/ul[2]/li[1]/p[2]/div/a[2]")).click();
		driver.findElement(By.linkText("Self-Employed")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[3]/div[3]/div/div/form/div[1]/ul[2]/li[2]/p[2]/div/a[2]")).click();
		driver.findElement(By.linkText("10 - 20 Lakh")).click();
		driver.findElement(By.id("mobileno")).sendKeys("9999999999");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	}

}
