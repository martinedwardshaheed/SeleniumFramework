package paGes;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModifierPage extends PageBAse {

	public ModifierPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (xpath = "//*[@id=\"table_header\"]/div/div/div/div/div/div/button")
	WebElement modbtn;
		
	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div[1]/div[2]/input")
	WebElement modname;

	@FindBy (xpath = "//*[@id=\"table_header\"]/div/div/div/div/div/div/button")
	WebElement modoptionbtn;
	
	@FindBy (xpath  = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[6]/a[1]")
	WebElement modoptionicon;
	
	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div[1]/div[2]/input")
	WebElement modoptionName;
	
	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div[2]/div[2]/div/div[1]/div")
	WebElement modselect;
	

	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div[2]/div[2]/div/div[2]/div/div/a[2]")
	WebElement selectonemod;
	
	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div[4]/div[2]/input")
	WebElement price;
	
	@FindBy (xpath = "//*[@id=\"main\"]/div/div[2]/div/div/div[3]/div/button")
	WebElement savebtn;
		
		
		
		public  void modcreate (String Modname, String Modname2, String Modprice ) throws InterruptedException {
			clicbutton(modbtn);
			setTextElementText(modname, Modname);
			Thread.sleep(4000);

			clicbutton(savebtn);
			Thread.sleep(3000);
			clicbutton(modoptionicon);
			
			
			clicbutton(modoptionbtn);
			setTextElementText(modoptionName, Modname2);
			clicbutton(modselect);
			
			
			clicbutton(selectonemod);
			Thread.sleep(5000);

			
			setTextElementText(price, Modprice);
			clicbutton(savebtn);
		


			
			
		}

		
		



}
