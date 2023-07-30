package com.omrbranch.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.baseclass;

public class BookingConfirmPage extends baseclass{
	public  BookingConfirmPage(){
		PageFactory.initElements(driver, this);
	}
	public static String orderId;
@FindBy(xpath="//h2[text()=' Booking is Confirmed ']")
private WebElement txtbookingsucmsg;
@FindBy(xpath="//h2//strong")
private WebElement txtorderid;
 
public WebElement getTxtbookingsucmsg() {
	return txtbookingsucmsg;
}
public WebElement getTxtorderid() {
	return txtorderid;
}
public void getTextbookingsucmsg() {
	elementGetText(getTxtbookingsucmsg());
}
public void getSelectHotelSuccessTxtMsg() {
	elementGetText(getTxtbookingsucmsg());
}

public String getOrderId() {
	
	return orderId=elementGetText(getTxtorderid());
}

}
