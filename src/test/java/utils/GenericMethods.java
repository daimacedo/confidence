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
	public ArrayList<String> lerArquivo(String path) throws IOException
	{
		ArrayList<String> submenus = new ArrayList<String>();
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String teste;
	    while((teste = br.readLine()) != null){
	           	 submenus.add(teste);
	         } 
	    return submenus;
	}
	
//	public Boolean isElementVisible(WebElement element) {
////		
////		 element.isDisplayed();
////		 return true;
////	}
	
//	public boolean existeElemento(WebElement idElemento) {
//        try {
//            
//            return idElemento != null;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }
	



}
