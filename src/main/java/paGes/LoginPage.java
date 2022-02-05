package paGes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBAse{
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css = "input.input.p-2")
	WebElement accountno;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div/div/div[2]/form/div[2]/input")
	WebElement emailtxtbox;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div/div/div[2]/form/div[3]/input")
	WebElement paswrdtxtbox;
	
	@FindBy (tagName  = "button")
	WebElement lgnbtn;
	
	public void userlogin(String accountNo,String email, String Password) {
		
		setTextElementText(accountno, accountNo);
		setTextElementText(emailtxtbox, email);
		setTextElementText(paswrdtxtbox, Password);
		clicbutton(lgnbtn);	
	}
	



}
