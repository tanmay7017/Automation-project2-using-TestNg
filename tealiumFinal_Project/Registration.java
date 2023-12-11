package tealiumFinal_Project;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration
{
	// website url
		public void url(WebDriver driver)
		{
			driver.get("https://ecommerce.tealiumdemo.com/");
		}
		//account button
		public void account(WebDriver driver)
		{
			driver.findElement(By.xpath("//span[@class='label'][normalize-space()='Account']")).click();
		}
		// registar button
		public void register(WebDriver driver)
		{
			driver.findElement(By.xpath("//a[@title='Register']")).click();
		}
		//fname
		public void fname(WebDriver driver)
		{
			String fname=JOptionPane.showInputDialog("Enter first name");
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(fname);
		}
		//mname
		public void mname(WebDriver driver)
		{
			String mname=JOptionPane.showInputDialog("Enter middle name");
			driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys(mname);
		}
		//lname
		public void lname(WebDriver driver)
		{
			String lname=JOptionPane.showInputDialog("Enter last name");
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lname);
		}
		//email
		public void email(WebDriver driver)
		{
			String email=JOptionPane.showInputDialog("Enter email");
			driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(email);
		}
		//password
		public void pass(WebDriver driver)
		{
			String pass=JOptionPane.showInputDialog("Enter password");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		}
		//confirm password
		public void pass2(WebDriver driver)
		{
			String pass2=JOptionPane.showInputDialog("confirm password");
			driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys(pass2);
			   JavascriptExecutor js= (JavascriptExecutor)driver;
			   js.executeScript("window.scrollBy(0,800)");
		}
		//signup for newsletter
		public void newsletterSignup(WebDriver driver)
		{
			 WebElement element = driver.findElement(By.xpath("//input[@id='is_subscribed']"));
			 element.click();
		}
		//signup
		public void signup(WebDriver driver)
		{
			 WebElement element =driver.findElement(By.xpath("//button[@title='Register']"));
			 element.click();
		}
		
		//edit registration
		public void editContact(WebDriver driver)
		{ JavascriptExecutor js= (JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,200)");
			driver.findElement(By.xpath("//a[@href='https://ecommerce.tealiumdemo.com/customer/account/edit/'][normalize-space()='Edit']")).click();
		}
		//cange password
		public void cPass(WebDriver driver)
		{
			String cPass=JOptionPane.showInputDialog("Enter password");
			driver.findElement(By.xpath("//input[@id='current_password']")).sendKeys(cPass);
			 JavascriptExecutor js= (JavascriptExecutor)driver;
			   js.executeScript("window.scrollBy(0,350)");
		}
		//click on change button 
		public void changeButton(WebDriver driver)
		{
			 WebElement element =driver.findElement(By.xpath("//input[@id='change_password']"));
			 element.click();
		}
		//new password
		public void nPass(WebDriver driver)
		{
			String nPass=JOptionPane.showInputDialog("Enter new password");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(nPass);	
		}
		//confirm new password
		public void nPass2(WebDriver driver)
		{
			String nPass2=JOptionPane.showInputDialog("Enter new password");
			driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys(nPass2);	
		}
		//click on save button
		public void save(WebDriver driver)
		{
			WebElement element =driver.findElement(By.xpath("//button[@title='Save']"));
			 element.click();
		}
		// click on account button
		public void account2(WebDriver driver)
		{
			WebElement element =driver.findElement(By.xpath("//span[@class='label'][normalize-space()='Account']"));
			 element.click();
		}
		// click on logout button
		public void logout(WebDriver driver)
		{
			driver.findElement(By.xpath("//a[@title='Log Out']")).click();
		
		}
		
}
