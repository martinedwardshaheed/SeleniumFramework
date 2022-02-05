package Tests;

import java.time.Duration;

import org.testng.annotations.Test;

import paGes.Categorypage;
import paGes.HomePage;
import paGes.LoginPage;

public class Testcat extends TestBase {
	Categorypage catObject;
	HomePage homeobject;
	LoginPage lognObject;
	
	@Test (priority = 2)
	public void catcreation() throws InterruptedException {

		lognObject = new LoginPage(driver);
		homeobject = new HomePage(driver);
		//modObject = new ModifierPage(driver);



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


}
