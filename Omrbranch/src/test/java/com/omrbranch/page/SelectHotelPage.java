package com.omrbranch.page;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.baseclass;

public class SelectHotelPage extends baseclass {
	public  SelectHotelPage(){
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//h5[text()='Select Hotel']")
private WebElement txtselectsuccessmsg;
@FindBy(xpath="//a[text()='Standard/Deluxe/Suite/Luxury/Studio']")
private WebElement txtheaderroomtype;
@FindBy(xpath="(//div[@class='col-md-5 hotel-suites']//h5)[1]")
private WebElement txtHotel;
@FindBy(xpath="(//strong[@class='total-prize'])[1]")
private WebElement txtprice;
@FindBy(xpath="(//a[@class='btn filter_btn'])[1]")
private WebElement btnclick;
@FindBy(xpath="//label[@for='value_nasc']")
private WebElement btnAscorder;
@FindBy(xpath="//label[@for='Suite']")
private WebElement btnUnselectRoomType;



public WebElement getBtnUnselectRoomType() {
	return btnUnselectRoomType;
}

public static String getHotelName() {
	return HotelName;
}

public static String getHotelPrice() {
	return HotelPrice;
}

public String getTxtselectsuccessmsg() {
	String text = txtselectsuccessmsg.getText();
	return text;
}

public String getTxtheaderroomtype() {
	String text1 = txtheaderroomtype.getText();
	return text1;
}

public WebElement getBtnAscorder() {
	return btnAscorder;
}
public WebElement getTxtHotel() {
	return txtHotel;
}
public WebElement getTxtprice() {
	return txtprice;
}
public WebElement getBtnclick() {
	return btnclick;
}
public static String HotelName;
public static String HotelPrice;
public  void selectHotelName() {
	
    HotelName=elementGetText(getTxtHotel());
   
    HotelPrice=elementGetText(getTxtprice());
    elementClick(getBtnclick());;
}
public void acceptAlert() {
	driver.switchTo().alert().accept();
}
public void dismissAlert() {
	driver.switchTo().alert().dismiss();
}
public void selectHotelByAscOrder() {
	elementClick(getBtnAscorder());
}
public Boolean getsortHotelByAscOrdermsg() {
	
	List<String> actList=new ArrayList<String>();
	List<WebElement> hnames = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']//h5"));
	for (int i = 0; i < hnames.size(); i++) {
		String listnames = hnames.get(i).getText();
		actList.add(listnames);
	}
	List<String> expList=new ArrayList<String>();
	expList.addAll(actList);
	Collections.sort(expList);
	boolean equals = expList.equals(actList);
		return equals;
	}
public void verifyHotelNameEndswithRoomType(String roomType) {
	List<Boolean> result=new ArrayList<Boolean>();
	List<WebElement> hn = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']//h5"));
	
	for (int i = 0; i < hn.size(); i++) {
		String l1 = hn.get(i).getText();
		System.out.println(l1);
		boolean endsWith = l1.endsWith(roomType);
			result.add(endsWith);
		}
	boolean b = result.contains(false);
	if(b==true) {
		System.out.println("testcase are failed");
	}else {
		System.out.println("testcase are passed");
	}}
public void unselectRoomType() {
	elementClick(getBtnUnselectRoomType());
}
public Boolean verifyUnselecRoomCount() {
   Boolean res=false;
	List<WebElement> beforUnselect = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']//h5"));
	
    int l =beforUnselect.size();
    
     driver.findElement(By.xpath("//label[@for='Luxury']")).click();
  
     List<WebElement> afterUnselect = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']"));
     int l1 = afterUnselect.size();
   
    if (l!=l1) {
		res=true;
	} 
  return res;
	}
}

























