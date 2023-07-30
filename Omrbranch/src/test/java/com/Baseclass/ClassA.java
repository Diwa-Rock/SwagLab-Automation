package com.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.omrbranch.page.ExploreHotelPage;
import com.omrbranch.page.LoginPage;

import org.junit.Assert;

public class ClassA extends  baseclass{

	@BeforeClass
	 public static void browserSetup(){
		  browserLaunch();
		  enterUrl("https://omrbranch.com/");
	  maximizeWindow();
		  implicityWait();
	  }
	  @AfterClass
	  public static void afterclass(){
		// quitWindow();
	}
	@Test
	  public void page() throws IOException, InterruptedException{
	LoginPage l=new LoginPage();
	
	implicityWait();
	WebElement logmsg = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
	String text = logmsg.getText();	
	Assert.assertEquals("verify after login message", "Welcome Esaiyarasan",text );
}



}