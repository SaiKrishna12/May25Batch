package orangehrm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Failure  extends Constants{
	@Test
	public void failTest()
	{
		driver.findElement(By.id("abc")).click();
	}

}
