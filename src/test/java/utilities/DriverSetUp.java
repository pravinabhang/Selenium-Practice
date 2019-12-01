package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetUp {
	
	public static WebDriver driver;
	public void FireFox(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pravin\\workspace\\SpiceJetTest\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		timeOutSettings();
	}
	public void Chrome(){
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-extensions");
		opt.addArguments("--start-maximized");
		driver=new ChromeDriver(opt);
		//driver.manage().window().maximize();
		timeOutSettings();
	}
	static void timeOutSettings(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().deleteAllCookies();
	}

}
