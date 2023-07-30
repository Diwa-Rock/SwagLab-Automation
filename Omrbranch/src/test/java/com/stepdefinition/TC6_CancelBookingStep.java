package com.stepdefinition;


import com.Baseclass.baseclass;
import com.omrbranch.pageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class TC6_CancelBookingStep extends baseclass{
	PageObjectManager pom= new PageObjectManager();
	@When("User cancel the booking")
	public void user_cancel_the_booking() {
		pom.getMyBookingPage().searchOrderId();
	    pom.getMyBookingPage().cancelOrderId();
	}
	@Then("User verify after cancel booking success message {string}")
	public void user_verify_after_cancel_booking_success_message(String string) {
	   
	}
	@When("User cancel the first order Id booking")
	public void user_cancel_the_first_order_id_booking() {
	  pom.getMyBookingPage().cancelOrderId();
	}









}
