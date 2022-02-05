package paGes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBAse {

	public ProductPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//button[contains(text(),'Create product')]")
	WebElement prdcreate;
	
	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div[1]/div[2]/input")
	WebElement prdname;
	
	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div[2]/div[2]/div/div[1]/div")
	WebElement catchoose;
	
	@FindBy(partialLinkText = "new ca")
	WebElement catchosen;
	
	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div[6]/div[2]/input")
	WebElement price;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div/div[3]/div/button/span")
	WebElement savebtn;

	
	
	public void productcreation(String Productname, String Price) throws InterruptedException {
	Thread.sleep(3000);
		clicbutton(prdcreate);
		setTextElementText(prdname, Productname);
		clicbutton(catchoose);
		Thread.sleep(3000);
		clicbutton(catchosen);
		Thread.sleep(3000);
		setTextElementText(price, Price);
		clicbutton(savebtn);
		
		
	}
	
	

}
