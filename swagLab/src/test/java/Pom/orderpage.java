package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderpage extends Basepage{
	
	public orderpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		

	@FindBy(id="first-name")
	private WebElement firstname;
	@FindBy(id="last-name")
	private WebElement lastname;
	@FindBy(id="postal-code")
	private WebElement zipcode;
	@FindBy(id="continue")
	private WebElement continuebtn;
	@FindBy(id="finish")
	private WebElement finishbtn;
	
	@FindBy(id="checkout_complete_container")
	private WebElement checkoutcomplete;
	
	public WebElement getfirstname() {
		return firstname;  }
	public WebElement getlastname() {
		return lastname;  }
	public WebElement getzipcode() {
		return zipcode;  }
	public WebElement getcontinuebtn() {
		return continuebtn;  }
	public WebElement getfinishbtn() {
		return finishbtn;  }
	
	public String getcheckout() {
		String text = checkoutcomplete.getText();
		return text;
	}
	
	public String provideAddressOnOrderPage() {
		firstname.sendKeys("Diwaker");
		lastname.sendKeys("D");
		zipcode.sendKeys("603108");
		continuebtn.click();
		finishbtn.click();
		String verifyMsg = checkoutcomplete.getText();
		return verifyMsg;
	}
	
	
	}

