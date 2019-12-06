package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceJetHomePage {
	
	WebDriver driver;
	@FindBy(xpath="//a[@class='spicejet_logo']")
	WebElement logo;
	
	@FindBy(xpath="//a[contains(text(),'Hot Meals')]")
	WebElement meals;
	
	@FindBy(xpath="//a[@id='highlight-addons']")
	WebElement addons;
	
	@FindBy(xpath="//span[contains(text(),'Booking')]")
	WebElement booking;
	
	public SpiceJetHomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle(){
		if(logo.isDisplayed())
		    return driver.getTitle();
		else
			return null;
	}
	
	public WebElement getMealPage() throws InterruptedException{
		Actions act=new Actions(driver);
		
		act.moveToElement(addons).build().perform();
		Thread.sleep(2000);
		act.moveToElement(meals).build().perform();
		Thread.sleep(2000);
		act.click(meals).build().perform();
		return booking;
	}
}
