import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Example {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.com"); //open google
		driver.findElement(By.className("gsfi")).sendKeys("hello"); //type hello
	         driver.findElement(By.className("lsb")).click(); //click search 
                 //going back to google
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='rso']/div[2]/li[5]/div/h3/a")).click(); //go to link hello facebook
		//not working--first going back to google page and after that going to link hello facebook
		driver.navigate().back();
		driver.navigate().back();

	}

}
