package day11;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("This is for reg app");
	}
	
	@Test(priority=2)
	public void logout()
	{
		System.out.println("this is for logout app");
	}
	
	@BeforeMethod
	public void fun()
	{
		System.out.println("abc");
	}

}
