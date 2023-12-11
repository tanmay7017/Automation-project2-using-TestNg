package tealiumFinal_Project;

import org.testng.annotations.Test;

import tealium_finalProject.LogIn;
import tealium_finalProject.Registraion;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MainClass {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Browser Extensions\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
  }

  @Test (priority = 1)
  public void Registratio() throws Exception
  {
	  Registration r=new Registration();
		r.url(driver);
		Thread.sleep(2000);
		r.account(driver);
		Thread.sleep(2000);
		r.register(driver);
		Thread.sleep(2000);
		r.fname(driver);
		Thread.sleep(2000);
		r.mname(driver);
		Thread.sleep(2000);
		r.lname(driver);
		Thread.sleep(2000);
		r.email(driver);
		Thread.sleep(2000);
		r.pass(driver);
		Thread.sleep(2000);
		r.pass2(driver);
		Thread.sleep(2000);
		r.newsletterSignup(driver);
		Thread.sleep(2000);
		r.signup(driver);
		Thread.sleep(2000);
		r.editContact(driver);
		Thread.sleep(2000);
		r.cPass(driver);
	    Thread.sleep(2000);
	    r.changeButton(driver);
	    Thread.sleep(2000);
	    r.nPass(driver);
	    Thread.sleep(2000);
	    r.nPass2(driver);
	    Thread.sleep(2000);
	    r.save(driver);
	    Thread.sleep(2000);
	    r.account2(driver);
	    Thread.sleep(2000);
	    r.logout(driver);
	    Thread.sleep(2000);
		  
  }
  
  @Test (priority = 2)
  public void Login() throws Exception
  {
	  LogIn l=new LogIn();
		 
		 l.myAccount(driver);
		 Thread.sleep(2000);
		 l.login(driver);
		 Thread.sleep(2000);
		 l.email(driver);
		 Thread.sleep(2000);
		 l.pass(driver);
		 Thread.sleep(2000);
		 l.log(driver);
		 Thread.sleep(2000);
		 l.home(driver);
		 Thread.sleep(2000);
		
  }
  
  @Test(priority = 3)
  public void HowerMenu() throws Exception 
  {
	  HowerMenu h=new HowerMenu();
	  h.hower(driver);
		 Thread.sleep(2000);
  }
  
  @Test(priority = 4)
  public void SearchItem() throws Exception 
  {
	  SearchItem s= new SearchItem();
	  s.cross(driver);
	  Thread.sleep(2000);
	  s.search(driver);
	  Thread.sleep(2000);
	  s.details(driver);
	  Thread.sleep(2000);
	  s.size(driver);
	  Thread.sleep(2000);
	  s.color(driver);
	  Thread.sleep(2000);
	  s.addToCart(driver);
	  Thread.sleep(2000);
	  s.country(driver);
	  Thread.sleep(2000);
	  s.state(driver);
	  Thread.sleep(2000);
	  s.zip(driver);
	  Thread.sleep(2000);
	  s.checkout(driver);
	  Thread.sleep(2000);
	  s.company(driver);
	  Thread.sleep(2000);
	  s.add(driver);
	  Thread.sleep(2000);
	  s.street(driver);
	  Thread.sleep(2000);
	  s.city(driver);
	  Thread.sleep(2000);
	  s.country2(driver);
	  Thread.sleep(2000);
	  s.state2(driver);
	  Thread.sleep(2000);
	  s.zip2(driver);
	  Thread.sleep(2000);
	  s.tel(driver);
	  Thread.sleep(2000);
	  s.fax(driver);
	  Thread.sleep(2000);
	  s.continu(driver);
	  Thread.sleep(2000);
	  s.continu2(driver);
	  Thread.sleep(2000);
	  s.continu3(driver);
	  Thread.sleep(2000);
	  s.placeOrder(driver);
	  Thread.sleep(2000);
	  s.continueShopping(driver);
	  Thread.sleep(2000);
	  
  }
  @Test(priority = 5)
  public void Otherfeatures() throws Exception 
  {
	 OtherFeatures o=new  OtherFeatures();
	 o.aboutUs(driver);
	 Thread.sleep(2000);
	 o.contactUs(driver);
	 Thread.sleep(2000);
	 o.telephone(driver);
	 Thread.sleep(2000);
	 o.comment(driver);
	 Thread.sleep(2000);
	 o.submit(driver);
	 Thread.sleep(2000);
	 o.cService(driver);
	 Thread.sleep(2000);
	 o.myAccount(driver);
	 Thread.sleep(2000);
	 o.myOrder(driver);
	 Thread.sleep(2000);
	 o.viewOrder(driver);
	 Thread.sleep(2000);
	 o.myAccount2(driver);
	 Thread.sleep(2000);
	 o.logout(driver);
	 Thread.sleep(2000);
  }
  
  @AfterTest
  public void afterTest() {
  }

}
