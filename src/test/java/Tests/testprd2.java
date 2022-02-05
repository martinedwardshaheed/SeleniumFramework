package Tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import paGes.HomePage;
import paGes.ProductPage;

public class testprd2 extends TestBase {
	HomePage homeobject;
	ProductPage prdObject;
	
	Faker fakedata = new Faker();
	String prdname = fakedata.name().name();
	String passwrd = fakedata.number().digits(2).toString();
	
	@Test (priority =4)
	public void productCreation() throws InterruptedException {
		prdObject = new ProductPage(driver);
		homeobject = new HomePage(driver);

		homeobject.prdicon();
		prdObject.productcreation(prdname,passwrd);
		System.out.println("prd-name eq: "+ prdname + " "+ "price: " +passwrd + " ");



	}

}
