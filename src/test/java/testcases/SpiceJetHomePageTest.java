package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.SpiceJetHomePage;
import utilities.DriverSetUp;

public class SpiceJetHomePageTest extends DriverSetUp{
	
	@BeforeClass
	@Parameters("browser")
	public void setUP(String browser){
		if(browser.equals("firefox"))
			super.FireFox();
		else
			super.Chrome();
		driver.get("https://www.spicejet.com/");
	}	
	@Test
	public void homePageTest(){
		System.out.println("Home Page Loding...");
		SpiceJetHomePage sp=new SpiceJetHomePage(driver);
		System.out.println(sp.getPageTitle());
		String expTitle="SpiceJet - Flight Booking for Domestic and "
				+ "International, Cheap Air Tickets";
		Assert.assertEquals(sp.getPageTitle(), expTitle);
	}

}