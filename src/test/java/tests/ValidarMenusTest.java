package tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.graph.ElementOrder;

import base.SetUp;
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
	
@org.testng.annotations.Ignore
	@Test
	public void validaOpcoesDoMenuParaVoce() throws InterruptedException {
		SetUpTest();
		PortalHomePage homePage = new PortalHomePage(driver);
		homePage.selecionaMenuParaVoce();
		List<WebElement> listaSubMenuParaVoce = homePage.getListaOpcoesMenuParaVoce();
		List<String> submenus = Arrays.asList(opcoesMenuParaVoce);
		for (WebElement elemento : listaSubMenuParaVoce) {
			assertThat(submenus.contains(elemento.getText().toLowerCase())).isTrue();
		}
		assertThat(listaSubMenuParaVoce.size()).isEqualTo(submenus.size());
		tearDown();
		
	}
	
	
	@Test
	public void validaOpcoesDoMenuProdutosPessoaFisica(){
		SetUpTest();
		PortalHomePage homePage = new PortalHomePage(driver);
		homePage.selecionaMenuProdutos();
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
