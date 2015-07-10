package day33;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewtoursLogin {
	private static Logger log=Logger.getLogger(NewtoursLogin.class);
	public static void main(String[] args)
	{
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Launched Browser");
		driver.get("http://newtours.demoaut.com");
		log.info("Navigated to url");
		driver.findElement(By.name("userName")).sendKeys("admin");
		log.info("Enterd username");
		driver.findElement(By.name("password")).sendKeys("admin");
		log.info("Enterd password");
		driver.findElement(By.name("login")).click();
		log.info("Clicked on Sigin");
	}
}
