package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {
	
	public static  WebDriver driver;
	
   
	public  static void browserLaunch() {
    	 driver=new ChromeDriver();
    	
    }
   
    public static void enterUrl() {
    	driver.get("https://www.saucedemo.com");
    }
    public static void maximizeWindow() {
    	driver.manage().window().maximize();
    }
    public static void quitWindow() {
		driver.quit();
	}

	public void closeWindow() {
		driver.close();
	}
}
