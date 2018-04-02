package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommerceSimuladorEspecie {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[contains(text(),'Por favor, informe um valor válido.')]")
	WebElement msgInsiraValorMoedaValido;
	
	public EcommerceSimuladorEspecie(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String validaMensagemValorInvalido()
	{
		return msgInsiraValorMoedaValido.getText();
	}
	

}
