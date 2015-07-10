package day30;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadRobot {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.46.0")).click();
		Thread.sleep(4000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
