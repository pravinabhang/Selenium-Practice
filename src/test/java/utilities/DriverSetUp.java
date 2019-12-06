package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverSetUp {
	
	public static WebDriver driver;
	public WebDriver getDriver(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			timeOutSettings();
		}else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("disable-extensions");
			opt.addArguments("--start-maximized");
			driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			timeOutSettings();
		}else if(browser.equals("IE")){
			System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			timeOutSettings();
		}
		else{
			System.out.println("This Browser doesn't support!");
		}
		
		return driver;
		
	}
	
	static void timeOutSettings(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().deleteAllCookies();
	}

}
