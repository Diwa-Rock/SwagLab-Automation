package com.stepdefinition;

import org.junit.Assert;

import com.Baseclass.baseclass;
import com.omrbranch.pageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class TC3_SelectHotelStep extends baseclass {
	PageObjectManager pom=new PageObjectManager();

	@When("User select the first hotel name and save the hotel name,price")
	public void user_select_the_first_hotel_name_and_save_the_hotel_name_price() {
	    pom.getSelectHotelPage().selectHotelName();
	}
	@When("User accept the popup")
	public void user_accept_the_popup() {
	  pom.getSelectHotelPage().acceptAlert();
	}
	@Then("User should verify  after hotel select success message {string}")
	public void user_should_verify_after_hotel_select_success_message(String string) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue("verify  after hotel select success message",pom.getBookHotelPage().getTxtbookhotelsuccmsg().contains(string));
	}
    @When("User dismiss the popup")
	public void user_dismiss_the_popup() throws InterruptedException {
	   pom.getSelectHotelPage().dismissAlert();
	   Thread.sleep(5000);
	}
	

    @When("User select the name ascending radion button in the sort by filter")
    public void user_select_the_name_ascending_radion_button_in_the_sort_by_filter() {
     pom.getSelectHotelPage().selectHotelByAscOrder();
    }
    @Then("User should verify every hotel names are listed by ascending order")
    public void user_should_verify_every_hotel_names_are_listed_by_ascending_order() {
      pom.getSelectHotelPage().getsortHotelByAscOrdermsg();
    }

    @When("User Unselect the {string}")
    public void user_unselect_the(String string) {
       pom.getSelectHotelPage().getBtnUnselectRoomType();
    }
    @Then("User should verify order of rooms before unselect and after unselect")
    public void user_should_verify_order_of_rooms_before_unselect_and_after_unselect() {
       pom.getSelectHotelPage().verifyUnselecRoomCount();
    }







}
