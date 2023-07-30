
package com.omrbranch.page;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.baseclass;

import io.cucumber.datatable.DataTable;

public class BookHotelPage extends baseclass{
	public  BookHotelPage(){
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//h2[@class='px-3 py-2']")
private WebElement txtbookhotelsuccmsg;
@FindBy(xpath="//input[@id='own']")
private WebElement btnmyself;
@FindBy(xpath="//select[@id='user_title']")
private WebElement txtsalutation;
@FindBy(id="first_name")
private WebElement txtfirstname;
@FindBy(xpath="//input[@placeholder='Last Name *']")
private WebElement txtlastName;
@FindBy(xpath="//input[@id='user_phone']")
private WebElement txtphone;
@FindBy(xpath="//input[@placeholder='Email *']")
private WebElement txtemail;
@FindBy(xpath="//input[@id='gst']")
private WebElement btngst;
@FindBy(xpath="//input[@placeholder='Enter Registration No. *']")
private WebElement txtregno;
@FindBy(xpath="//input[@id='company_name']")
private WebElement txtcompanyname;
@FindBy(xpath="//input[@placeholder='Enter Company Address *']")
private WebElement txtcompanyaddress;
@FindBy(id="step1next")
private WebElement btnnext;
@FindBy(id="other_request")
private WebElement txtsplrequest;
@FindBy(id="step2next")
private WebElement btnsecondnext;
@FindBy(xpath="//h5[text()='Credit/Debit/ATM Card']")
private WebElement btnpayment;
@FindBy(id="payment_type")
private WebElement btncardtype;
@FindBy(id="card_type")
private WebElement btncard;
@FindBy(id="card_no")
private WebElement txtcardno;
@FindBy(id="card_name")
private WebElement txtcardname;
@FindBy(id="card_month")
private WebElement txtcardmnth;
@FindBy(id="card_year")
private WebElement txtcardyear;
@FindBy(id="cvv")
private WebElement txtcvv;
@FindBy(id="submitBtn")
private WebElement btnsubmit;
@FindBy(id="invalid-payment_type")
private WebElement txterrorcardtype;
@FindBy(id="invalid-card_type")
private WebElement txterrorcard;
@FindBy(id="invalid-card_no")
private WebElement txterrorcardno;
@FindBy(id="invalid-card_name")
private WebElement txterrorcardname;
@FindBy(id="invalid-card_month")
private WebElement txterrorcardmonth;
@FindBy(id="invalid-cvv")
private WebElement txterrorinvalidcvv;


public WebElement getBtncard() {
	return btncard;
}
public String getTxtbookhotelsuccmsg() {
	String text = txtbookhotelsuccmsg.getText();
	return text;
}
public WebElement getBtnmyself() {
	return btnmyself;
}
public WebElement getTxtsalutation() {
	return txtsalutation;
}
public WebElement getTxtfirstname() {
	return txtfirstname;
}
public WebElement getTxtlastName() {
	return txtlastName;
}
public WebElement getTxtphone() {
	return txtphone;
}
public WebElement getTxtemail() {
	return txtemail;
}
public WebElement getBtngst() {
	return btngst;
}
public WebElement getTxtregno() {
	return txtregno;
}
public WebElement getTxtcompanyname() {
	return txtcompanyname;
}
public WebElement getTxtcompanyaddress() {
	return txtcompanyaddress;
}
public WebElement getBtnnext() {
	return btnnext;
}
public WebElement getTxtsplrequest() {
	return txtsplrequest;
}
public WebElement getBtnsecondnext() {
	return btnsecondnext;
}
public WebElement getBtnpayment() {
	return btnpayment;
}
public WebElement getBtncardtype() {
	return btncardtype;
}
public WebElement getTxtcardno() {
	return txtcardno;
}
public WebElement getTxtcardname() {
	return txtcardname;
}
public WebElement getTxtcardmnth() {
	return txtcardmnth;
}
public WebElement getTxtcardyear() {
	return txtcardyear;
}
public WebElement getTxtcvv() {
	return txtcvv;
}
public WebElement getBtnsubmit() {
	return btnsubmit;
}
public String getTxterrorcardtype() {
	 String text = txterrorcardtype.getText();
	return text;
}
public String getTxterrorcard() {
	 String text = txterrorcard.getText();
	return text;
}
public String getTxterrorcardno() {
	String text = txterrorcardno.getText();
	return text;
}
public String getTxterrorcardname() {
	String text = txterrorcardname.getText();
	return text;
}
public String getTxterrorcardmonth() {
	 String text = txterrorcardmonth.getText();
	return text;
}
public String getTxterrorinvalidcvv() {
	 String text = txterrorinvalidcvv.getText();
	return text;
}


public void addGuestDetails(String salutation,String firstName,String lastName,String phoneno,String email) throws InterruptedException{
	elementClick( getBtnmyself());
	elementSendkeys(getTxtsalutation(),salutation);
	Thread.sleep(5000);
	elementSendkeys(getTxtfirstname(), firstName);
	elementSendkeys(getTxtlastName(), lastName);
	elementSendkeys(getTxtphone(),phoneno);
	elementSendkeys(getTxtemail(), email);

}
public void addGstDetails(String enterRegistrationNo,String enterCompanyName,String enterCompanyAddress) {
	elementClick(getBtngst());
	elementSendkeys(getTxtregno(),enterRegistrationNo);
	elementSendkeys(getTxtcompanyname(),enterCompanyName );
	elementSendkeys(getTxtcompanyaddress(), enterCompanyAddress);
}
public void addSplReq(String specialRequest) {
	elementSendkeys(getTxtsplrequest(),specialRequest);
	elementClick(getBtnsecondnext());
}
public void addPaymentDetails(String selectCardType,DataTable dataTable) throws InterruptedException {
	elementClick(getBtnpayment());
	String s="Debit Card";
	
	selectByVisibleText(getBtncardtype(), selectCardType);
	Thread.sleep(3000);
	switch (selectCardType) {
	case "Debit Card":
		List<Map<String,String>> payment=dataTable.asMaps();
		  Map<String, String> map = payment.get(0);
		  String s1 = map.get("selectCard");
		  String s2 = map.get("enterCardNumber");
		  String s3 = map.get("enterYourNameOnCard");
		  String s4 = map.get("selectMonth");
		  String s5 = map.get("selectYear");
		  String s6 = map.get("enterCardCVV");
		  Thread.sleep(3000);
			selectByVisibleText(getBtncard(),s1);
			Thread.sleep(3000);
			elementSendkeys(getTxtcardno(),s2);
			elementSendkeys(getTxtcardname(),s3);
			selectByVisibleText(getTxtcardmnth(),s4);
			selectByVisibleText(getTxtcardyear(),s5);
			elementSendkeys(getTxtcvv(),s6);
		break;
	case "Credit Card":
		List<Map<String,String>> payment1=dataTable.asMaps();
		  Map<String, String> map1 = payment1.get(4);
		  String c1 = map1.get("selectCard");
		  String c2 = map1.get("enterCardNumber");
		  String c3 = map1.get("enterYourNameOnCard");
		  String c4 = map1.get("selectMonth");
		  String c5 = map1.get("selectYear");
		  String c6 = map1.get("enterCardCVV");
		
			selectByVisibleText(getBtncard(),c1);
			elementSendkeys(getTxtcardno(),c2);
			elementSendkeys(getTxtcardname(),c3);
			selectByVisibleText(getTxtcardmnth(),c4);
			selectByVisibleText(getTxtcardyear(),c5);
			elementSendkeys(getTxtcvv(),c6);
		break;
	default:
		break;
	}

}

public void clickNext() {
	elementClick(getBtnnext());
}
public void clicksecondNext() {
	elementClick(getBtnsecondnext());
}
public void clickPayment() {
	elementClick(getBtnsubmit());
}







}

