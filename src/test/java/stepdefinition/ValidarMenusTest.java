
package stepdefinition;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;

import base.SetUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PortalHomePage;

public class ValidarMenusTest extends SetUp {


	private String[] opcoesMenuParaVoce = { "comprar moeda estrangeira", "enviar e receber dinheiro do exterior",
			"pagar contas no exterior", "trocar cheques internacionais" };
	
	private String[] opcoesMenuProdutosPessoaFisica = {"CARTÃO PRÉ-PAGO", "CHEQUES INTERNACIONAIS E TRAVELLERS CHECKS", "DELIVERY DE MOEDAS", "MOEDA EM ESPÉCIE", "MONEYGRAM",
			"REMESSAS E PAGAMENTOS INTERNACIONAIS CONFIDENCE", "REGISTRO DE RDE-ROF", "REGISTRO SISCOSERV", "SEGURO DO VIAJANTE", "XPRESS MONEY", "TABELA DE TARIFAS"};

	private String[] hrefOpcoesMenuProdutosPessoaFisica= 
		{	"https://www.confidencecambio.com.br/produtos/cartao-pre-pago-internacional/",
				"https://www.confidencecambio.com.br/produtos/cheques-internacionais/",
				"https://www.confidencecambio.com.br/produtos/delivery/",
				"https://www.confidencecambio.com.br/produtos/moeda-em-especie/",
				"https://www.confidencecambio.com.br/produtos/moneygram/",
				"https://www.confidencecambio.com.br/produtos/remessas-internacionais/",
				"https://www.bancoconfidence.com.br/produtos/registro-de-rde-rof/",
				"https://www.bancoconfidence.com.br/produtos/registro-siscoserv/",
				"https://www.confidencecambio.com.br/produtos/seguro-do-viajante/",
				"https://www.confidencecambio.com.br/produtos/xpress-money/",
				"https://www.confidencecambio.com.br/download/CONFIDENCE_TABELA_1608.pdf"};
	

	
	@Given("^O usuario esta na home$")
	public void o_usuario_esta_na_home(){
		SetUpTest();
		driver.get("https://www.confidencecambio.com.br");
	}

	@When("^O usuario passar o mouse sobre o menu Para Você$")
	public void o_usuario_passar_o_mouse_sobre_o_menu_Para_Você() throws Throwable {
		PortalHomePage homePage = new PortalHomePage(driver);
		homePage.selecionaMenuParaVoce();
	}
	
	@Then("^Todos os submenus do Menu Para Voce devem ser listados$")
	public void todos_os_submenus_do_Menu_Para_Voce_devem_ser_listados() throws Throwable {
		PortalHomePage homePage = new PortalHomePage(driver);
		List<WebElement> listaSubMenuParaVoce = homePage.getListaOpcoesMenuParaVoce();
		List<String> submenus = Arrays.asList(opcoesMenuParaVoce);
		for (WebElement elemento : listaSubMenuParaVoce) {
			assertThat(submenus.contains(elemento.getText().toLowerCase())).isTrue();
		}
		assertThat(listaSubMenuParaVoce.size()).isEqualTo(submenus.size());
		tearDown();
	}

	@When("^O usuario passar o mouse sobre o menu Produtos > Pessoa Fisica$")
	public void o_usuario_passar_o_mouse_sobre_o_menu_Produtos_Pessoa_Fisica() throws Throwable {
		PortalHomePage homePage = new PortalHomePage(driver);
		homePage.selecionaMenuProdutos();
	}
	
	@Then("^Todos os submenus do menu Produtos > Pessoa Fisica devem ser listados$")
	public void todos_os_submenus_do_menu_Produtos_Pessoa_Fisica_devem_ser_listados(){
		PortalHomePage homePage = new PortalHomePage(driver);
		List<WebElement> listaSubMenusProdutosPessoaFisica = homePage.getListaOpcoesMenuProdutosPessoaFisica();
		List<String> submenus = Arrays.asList(opcoesMenuProdutosPessoaFisica);
		
		for(WebElement elemento: listaSubMenusProdutosPessoaFisica)	{
			assertThat(submenus.contains(elemento.getText().toUpperCase())).isTrue();
		}
		
		List<String> hrefSubMenus = Arrays.asList(hrefOpcoesMenuProdutosPessoaFisica);
		for(WebElement elemento: listaSubMenusProdutosPessoaFisica)	{
			assertThat(hrefSubMenus.contains(elemento.getAttribute("href"))).isTrue();
		}
		System.out.println(listaSubMenusProdutosPessoaFisica.size());
		tearDown();
	}




}
