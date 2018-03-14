package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;import com.gargoylesoftware.htmlunit.html.DisabledElement;

public class SetUp {
	
	protected WebDriver driver;
	
	public SetUp() {
		
		System.setProperty("webdriver.gecko.driver","/home/daiane.macedo/workspace2/cucumber/resources/seleniumDrivers/geckodriver");
		driver = new FirefoxDriver();

		
	}

	public void SetUpTest(String url) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

	public void TearDown() {
		driver.close();
	}
	
}
