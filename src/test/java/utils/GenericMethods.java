package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	WebDriver driver;

	public ArrayList<String> lerArquivo(String path) throws IOException {
		ArrayList<String> submenus = new ArrayList<String>();

		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);

		String teste;
		while ((teste = br.readLine()) != null) {
			submenus.add(teste);
		}
		return submenus;
	}

	public void waitUntilElementIsVisible(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public WebElement waitUntilElementIsClickable(WebElement e)
	{
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		return e;
	}
}
