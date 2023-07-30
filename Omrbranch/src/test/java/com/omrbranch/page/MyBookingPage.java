package com.omrbranch.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.baseclass;

public class MyBookingPage extends baseclass {
	public  MyBookingPage(){
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@data-testid='username']")
private WebElement btnusername;
@FindBy(xpath="//a[text()='My Account']")
private WebElement btnmyaccount;
@FindBy(xpath="//div//h4")
private WebElement txtmybookingsucmsg;
@FindBy(xpath="//input[@name='search']")
private WebElement txtsearchorderid;
@FindBy(xpath="(//div[@class='room-code'])[1]")
private WebElement txtsaveorderId;
@FindBy(xpath="(//a//h5)[1]")
private WebElement txthotelname;
@FindBy(xpath="(//strong[@class='total-prize'])[1]")
private WebElement txthotelprice;
@FindBy(xpath="(//button[@class='edit btn filter_btn'])[1]")
private WebElement btnedit;
@FindBy(xpath="//input[@name='check_in']")
private WebElement txtmodifycheckindate;
@FindBy(xpath="//button[text()='Confirm']")
private WebElement btnmodifyconfirm;
@FindBy(xpath="//li[@class='alertMsg']")
private WebElement txtbookingupdatesuccesmsg;
@FindBy(xpath="(//a[text()='Cancel'])[1]")
private WebElement btncancelbooking;
@FindBy(xpath="//li[@class='alertMsg']")
private WebElement txtbookingcancelmsg;


public WebElement getTxtmybookingsucmsg() {
	return txtmybookingsucmsg;
}
public static String getHotelName() {
	return HotelName;
}
public WebElement getBtnusername() {
	return btnusername;
}
public WebElement getBtnmyaccount() {
	return btnmyaccount;
}
public WebElement getTxtsearchorderid() {
	return txtsearchorderid;
}
public WebElement getTxtsaveorderId() {
	return txtsaveorderId;
}
public WebElement getTxthotelname() {
	return txthotelname;
}
public WebElement getTxthotelprice() {
	return txthotelprice;
}
public WebElement getBtnedit() {
	return btnedit;
}
public WebElement getTxtmodifycheckindate() {
	return txtmodifycheckindate;
}
public WebElement getBtnmodifyconfirm() {
	return btnmodifyconfirm;
}
public WebElement getTxtbookingupdatesuccesmsg() {
	return txtbookingupdatesuccesmsg;
}
public WebElement getBtncancelbooking() {
	return btncancelbooking;
}
public WebElement getTxtbookingcancelmsg() {
	return txtbookingcancelmsg;
}

public void navigateMyBookingPage() {
	elementClick(getBtnusername());
	elementClick(getBtnmyaccount());
}
public void getMyBookingSuccessTxtMsg() {
	elementGetText(getTxtmybookingsucmsg());
}
public static String HotelName;
public void getHotelNameTxtMsg() {
	HotelName=(elementGetText(getTxthotelname()));
}
public static String orderId;
public void getOrderidTxtMsg() {
	orderId=elementGetText(getTxtsaveorderId());
}
public void GetHotelPriceTxtMsg() {
	elementGetText(getTxthotelprice());
}
public void searchOrderId() {
	elementSendkeys(getTxtsearchorderid(),orderId);
}
public void changeChkInDate(String editCheckinDate) {
	elementClick(getBtnedit());
	elementSendkeys(getTxtmodifycheckindate(), editCheckinDate);
	elementClick(getBtnmodifyconfirm());
}
public void getChangeBookSuccessMsg() {
	elementGetText(getTxtbookingupdatesuccesmsg());
}
public void cancelOrderId() {
	elementGetText(getBtncancelbooking());
}
public void getCancelSuccessTxtMsg() {
	elementGetText(getTxtbookingcancelmsg());
}

}
