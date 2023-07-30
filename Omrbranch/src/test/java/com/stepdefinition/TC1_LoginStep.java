package com.stepdefinition;


import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.Baseclass.baseclass;
import com.omrbranch.pageManager.PageObjectManager;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class TC1_LoginStep extends baseclass {
	PageObjectManager pom=new PageObjectManager();
	@Given("User is on the OMR Branch hotel page")
	public void user_is_on_the_omr_branch_hotel_page() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browser"));
		enterUrl(getPropertyFileValue("url"));
		implicityWait();
	  
	}
	@When("User login {string},{string}")
	public void user_login(String userName, String password) {
	   pom.getLoginPage().login(userName, password);
	}
	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String string) throws InterruptedException {
	Thread.sleep(5000);
		Assert.assertEquals("verify after Login",string, pom.getExploreHotelPage().getTxtlogmsg());
	
	}	
	@When("User login {string},{string} with Enter key")
	public void user_login_with_enter_key(String userName, String password) throws AWTException {
		pom.getLoginPage().enterKey(userName, password);
   }



	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String string) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue("verify after Login error message",pom.getLoginPage().getLoginErrorMsg().contains(string));
	}





}
