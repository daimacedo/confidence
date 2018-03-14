package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
	
	protected WebDriver driver;
	
	public SetUp() {
		System.setProperty("webdriver.gecko.driver","/home/daiane.macedo/workspace2/cucumber/resources/seleniumDrivers/geckodriver");
		driver = new FirefoxDriver();
	}
	
//	public WebDriver getDriver() {
//		return driver;
//	}
	
	public void SetUpTest(String url) {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

	}

	public void TearDown() {
		driver.close();
	}

}
