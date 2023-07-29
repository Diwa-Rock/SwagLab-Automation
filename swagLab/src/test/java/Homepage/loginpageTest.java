package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pom.Basepage;
import Pom.Loginpage;
import Pom.orderpage;

public class loginpageTest extends Basepage{
	
	public Loginpage lp;
	
	public Pom.addtocartpage add;
	public orderpage op;
	
	

	
	@BeforeSuite
	public void setup() {
		Basepage.browserLaunch();
    	Basepage.enterUrl();
    	Basepage.maximizeWindow();		
	}
	@AfterSuite
	public void teardown() {
		Basepage.quitWindow();
	}
    
	public void login() {
    	lp = new Loginpage(driver);
    	lp.loginToTheUser("standard_user","secret_sauce");
    }
    @Test
    public void verifycomplete() {
    	login();
 
    	add = new Pom.addtocartpage(driver);
    	Assert.assertEquals(add.addToCart(), "Remove");
    	op = new orderpage(driver);
    	System.out.println(op.provideAddressOnOrderPage());
    }
  

}
