package tealiumFinal_Project;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtherFeatures 
{
	//about us
		 public void aboutUs(WebDriver driver)
		 {
			 driver.findElement(By.xpath("//a[normalize-space()='About Us']")).click();
		 }
		 //contact us
		 public void contactUs(WebDriver driver)
		 {
			 driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();
		 }
		 // contact us telephone
		 public void telephone(WebDriver driver)
		 {
			 driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("7017187015");
		 }
		 
		 //comment
		 public void comment(WebDriver driver)
			{
				String comment=JOptionPane.showInputDialog("Enter your comment");
				driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys(comment);	
			}
		 
		 public void submit(WebDriver driver)
		 {
			 driver.findElement(By.xpath("//a[normalize-sp//span[contains(text(),'Submit')]")).click();
		 }
		 // customer service
		 
		 public void cService(WebDriver driver)
		 {
			 driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();
		 }
		 public void myAccount(WebDriver driver)
		 {
			 driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account'][normalize-space()='My Account']")).click();
		 }
		 
		 //my order
		 public void myOrder(WebDriver driver)
		 {
			 driver.findElement(By.xpath("//a[@href='https://ecommerce.tealiumdemo.com/customer/account/'][normalize-space()='View All']")).click();
		 }
		 
		 //view order
		 public void viewOrder(WebDriver driver)
		 {
			 driver.findElement(By.xpath("//a[normalize-space()='View Order']")).click();
		 }
		 
		 //account
		 public void myAccount2(WebDriver driver)
		 {
			 driver.findElement(By.xpath("//a[@class='skip-link skip-account']")).click();
		 }
		//logout
			 public void logout(WebDriver driver)
			 {
				 driver.findElement(By.xpath("//a[@title='Log Out']")).click();
			 }

}
