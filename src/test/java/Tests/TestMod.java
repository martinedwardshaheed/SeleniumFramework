package Tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import paGes.Categorypage;
import paGes.HomePage;
import paGes.LoginPage;
import paGes.ModifierPage;
import paGes.OrderCreation;
import paGes.ProductPage;
import paGes.addmodifiertoprd;

public class TestMod extends TestBase {

	LoginPage lognObject;
	HomePage homeobject;
	ModifierPage modObject;
	ProductPage prdObject;
	addmodifiertoprd modtoprdObject;
	OrderCreation orderObject;

	Categorypage catObject;
	@Test(priority = 1,enabled = false)
	public void usercanregistersuccesully() throws InterruptedException {
		lognObject = new LoginPage(driver);
		homeobject = new HomePage(driver);
		modObject = new ModifierPage(driver);



		lognObject.userlogin("397777", "m.edwared@foodics.com", "Godislove2381995");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		


		/*		homeobject.clkonaccicon();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		catObject = new Categorypage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homeobject.catIcon();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		catObject.createcatbtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		catObject.createcat("autocat");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	    homeobject.Modicon();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		


		modObject.modcreate("mod1","option-test", "20");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		


//		optionObject.modoptioncreationbeforeassigningmod("option1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		

//		optionObject.modoptionafterassigningmod("10");



		//modObject.explicitlywait();*/











	}
	@Test (priority = 2,enabled = false)
	public void catcreation() throws InterruptedException {

		lognObject = new LoginPage(driver);
		homeobject = new HomePage(driver);
		modObject = new ModifierPage(driver);



		homeobject.clkonaccicon();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		catObject = new Categorypage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homeobject.catIcon();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		catObject.createcatbtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		catObject.createcat("autocat");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));



	}
	@Test (priority = 3)
	public void aftercat() throws InterruptedException {
		lognObject = new LoginPage(driver);
		homeobject = new HomePage(driver);
		modObject = new ModifierPage(driver);




		homeobject.Modicon();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		


		modObject.modcreate("mod1","option-test", "20");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		


		//		optionObject.modoptioncreationbeforeassigningmod("option1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		

		//		optionObject.modoptionafterassigningmod("10");





	}

	@Test (priority =4,enabled = false)
	public void productCreation() throws InterruptedException {
		prdObject = new ProductPage(driver);
		homeobject = new HomePage(driver);

		homeobject.prdicon();
		prdObject.productcreation("auto-product", "100");



	}
	@Test(priority =5,enabled = false)
	public void addmodtoprd() throws InterruptedException {
		modtoprdObject = new addmodifiertoprd(driver);
		modtoprdObject.assignmodinprdbfscroll();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,3000)");
		modtoprdObject.assignmodinprdafscroll();
	}
	@Test(priority =6,enabled = false)
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
