package tealiumFinal_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HowerMenu 
{
	public void hower(WebDriver driver) throws Exception
	{
		
		Actions a=new Actions(driver);
		List<WebElement> ls=driver.findElements(By.xpath("//ol[@class='nav-primary']/li"));
		int size=ls.size();
		System.out.println("size of list : "+size);
		for(int i=1;i<=6;i++)
		{
			//wait 
			Thread.sleep(2000);
			//display webElement name
			System.out.println(driver.findElement(By.xpath("//ol[@class='nav-primary']/li["+i+"]")).getText());
			// perform.mouse hover
			a.moveToElement(driver.findElement(By.xpath("//ol[@class='nav-primary']/li["+i+"]"))).click().perform();
		}
	}
}
