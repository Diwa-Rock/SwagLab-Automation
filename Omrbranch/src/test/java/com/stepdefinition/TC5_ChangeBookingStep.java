package com.stepdefinition;

import org.junit.Assert;

import com.Baseclass.baseclass;
import com.omrbranch.pageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class TC5_ChangeBookingStep extends baseclass{
	PageObjectManager pom= new PageObjectManager();

	@When("User navigate to the my Bookings page")
	public void user_navigate_to_the_my_bookings_page() {
	    pom.getMyBookingPage().navigateMyBookingPage();
	}
	@Then("User veirfy after navigate success message {string}")
	public void user_veirfy_after_navigate_success_message(String string) {
		Assert.assertEquals("veirfy after navigate success message",string,pom.getMyBookingPage().getTxtmybookingsucmsg());
	}
	@When("User search the generated order Id")
	public void user_search_the_generated_order_id() {
	   pom.getMyBookingPage().searchOrderId();
	}
	@Then("User verify the order Id")
	public void user_verify_the_order_id() {
	    
	}
	@Then("User verify the Hotel name")
	public void user_verify_the_hotel_name() {
	   
	}
	@Then("User verify the Hotel price")
	public void user_verify_the_hotel_price() {
	   
	}
	@When("User edit the checkin Date {string}")
	public void user_edit_the_checkin_date(String editCheckinDate) {
	   pom.getMyBookingPage().changeChkInDate(editCheckinDate);
	}
	@Then("User verify After modify checkin date success message {string}")
	public void user_verify_after_modify_checkin_date_success_message(String string) {
		Assert.assertEquals("veirfy after modify checkin date success message",string,pom.getMyBookingPage().getTxtbookingupdatesuccesmsg());
	}
	@When("User modify the first order Id")
	public void user_modify_the_first_order_id() {
	//   pom.getMyBookingPage().changeChkInDate(editCheckinDate);
	}
	@When("User search the existing order Id {string}")
	public void user_search_the_existing_order_id(String string) {
	  
	}
	
	
}
