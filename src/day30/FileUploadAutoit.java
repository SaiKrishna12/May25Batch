package day30;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadAutoit {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.id("SWFUpload_0")).click();
		Thread.sleep(4000);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\upload.exe");
	}

}
