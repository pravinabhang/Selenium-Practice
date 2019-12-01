package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceJetHomePage {
	
	WebDriver driver;
	@FindBy(xpath="//a[@class='spicejet_logo']")
	WebElement logo;
	
	public SpiceJetHomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle(){
		if(logo.isDisplayed())
		  return driver.getTitle();
		return null;
	}
}
