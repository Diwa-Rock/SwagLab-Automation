package com.stepdefinition;


import com.Baseclass.baseclass;
import com.omrbranch.pageManager.PageObjectManager;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class TC2_ExploreHotelStep extends baseclass {
	PageObjectManager pom=new PageObjectManager();
	
	@When("User search {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_and(String stateName, String city, String roomType, String chkindate, String chkoutdate, String noOfRoom, String noOfAdults, String noOfChild) {
	    pom.getExploreHotelPage().SearchHotel(stateName, city, roomType, chkindate, chkoutdate, noOfRoom, noOfAdults, noOfChild);
	}
	@Then("User should verify success message after search {string}")
	public void user_should_verify_success_message_after_search(String string) throws InterruptedException {
		Thread.sleep(5000);
	    Assert.assertEquals("verify after search success message",string,pom.getSelectHotelPage().getTxtselectsuccessmsg());
	}

	@Then("User should verify selected room type present in header {string}")
	public void user_should_verify_selected_room_type_present_in_header(String string) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals("verify selected room type present in header",string,pom.getSelectHotelPage().getTxtheaderroomtype());
	}

	@Then("User should verify selected hotel name endswith same {string}")
	public void user_should_verify_selected_hotel_name_endswith_same(String roomType) {
	    pom.getSelectHotelPage().verifyHotelNameEndswithRoomType(roomType);
	}

	
	@When("User should click the Search without enter any field")
	public void user_should_click_the_search_without_enter_any_field() {
	   pom.getExploreHotelPage().clickwithoutfield();
	}
	@Then("User should verify all error messages after click search {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_all_error_messages_after_click_search_and(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		
		Thread.sleep(5000);
		String txtstateerrormsg = pom.getExploreHotelPage().getTxtstateerrormsg();
		Assert.assertEquals("verify state error message",string,txtstateerrormsg);
		String txtcityerrormsg = pom.getExploreHotelPage().getTxtcityerrormsg();
		Assert.assertEquals("verify city error message",string2,txtcityerrormsg);
	 String txtchkinerrormsg = pom.getExploreHotelPage().getTxtchkinerrormsg();
		Assert.assertEquals("verify chkindate error message",string3,txtchkinerrormsg);
		 String txtchkouterrormsg = pom.getExploreHotelPage().getTxtchkouterrormsg();
		Assert.assertEquals("verify chkoutdate error message",string4,txtchkouterrormsg);
		 String txtnoroomerrormsg = pom.getExploreHotelPage().getTxtnoroomerrormsg();
		Assert.assertEquals("verify noofrooms error message",string5,txtnoroomerrormsg);
		 String txtnoadulterrormsg = pom.getExploreHotelPage().getTxtnoadulterrormsg();
		Assert.assertEquals("verify noofadults error message",string6,txtnoadulterrormsg);
	}






}
