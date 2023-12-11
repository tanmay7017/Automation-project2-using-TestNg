package tealiumFinal_Project;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchItem 
{
	public void cross(WebDriver driver)
	{
		driver.findElement(By.xpath("//div[@id='_tealiumModalClose']")).click();
	}

	public void search(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("shirts");
	}
	
	public void details(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[1]/div[1]/div[2]/a[1]")).click();
		
	}
	public void size(WebDriver driver)
	{
		driver.findElement(By.xpath("//span[@class='swatch-label'][normalize-space()='L']")).click();
	}
	
	public void color(WebDriver driver)
	{
		driver.findElement(By.xpath("//img[@alt='Khaki']")).click();
	}
	
	public void addToCart(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//button[@onclick='productAddToCartForm.submit(this)']//span//span[contains(text(),'Add to Cart')]")).click();
	}
	public void country(WebDriver driver)
	{
		Select s=new Select(driver.findElement(By.xpath("//select[@id='input-payment-country']")));
		s.selectByIndex(100);	
	}
	public void state(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@id='region']")).sendKeys("Uttar Pradesh");
	}
	public void zip(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("202001");
	}
	//checkout
	public void checkout(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//li[@class='method-checkout-cart-methods-onepage-bottom']//button[@title='Proceed to Checkout']//span//span[contains(text(),'Proceed to Checkout')]")).click();
	}
	
	//billing info
	//company
	public void company(WebDriver driver)
	{
		String cmp=JOptionPane.showInputDialog("Enter company name");
		driver.findElement(By.xpath("//input[@id='billing:company']")).sendKeys(cmp);	
	}
	public void add(WebDriver driver)
	{
		String add=JOptionPane.showInputDialog("Enter company name");
		driver.findElement(By.xpath("//input[@id='billing:street1']")).sendKeys(add);	
	}
	public void street(WebDriver driver)
	{
		String street=JOptionPane.showInputDialog("Enter company name");
		driver.findElement(By.xpath("//input[@id='billing:street2']")).sendKeys(street);	
	}
	public void city(WebDriver driver)
	{
		String city=JOptionPane.showInputDialog("Enter company name");
		driver.findElement(By.xpath("//input[@id='billing:city']")).sendKeys(city);	
	}
	
	public void country2(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Select s=new Select(driver.findElement(By.xpath("//select[@id='billing:country_id']")));
		s.selectByIndex(91);	
	}
	
	public void state2(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@id='billing:region']")).sendKeys("Uttar Pradesh");
	}
	public void zip2(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@id='billing:postcode']")).sendKeys("202001");
	}
	
	public void tel(WebDriver driver)
	{
		String tel=JOptionPane.showInputDialog("Enter company name");
		driver.findElement(By.xpath("//input[@id='billing:telephone']")).sendKeys(tel);	
	}
	public void fax(WebDriver driver)
	{
		String fax=JOptionPane.showInputDialog("Enter company name");
		driver.findElement(By.xpath("//input[@id='billing:fax']")).sendKeys(fax);	
	}
	
	public void continu(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.xpath("//button[@onclick='billing.save()']")).click();
	}
	
	public void continu2(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[@onclick='shippingMethod.save()']//span//span[contains(text(),'Continue')]")).click();
	}
	
	public void continu3(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[@class='button']//span//span[contains(text(),'Continue')]")).click();
		}
	
	public void placeOrder(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[@title='Place Order']")).click();	
	}
	public void continueShopping(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[@title='Continue Shopping']")).click();	
	}
}
