package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseStep implements BaseStepInterface{

	WebDriver driver;

	public void before() {
		System.setProperty("webdriver.gecko.driver","./seleniumDrivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void after() {
		driver.close();
	}
}
