package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUp {
	
	protected static WebDriver driver;
	

	public void SetUpTest() {
		//System.setProperty("webdriver.gecko.driver","/home/daiane.macedo/workspace2/cucumber/resources/seleniumDrivers/geckodriver");
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void tearDown(){
		driver.close();
	}
	
	
}
