package paGes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBAse {

	protected WebDriver driver;

	//create constructor 
	
	public PageBAse (WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	protected static void clicbutton(WebElement button) {

		button.click();
	}
	
	protected static void setTextElementText(WebElement textElememnt, String value) {
		textElememnt.sendKeys(value);
		
	} 

}
