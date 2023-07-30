package com.omrbranch.page;


import java.awt.AWTException;
import java.awt.KeyEventPostProcessor;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.baseclass;

public class LoginPage extends baseclass {
	public  LoginPage(){
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
private WebElement txtusername;

@FindBy(id="pass")
private WebElement txtpassword;

@FindBy(xpath="//button[@value='login']")
private WebElement btnlogin;

@FindBy(id="errorMessage")
private WebElement LoginErrorMsg;

public String getLoginErrorMsg() {
	String text = LoginErrorMsg.getText();
	return text;
}
public WebElement getTxtusername() {
	return txtusername;
}
public WebElement getTxtpassword() {
	return txtpassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}

public void login(String userName,String password) {
	elementSendkeys(getTxtusername(),userName);
	elementSendkeys(getTxtpassword(),password);
	elementClick(getBtnlogin());
}
public void enterKey(String userName,String password) throws AWTException {
	elementSendkeys(getTxtusername(),userName);
	elementSendkeysEnter(getTxtpassword(), password);
	
}


}


