package paGes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends PageBAse {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (partialLinkText  = "Menu")
	WebElement menuicon;
	
	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		

	
	@FindBy (partialLinkText  =  "Categori")
    WebElement categoryicon;
	
	@FindBy(xpath="//*[@id=\"sidebar-body\"]/ul/li[8]/ul/li[5]/a")
	WebElement modficon;
	
	@FindBy(partialLinkText = "Produc")
	WebElement prdicon;
	
	@FindBy(xpath = "//*[@id=\"sidebar-body\"]/ul/li[3]/a")
	WebElement ordericon;
	
	@FindBy(css = ".router-link-exact-active.router-link-active")
	WebElement comboicon;
	
	
	
	public void clkonaccicon() throws InterruptedException {
		Thread.sleep(2000);
		clicbutton(menuicon);
		
	}
	
	public void catIcon() throws InterruptedException {
		Thread.sleep(3000);

		clicbutton(categoryicon);
	}
	
	public void Modicon() throws InterruptedException {
		Thread.sleep(3000);
		clicbutton(modficon);
	}
	
	
public void prdicon() throws InterruptedException {
	Thread.sleep(4000);
	clicbutton(prdicon);
}

public void orderIcon() throws InterruptedException {
	Thread.sleep(4000);
	clicbutton(ordericon);
}

public void ComboIcon () throws InterruptedException {
	Thread.sleep(4000);
	clicbutton(comboicon);

}
	

}
