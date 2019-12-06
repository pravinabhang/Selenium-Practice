package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseClass;

public class SpiceJetHomePageTest extends BaseClass{
	
	@Test(priority=1)
	public void homePageTest(){
		System.out.println(sp.getPageTitle());
		String expTitle="SpiceJet - Flight Booking for Domestic and "
				+ "International, Cheap Air Tickets";
		Assert.assertEquals(sp.getPageTitle(), expTitle);
	}
	@Test(priority=3, groups="smoke")
	public void logoTest(){
		System.out.println("This is Logo Test! ");
	}
	
	@Test(priority=2)
	public void addOnsTest() throws InterruptedException{
		Assert.assertTrue(sp.getMealPage().isDisplayed());
	}

}