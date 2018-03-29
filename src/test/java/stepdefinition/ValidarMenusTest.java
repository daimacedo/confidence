package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pages.PortalHomePage;

import java.util.Arrays;
import java.util.List;

public class ValidarMenusTest extends BaseStep {

	private String[] opcoesMenuParaVoce = {"ofertas semana das mulheres", "comprar moeda estrangeira", "enviar e receber dinheiro do exterior", "pagar contas no exterior", "trocar cheques internacionais" };
	private PortalHomePage portalHomePage;

	@Given("^O usuario esta na home 1$")
	public void o_usuario_esta_na_home_1() throws Throwable {
		driver.get("https://www.confidencecambio.com.br");
	}

	@When("^O usuario passar o mouse sobre o menu Para Você$")
	public void o_usuario_passar_o_mouse_sobre_o_menu_Para_Você() throws Throwable {
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

	@Before
	public void oi_jair() {
		super.before();
		portalHomePage = new PortalHomePage(driver);
	}

	@After
	public void tchau_jair() {
		super.after();
	}
}
