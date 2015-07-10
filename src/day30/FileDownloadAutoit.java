package day30;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadAutoit {

		public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.46.0")).click();
		Thread.sleep(4000);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\download.exe");
		
		
		

	}

}
