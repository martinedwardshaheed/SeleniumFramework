package Tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import paGes.LoginPage;

public class TestBase {
	public static WebDriver driver;
	LoginPage lognObject;

	@BeforeSuite
	public void StartDriver() {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.navigate().to("https://console.foodics.dev/");
		lognObject = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		lognObject.userlogin("397777", "m.edwared@foodics.com", "Martin1995");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@AfterSuite
	public void StopDriver() {
		
		driver.quit();
	} 
	
}
