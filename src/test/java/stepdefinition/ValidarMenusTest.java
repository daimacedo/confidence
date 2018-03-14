package stepdefinition;

import base.SetUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PortalHomePage;
import static org.assertj.core.api.Assertions.*;

public class ValidarMenusTest extends SetUp {
	

	PortalHomePage portalHomePage = new PortalHomePage(driver);
	
	@When("^O usuario passar o mouse sobre o menu Para Você$")
	public void o_usuario_passar_o_mouse_sobre_o_menu_Para_Você() throws Throwable {
		SetUpTest("https://www.confidencecambio.com.br");
		portalHomePage.mouseHover();
	}

	@Then("^Todos os submenus devem ser listados$")
	public void todos_os_submenus_devem_ser_listados() throws Throwable {

		assertThat(portalHomePage.islistaDeElementosSubmenuParaVoceVisivel()).isTrue();
		assertThat(portalHomePage.getQuantidadeDeSubMenusParaVoce()).isEqualTo(5);
		TearDown();
	}




}
