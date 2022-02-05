package Tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import paGes.HomePage;
import paGes.ProductPage;

public class testprdwithDDtandExcel extends TestBase {
	HomePage homeobject;
	ProductPage prdObject;
	
	@DataProvider(name = "ExcelData")
	public Object[][] prdcreateData() throws IOException{
		//get data from excelreaderclass
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}
	
	@Test (priority =4,dataProvider = "ExcelData")
	public void productCreation(String prdname, String price) throws InterruptedException {
		prdObject = new ProductPage(driver);
		homeobject = new HomePage(driver);

		homeobject.prdicon();
		prdObject.productcreation(prdname, price);



	}

}
