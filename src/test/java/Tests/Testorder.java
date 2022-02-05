package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import paGes.HomePage;
import paGes.OrderCreation;

public class Testorder extends TestBase{
	HomePage homeobject;
	OrderCreation orderObject;
	
	@Test(priority =6)
	public void order () throws InterruptedException {
		orderObject = new OrderCreation(driver);
		homeobject = new HomePage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		homeobject.orderIcon();
		orderObject.createorderbeforepayment();
		js.executeScript("scrollBy(0,3000)");
		orderObject.createorderafterpayment();
	}

}
