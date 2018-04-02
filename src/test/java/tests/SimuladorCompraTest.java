package tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import base.SetUp;
import pages.EcommerceSimuladorEspecie;
import pages.PortalHomePage;
import utils.Constantes;

public class SimuladorCompraTest extends SetUp{
	
	PortalHomePage homePage = new PortalHomePage(driver);
	EcommerceSimuladorEspecie ecommerceSimuladorEspeciePage = new EcommerceSimuladorEspecie(driver);
	
	@org.testng.annotations.Ignore
	@Test
	public void realizarSimulacaoDeCompra(){
		homePage.preencherValoresCompra("Dólar", "10000");
		assertThat(homePage.getEcommercePageTittle()).isEqualToIgnoringCase("Compra Online - Confidence Câmbio");
		assertThat(homePage.getUrl()).containsIgnoringCase("https://www.confidencecambio.com.br/ecommerce");
	}
	
	@Test
	public void realizarSimulacaoDeCompraSemValor(){
		homePage.preencherValoresCompra("Dólar", "0");
		assertThat(homePage.getEcommercePageTittle()).isEqualToIgnoringCase("Compra Online - Confidence Câmbio");
		assertThat(homePage.getUrl()).containsIgnoringCase("https://www.confidencecambio.com.br/ecommerce");
		assertThat(ecommerceSimuladorEspeciePage.validaMensagemValorInvalido().contains(Constantes.VALOR_INVALIDO_SIMULADOR_ECOMMERCE));
		
	}

}
