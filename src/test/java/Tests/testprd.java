package Tests;

import org.testng.annotations.Test;

import paGes.HomePage;
import paGes.ProductPage;

public class testprd extends TestBase {
	HomePage homeobject;
	ProductPage prdObject;
	
	@Test (priority =4)
	public void productCreation() throws InterruptedException {
		prdObject = new ProductPage(driver);
		homeobject = new HomePage(driver);

		homeobject.prdicon();
		prdObject.productcreation("auto-product", "100");



	}

}
