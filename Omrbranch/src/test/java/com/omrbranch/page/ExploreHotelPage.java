package com.omrbranch.page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.baseclass;

public class ExploreHotelPage extends baseclass{
	public  ExploreHotelPage(){
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
private WebElement txtlogmsg;
@FindBy(id="state")
private WebElement ddnstate;
@FindBy(id="city")
private WebElement ddncity;
@FindBy(id="room_type")
private WebElement ddnroomtype;
@FindBy(xpath="//input[@name='check_in']")
private WebElement btncheckindate;
@FindBy(xpath="//a[text()='28']")
private WebElement btndate;
@FindBy(xpath="//input[@name='check_out']")
private WebElement btncheckoutdate;
@FindBy(xpath="//a[text()='30']")
private WebElement btnoutdate;
@FindBy(id="no_rooms")
private WebElement ddnnoofrooms;
@FindBy(id="no_adults")
private WebElement ddnnoofadults;
@FindBy(id="no_child")
private WebElement txtnoofchild;
@FindBy(xpath="//button[@class='btn filter_btn']")
private WebElement btnsearch;
@FindBy(xpath="//div[text()='Please select state']") 
private WebElement txtstateerrormsg;
@FindBy(xpath="//div[text()='Please select city']") 
private WebElement txtcityerrormsg;
@FindBy(xpath="//div[text()='Please select Check-in date']") 
private WebElement txtchkinerrormsg;
@FindBy(xpath="//div[text()='Please select Check-out date']") 
private WebElement txtchkouterrormsg;
@FindBy(xpath="//div[text()='Please select no. of rooms']") 
private WebElement txtnoroomerrormsg;
@FindBy(id="invalid-no_adults") 
private WebElement txtnoadulterrormsg;

public String getTxtlogmsg() {
	String text = txtlogmsg.getText();
	return text;
	
}
public WebElement getDdnstate() {
	return ddnstate;
}
public WebElement getDdncity() {
	return ddncity;
}
public WebElement getDdnroomtype() {
	return ddnroomtype;
}
public WebElement getBtncheckindate() {
	return btncheckindate;
}
public WebElement getBtndate() {
	return btndate;
}
public WebElement getBtncheckoutdate() {
	return btncheckoutdate;
}
public WebElement getBtnoutdate() {
	return btnoutdate;
}
public WebElement getDdnnoofrooms() {
	return ddnnoofrooms;
}
public WebElement getDdnnoofadults() {
	return ddnnoofadults;
}
public WebElement getTxtnoofchild() {
	return txtnoofchild;
}
public WebElement getBtnsearch() {
	return btnsearch;
}
public String getTxtstateerrormsg() throws InterruptedException {
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	 String text = txtstateerrormsg.getText();
	return text;
}

public String getTxtcityerrormsg() {

	 String text = txtcityerrormsg.getText();
	return text;
}
public String getTxtchkinerrormsg() {
	
	String text = txtchkinerrormsg.getText();
	return text;
}
public String getTxtchkouterrormsg() {
	 String text = txtchkouterrormsg.getText();
	return text;
}
public String getTxtnoroomerrormsg() {
	 String text = txtnoroomerrormsg.getText();
	return text;
}
public String getTxtnoadulterrormsg() {
	 String text = txtnoadulterrormsg.getText();
	return text;
}
public void SearchHotel(String stateName,String city,String roomType,String chkindate,String chkoutdate,String noOfRoom,String noOfAdults,String noOfChild) {
	selectByVisibleText(getDdnstate(), stateName);
	selectByVisibleText(getDdncity(), city);
	multipleroomtype(roomType);
	elementClick(getBtncheckindate());
	elementClick(getBtndate());
	elementClick(getBtncheckoutdate());
	elementClick(getBtnoutdate());
	selectByVisibleText(getDdnnoofrooms(), noOfRoom);
	selectByVisibleText(getDdnnoofadults(), noOfAdults);
	elementSendkeys(getTxtnoofchild(),noOfChild);
	implicityWait();
	driver.switchTo().frame("hotelsearch_iframe");
	elementClick(getBtnsearch());
}
public void multipleroomtype(String roomType) {
	
	String[] split = roomType.split("/");
	for (String eachRoomType : split) {
		selectByVisibleText(getDdnroomtype(),eachRoomType);
	}

	
}
public void clickwithoutfield() {
	driver.switchTo().frame("hotelsearch_iframe");
	elementClick(getBtnsearch());
}


	
}






