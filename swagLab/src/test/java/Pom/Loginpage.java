package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basepage {
	
	public  Loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="user-name")
	private WebElement usernameField;
	
	@FindBy(name="password")
	private WebElement passwordField;
	
	@FindBy(name="login-button")
	private WebElement loginbutton;
	
	

	public WebElement getusername() {
		return usernameField;
	}
	public WebElement getpassword() {
		return passwordField;
	}
	public WebElement getloginbutton() {
		return loginbutton;
	}
	
	public void loginToTheUser(String username, String password) {
		if (!username.isEmpty() && !password.isEmpty()) {
			usernameField.sendKeys(username);
			passwordField.sendKeys(password);
			loginbutton.click();
		}else {
			throw new NullPointerException("Either useranme or password is null");
		}
	}
	
		
	}

