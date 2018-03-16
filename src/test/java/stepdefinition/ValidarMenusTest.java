package stepdefinition;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import base.SetUp;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PortalHomePage;

public class ValidarMenusTest{
	
	private String[] opcoesMenuParaVoce = {"ofertas semana das mulheres", "comprar moeda estrangeira", "enviar e receber dinheiro do exterior", "pagar contas no exterior", "trocar cheques internacionais" };
	private PortalHomePage portalHomePage;
	private SetUp setUp;
	
	public ValidarMenusTest() { 
		System.out.println("JAIR PASSOU POR AQUI COM UMA GARRAFA DE CACHAÇA");
		setUp = new SetUp();
		portalHomePage = new PortalHomePage(setUp.getDriver());
	}
		
	@When("^O usuario passar o mouse sobre o menu Para Você$")
	public void o_usuario_passar_o_mouse_sobre_o_menu_Para_Você() throws Throwable {
	//	setUpTest("https://www.confidencecambio.com.br");
		portalHomePage.mouseHover();
	}

	@Then("^Todos os submenus devem ser listados$")
	public void todos_os_submenus_devem_ser_listados() throws Throwable {
		List<WebElement> listaSubMenuParaVoce = portalHomePage.getListaSubMenusParaVoce();
		
		List<String> menus = Arrays.asList(opcoesMenuParaVoce);
		for (WebElement elemento : listaSubMenuParaVoce) {
			//assertThat(menus.contains(elemento.getText().toLowerCase())).isTrue();
		}
		//assertThat(listaSubMenuParaVoce.size()).isEqualTo(menus.size());
	}
	
	@After
	public void jair() {
		setUp.tearDown();
	}
}
