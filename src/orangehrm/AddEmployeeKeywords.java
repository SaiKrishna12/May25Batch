package orangehrm;

import java.io.IOException;

import org.openqa.selenium.By;

public class AddEmployeeKeywords  extends Constants{
	public void clickPim() throws IOException
	{
		String locator=rp.read(path2,"pim");
		driver.findElement(By.xpath(locator)).click();
		
	}
	
	public void clickAddEmployee() throws IOException
	{
		String locator=rp.read(path2,"addemployee");
		driver.findElement(By.id(locator)).click();
	}
	
	
	public void enterFirstName() throws IOException
	{
		String locator=rp.read(path2,"fname");
		driver.findElement(By.id(locator)).sendKeys("sai");
	}
	
	public void enterMiddleName() throws IOException
	{
		String locator=rp.read(path2,"mname");
		driver.findElement(By.id(locator)).sendKeys("krishna");
	}
	
	public void enterLastName() throws IOException
	{
		String locator=rp.read(path2,"lname");
		driver.findElement(By.id(locator)).sendKeys("g");
	}
	
	public void enterempId() throws IOException
	{
		String locator=rp.read(path2,"empid");
		driver.findElement(By.id(locator)).sendKeys("111");
	}
	
	public void checkLoginDetails() throws IOException
	{
		String locator=rp.read(path2,"createLogin");
		driver.findElement(By.id(locator)).click();
	}
	public void enterUsername() throws IOException
	{
		String locator=rp.read(path2,"uname");
		driver.findElement(By.id(locator)).sendKeys("Sai123");
	}
	
	public void enterPassword() throws IOException
	{
		String locator=rp.read(path2,"upassword");
		driver.findElement(By.id(locator)).sendKeys("pass@1234");
	}
	
	public void confirmPassword() throws IOException
	{
		String locator=rp.read(path2,"cpassword");
		driver.findElement(By.id(locator)).sendKeys("pass@1234");
	}
	
	public void enterStatus() throws IOException
	{
		String locator=rp.read(path2,"status");
		driver.findElement(By.id(locator)).sendKeys("Enabled");
	}
	
	public void clickSave() throws IOException
	{
		String locator=rp.read(path2,"save");
		driver.findElement(By.id(locator)).click();
	}
	
	
	
	
	
	

}
