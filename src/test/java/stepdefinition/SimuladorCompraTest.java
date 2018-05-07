
package stepdefinition;

import static org.assertj.core.api.Assertions.assertThat;

import base.SetUp;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PortalHomePage;

public class SimuladorCompraTest extends SetUp {
	


	@Given("^O usuario esta na home (\\d+)$")
	public void o_usuario_esta_na_home(int arg1) throws Throwable {
	  SetUpTest();
	  driver.get("https://www.confidencecambio.com.br");
	}
	
	@When("^O usuario preencher os valores da compra$")
	public void o_usuario_preencher_os_valores_da_compra() throws Throwable {
		PortalHomePage homePage = new PortalHomePage(driver);
		homePage.realizaCotaçãoCompra("Dólar", "10000");
	}

	@Then("^O usuario deve ser redirecionado para o cadastro do ecommerce$")
	public void o_usuario_deve_ser_redirecionado_para_o_cadastro_do_ecommerce() throws Throwable {
		
		PortalHomePage homePage = new PortalHomePage(driver);
		try {
		assertThat(homePage.getEcommercePageTittle()).isEqualToIgnoringCase("Compra Online - Confidence Câmbio");
		assertThat(homePage.getUrl()).containsIgnoringCase("https://www.confidencecambio.com.br/ecommerce");
		}
		finally {
			tearDown();
		}
	}

}
