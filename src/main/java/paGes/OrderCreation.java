package paGes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderCreation extends PageBAse {

	public OrderCreation(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[@id=\"table_header\"]/div/div/div/div/div/button[2]")
	WebElement ordercreationbtn;
	
	@FindBy(xpath="//*[@id=\"decorated-modal-body\"]/div/div[2]/div/div[1]/div")
	WebElement chosebranch;
	
	@FindBy(xpath="//*[@id=\"decorated-modal-body\"]/div/div[2]/div/div[2]/div/div/a[4]")
	WebElement branchchosen;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div/div/div[3]/div/button")
	WebElement nextbtn;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[9]/div")
	WebElement catadding;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/span")
	WebElement productadding;
	
	@FindBy(xpath="//body/div[@id='wrapper']/main[@id='main']/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]")
	WebElement addmod;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[3]/div/div/div[3]/div/button/span")
	WebElement confirmadd;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/button/span[2]")
	WebElement totalpress;
	
	@FindBy(xpath="//*[@id=\"decorated-modal-body\"]/div/div[2]/div[4]/div")
	WebElement paymentmethod;
	
	@FindBy(xpath="//*[@id=\"decorated-modal-body\"]/div/div[3]/div[2]/div[2]/div")
	WebElement amount;
	
	@FindBy(css="body.overflow-hidden:nth-child(2) div.wrapper-ltr:nth-child(1) div.px-2 div.z-50.fixed.inset-0.overflow-y-scroll.modal-mask:nth-child(3) div.modal-container.mx-auto.max-w-lg div.bg-white.rounded-lg.my-5.shadow-lg div.px-5.py-4.border-t.flex.items-center.justify-end:nth-child(3) div.ml-1 button.btn.btn-primary.ml-2 > span:nth-child(1)")
	WebElement pay;
	
	@FindBy(css="body.overflow-hidden:nth-child(2) div.wrapper-ltr:nth-child(1) div.px-2 div.z-50.fixed.inset-0.overflow-y-scroll.modal-mask:nth-child(4) div.modal-container.mx-auto.max-w-lg div.bg-white.rounded-lg.my-5.shadow-lg div.px-5.py-4.border-t.flex.items-center.justify-end:nth-child(3) > button.btn.btn-white.ml-2")
	WebElement close;
	
	

	public void createorderbeforepayment () throws InterruptedException {
		
		Thread.sleep(3000);
		clicbutton(ordercreationbtn);
		Thread.sleep(3000);
		clicbutton(chosebranch);
		Thread.sleep(3000);
		clicbutton(branchchosen);
		Thread.sleep(3000);
		clicbutton(nextbtn);
		Thread.sleep(3000);
		clicbutton(catadding);
		Thread.sleep(3000);
		clicbutton(productadding);
		Thread.sleep(4000);
		clicbutton(addmod);
		Thread.sleep(3000);
		clicbutton(confirmadd);
		Thread.sleep(3000);
		clicbutton(totalpress);
		Thread.sleep(3000);
		clicbutton(paymentmethod);
		
	}
	
	public void createorderafterpayment() throws InterruptedException {
		
		Thread.sleep(3000);
		clicbutton(amount);
		Thread.sleep(3000);
		clicbutton(pay);
		Thread.sleep(3000);
		clicbutton(close);
	
		
	}
}
