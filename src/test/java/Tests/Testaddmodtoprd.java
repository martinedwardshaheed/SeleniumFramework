package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import paGes.addmodifiertoprd;

public class Testaddmodtoprd extends TestBase {
	addmodifiertoprd modtoprdObject;
	
	@Test(priority =5)
	public void addmodtoprd() throws InterruptedException {
		modtoprdObject = new addmodifiertoprd(driver);
		modtoprdObject.assignmodinprdbfscroll();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,3000)");
		modtoprdObject.assignmodinprdafscroll();
	}

}
