package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocartpage extends Basepage {

	public addtocartpage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
	

	
	@FindBy(xpath="//div[text()='Swag Labs']")
	private WebElement txtlogmsg;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addtocart;
	
	@FindBy(id="remove-sauce-labs-backpack")
	private WebElement remove;
	
	@FindBy(id="shopping_cart_container")
	private WebElement cartcontainer;

	@FindBy(id="checkout")
	private WebElement checkout;
	
	public String getTxtlogmsg() {
		String text = txtlogmsg.getText();
		return text;
	}
	public WebElement getaddTocart() {
		return addtocart;
	}
	public String getremove() {
		String text = remove.getText();
	return text;  }
	
	public WebElement getcartcontainer() {
		return cartcontainer;  }
	
	public WebElement getcheckout() {
		return checkout;
	}
	
	public String addToCart() {
		addtocart.click();
		String removeText = remove.getText();
		cartcontainer.click();
		checkout.click();
		return removeText;
    	
	}
}
