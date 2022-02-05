package paGes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categorypage extends PageBAse{

	public Categorypage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	
	@FindBy(xpath  = "//button[contains(text(),'Create category')]")
	WebElement catbtn;

	@FindBy(css = "body.overflow-hidden:nth-child(2) div.wrapper-ltr:nth-child(1) div.z-50.fixed.inset-0.overflow-y-scroll.modal-mask div.modal-container.mx-auto.max-w-lg div.bg-white.rounded-lg.my-5.shadow-lg div.bg-gray-30.p-6.decorated-modal-body.overflow-y-scroll:nth-child(2) div.mb-6.flex.flex-wrap.items-center:nth-child(1) div.w-full > input.input.p-2")
	WebElement catname;
	
	@FindBy(css = "body.overflow-hidden:nth-child(2) div.wrapper-ltr:nth-child(1) div.z-50.fixed.inset-0.overflow-y-scroll.modal-mask div.modal-container.mx-auto.max-w-lg div.bg-white.rounded-lg.my-5.shadow-lg div.bg-gray-30.p-6.decorated-modal-body.overflow-y-scroll:nth-child(2) div.mb-6.flex.flex-wrap.items-center:nth-child(3) div.w-full > input.input.p-2")
	WebElement catref;
	@FindBy(xpath= "//*[@id=\"main\"]/div/div[2]/div/div/div[3]/div/button/span")
	WebElement savecat;
	
		
	public  void createcatbtn ( ) {
		clicbutton(catbtn);
		
		
	}
	public void createcat (String categoryname) throws InterruptedException {
		
		setTextElementText(catname, categoryname);
        Thread.sleep(5000);
		
		clicbutton(savecat);
	}
	
	


	
}
