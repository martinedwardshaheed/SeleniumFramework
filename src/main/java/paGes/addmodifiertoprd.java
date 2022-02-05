package paGes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addmodifiertoprd extends PageBAse {

	public addmodifiertoprd(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath = "//*[@id=\"listing-table\"]/tbody/tr[1]/td[3]")
	WebElement prdadded;

	@FindBy(xpath = "//*[@id=\"main\"]/div/div/div[2]/div[3]/div[1]/div[2]/div/button")
	WebElement modadded;

	@FindBy(css = "body.overflow-hidden:nth-child(2) div.wrapper-ltr:nth-child(1) div.z-50.fixed.inset-0.overflow-y-scroll.modal-mask:nth-child(2) div.modal-container.mx-auto.max-w-lg div.bg-white.rounded-lg.my-5.shadow-lg div.bg-gray-30.p-6.decorated-modal-body.overflow-y-scroll:nth-child(2) div.mb-6.flex.flex-wrap.items-center div.w-full div.relative.font-normal div:nth-child(1) > div.input.p-2")
	WebElement modlist;

	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div/div[2]/div/div[2]/div/div/a[3]")
	WebElement selectoption;

	@FindBy(xpath = "//*[@id=\"decorated-modal-body\"]/div/div[1]")
	WebElement deselectoption;

	@FindBy(css = "body.overflow-hidden:nth-child(2) div.wrapper-ltr:nth-child(1) div.z-50.fixed.inset-0.overflow-y-scroll.modal-mask:nth-child(2) div.modal-container.mx-auto.max-w-lg div.bg-white.rounded-lg.my-5.shadow-lg div.px-5.py-4.border-t.flex.items-center.justify-end:nth-child(3) div.ml-1 button.btn.btn-primary.ml-2 > span:nth-child(1)")
	WebElement savebtn;



	public void assignmodinprdbfscroll () throws InterruptedException {

		Thread.sleep(3000);
		clicbutton(prdadded);
		Thread.sleep(3000);
	}


	public void assignmodinprdafscroll () throws InterruptedException {

		Thread.sleep(3000);
		clicbutton(modadded);
		Thread.sleep(3000);
		clicbutton(modlist);
		Thread.sleep(3000);
		clicbutton(selectoption);
		Thread.sleep(3000);
		clicbutton(deselectoption);
		clicbutton(savebtn);
	}
}











