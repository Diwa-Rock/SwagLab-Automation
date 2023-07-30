package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.Baseclass.baseclass;
import com.omrbranch.pageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class TC4_BookHotelStep extends baseclass{
	PageObjectManager pom= new PageObjectManager();

	@When("User add the Guest details {string},{string},{string},{string},{string}")
	public void user_add_the_guest_details(String salutation, String firstName, String lastName, String phoneno, String email) throws InterruptedException {
	   pom.getBookHotelPage().addGuestDetails(salutation, firstName, lastName, phoneno, email);
	   pom.getBookHotelPage().clickNext();
	   pom.getBookHotelPage().clicksecondNext();
	}
	@When("User add the payment details {string}")
	public void user_add_the_payment_details(String selectCardType, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	  pom.getBookHotelPage().addPaymentDetails(selectCardType, dataTable);
	  pom.getBookHotelPage().getBtnsubmit();
	}
	@Then("User verify Booking confirmation message {string}  and save the order Id")
	public void user_verify_booking_confirmation_message_and_save_the_order_id(String string) {
	   pom.getBookingConfirmPage().getTextbookingsucmsg();
	}
	@Then("User verify the selected same hotel only booked or not")
	public void user_verify_the_selected_same_hotel_only_booked_or_not() {
	   
	}
	
	@When("User add GST details {string},{string},{string}")
	public void user_add_gst_details(String enterRegistrationNo, String enterCompanyName, String enterCompanyAddress) {
	   pom.getBookHotelPage().addGstDetails(enterRegistrationNo, enterCompanyName, enterCompanyAddress);
	}
	@When("User add special request {string}")
	public void user_add_special_request(String specialRequest) {
	    pom.getBookHotelPage().addSplReq(specialRequest);
	}
	@When("User click the submit without giving payment details")
	public void user_click_the_submit_without_giving_payment_details() {
	  pom.getBookHotelPage().clickPayment();
	}
	@Then("User verify all error messages without giving payment details {string},{string},{string},{string},{string} and {string}")
	public void user_verify_all_error_messages_without_giving_payment_details_and(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		Thread.sleep(5000);
	   Assert.assertTrue("verify cardType error msg",pom.getBookHotelPage().getTxterrorcardtype().contains(string));
	   Assert.assertTrue("verify card error msg",pom.getBookHotelPage().getTxterrorcard().contains(string2));
	   Assert.assertTrue("verify card no error msg",pom.getBookHotelPage().getTxterrorcardno().contains(string3));
	   Assert.assertTrue("verify card name error msg",pom.getBookHotelPage().getTxterrorcardname().contains(string4));
	   Assert.assertTrue("verify card month error msg",pom.getBookHotelPage().getTxterrorcardmonth().contains(string5));
	   Assert.assertTrue("verify card cvv error msg",pom.getBookHotelPage().getTxterrorinvalidcvv().contains(string6));
	}










}
