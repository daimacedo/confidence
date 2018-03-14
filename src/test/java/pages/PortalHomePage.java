package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='simulate']/div[1]/a/p") 
	WebElement comboMoedaEspecie;
	
	@FindBy(xpath = "//a[contains(text(),'moeda em espécie')]")
	WebElement tipoMoedaEspecie;
	
	@FindBy(id = "search")
	WebElement moedaOperacional;
	
	@FindBy(xpath = "//input[(@class='moeda-valor valor-moeda-estrangeira text-center')]")
	WebElement valorMoedaOperacional;
	
	@FindBy(xpath= "//span[contains(text(),'Comprar moeda em espécie')]")
	WebElement btnComprarMoedaEmEspecie;
	
	@FindBy(xpath= "//a[contains(text(),'Para você')]")
	WebElement menuParaVoce;
	
	@FindBy(xpath= "//ul[contains(@id,'menu-menu-topo')]/li[2]/ul/li/a")
	java.util.List<WebElement> subMenusParaVoce;
	
	
	
	public PortalHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void preencherValoresCompra(String moedaOperacional,String valorMoedaOperacional)
	{
		this.comboMoedaEspecie.click();
		this.tipoMoedaEspecie.click();
		this.moedaOperacional.clear();
		this.moedaOperacional.sendKeys(moedaOperacional);
		this.valorMoedaOperacional.click();
		this.valorMoedaOperacional.clear();
		this.valorMoedaOperacional.sendKeys(valorMoedaOperacional);
		this.btnComprarMoedaEmEspecie.click();
	}
	
	public String getEcommercePageTittle()
	{
		return driver.getTitle();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
				
	}

	public void mouseHover()
	{
		Actions action = new Actions(driver);
		WebElement we = menuParaVoce;
		action.moveToElement(we).click().build().perform();
	}
	
	public java.util.List<WebElement> getListaSubMenusParaVoce()
	{
		java.util.List<WebElement> listaSubMenusParaVoce = subMenusParaVoce;
		for (int i=0; i<listaSubMenusParaVoce.size(); i++) {
			System.out.println(listaSubMenusParaVoce.get(i).getText());	
		}
		return listaSubMenusParaVoce;
		
	}
	
	
	


}
