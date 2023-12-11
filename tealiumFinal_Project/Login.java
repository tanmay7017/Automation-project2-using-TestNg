package tealiumFinal_Project;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{
	//click My account
		
			public void myAccount(WebDriver driver)
			{
				driver.findElement(By.xpath("//span[@class='label'][normalize-space()='Account']")).click();
			}
			//login
			public void login(WebDriver driver)
			{
				driver.findElement(By.xpath("//a[@title='Log In']")).click();
			}
			//fname
			public void email(WebDriver driver)
			{
				String email=JOptionPane.showInputDialog("Enter Username");
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
			}
			//password
			public void pass(WebDriver driver)
			{
				String pass=JOptionPane.showInputDialog("Enter password");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
			}
			//login button
			public void log(WebDriver driver)
			{
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
				WebElement element =driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
				element.click();
			}
			//home
			public void home(WebDriver driver)
			{
				driver.findElement(By.xpath("//img[@class='large']")).click();
			}
			
			
			

}
