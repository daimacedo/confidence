package stepdefinition;

import static org.assertj.core.api.Assertions.assertThat;

import base.SetUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PortalHomePage;

public class SimuladorCompraTest extends SetUp {
	
	PortalHomePage portalHomePage = new PortalHomePage(driver);

	@Given("^O usuario esta na home$")
	public void o_usuario_esta_na_home() throws Throwable {
		SetUpTest("https://www.confidencecambio.com.br");
	}

	@When("^O usuario preencher os valores da compra$")
	public void o_usuario_preencher_os_valores_da_compra() throws Throwable {
		
	    portalHomePage.preencherValoresCompra("Dólar", "10000");
	}

	@Then("^O usuario deve ser redirecionado para o cadastro do ecommerce$")
	public void o_usuario_deve_ser_redirecionado_para_o_cadastro_do_ecommerce() throws Throwable {
		assertThat(portalHomePage.getEcommercePageTittle()).isEqualToIgnoringCase("Compra Online - Confidence Câmbio");
		assertThat(portalHomePage.getUrl()).containsIgnoringCase("https://www.confidencecambio.com.br/ecommerce");
	}
}
