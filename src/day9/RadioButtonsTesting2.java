package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsTesting2 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		for(int k=1;k<=2;k++)
		{
		   List<WebElement> radio=block.findElements(By.name("group"+k));
		   for(int i=0;i<radio.size();i++)
		   {
			   radio.get(i).click();
			   for(int j=0;j<radio.size();j++)
			   {
				   System.out.println(radio.get(j).getAttribute("value")+
						                  "--"+radio.get(j).getAttribute("checked"));
			   }
			   System.out.println("#####################");
		    }
		}
		
		
		
		driver.close();

	}

}
