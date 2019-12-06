package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pages.SpiceJetHomePage;

public class BaseClass{

	protected WebDriver driver;
	protected SpiceJetHomePage sp;
	DriverSetUp ds=new DriverSetUp();
	@BeforeClass
	@Parameters({"browser","URL"})
	public void setUP(String browser,String URL){
		driver=ds.getDriver(browser);
		if(browser.equals("IE")){
			driver.navigate().to(URL);
		}else
		driver.get(URL);
		sp=new SpiceJetHomePage(driver);
	}	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
