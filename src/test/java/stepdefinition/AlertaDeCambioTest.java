package stepdefinition;

import static org.assertj.core.api.Assertions.assertThat;

import base.SetUp;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AlertaDeCambioPage;
import pages.PortalHomePage;

public class AlertaDeCambioTest extends SetUp {

	
	@When("^O usuario clicar no submenu Alerta de Cambio$")
	public void o_usuario_clicar_no_submenu_Alerta_de_Cambio() throws Throwable {
		PortalHomePage portalHomePage = new PortalHomePage(driver);
		portalHomePage.selecionaSubMenuAlertaDeCambio();
	}

	@When("^O usuario selecionar o serviço Moeda em Especie$")
	public void o_usuario_selecionar_o_serviço_Moeda_em_Especie() throws Throwable {
		new AlertaDeCambioPage(driver)
			.selecionarServicoMoedaEspecie();
	}

	@When("^O usuario selecionar a moeda dolar$")
	public void o_usuario_selecionar_a_moeda_dolar() throws Throwable {
		new AlertaDeCambioPage(driver)
			.selecionarMoedaDolar();
	}

	@When("^O usuario selecionar receber todos os alertas$")
	public void o_usuario_selecionar_receber_todos_os_alertas() throws Throwable {
		new AlertaDeCambioPage(driver)
			.selecionarTodosAlertas();
	}

	@When("^O usuario digitar seu email$")
	public void o_usuario_digitar_seu_email_e_cadastrar() throws Throwable {
		new AlertaDeCambioPage(driver)
			.preencherEmail("teste@teste.com");
	
	}

	@When("^O usuario clicar em cadastrar$")
	public void o_usuario_clicar_em_cadastrar() throws Throwable {
		AlertaDeCambioPage alertaDeCambioPage = new AlertaDeCambioPage(driver);
		alertaDeCambioPage.clicarEmCadastrar();
	}

	@Then("^Um alerta com a mensagem Alerta salvo com sucesso! deve ser exibido$")
	public void um_alerta_com_a_mensagem_Alerta_salvo_com_sucesso_deve_ser_exibido() throws Throwable {
	    try {
	    	AlertaDeCambioPage alertaDeCambioPage = new AlertaDeCambioPage(driver);
		    assertThat(alertaDeCambioPage.getMensagemDeCadastroComSucesso()).isEqualToIgnoringCase("Alerta salvo com sucesso!");
	    }
	    finally {
		    tearDown();
		}
	}

	@Then("^um alerta com a mensagem Preencha o e-mail corretamente deve ser exibido$")
	public void um_alerta_com_a_mensagem_Preencha_o_e_mail_corretamente_deve_ser_exibido() throws Throwable {
	    try {
	    	AlertaDeCambioPage alertaDeCambioPage = new AlertaDeCambioPage(driver);
		    assertThat(alertaDeCambioPage.getMensagemDeCadastroComSucesso()).isEqualToIgnoringCase("Preencha o e-mail corretamente");
	    }
	    finally {
		    tearDown();
		}
	}
	
	@Then("^um alerta com a mensagem Escolha uma das opções disponiveis de alerta deve ser exibido$")
	public void um_alerta_com_a_mensagem_Escolha_uma_das_opções_disponiveis_de_alerta_deve_ser_exibido() throws Throwable {
		try {
	    	AlertaDeCambioPage alertaDeCambioPage = new AlertaDeCambioPage(driver);
		    assertThat(alertaDeCambioPage.getMensagemSelecionarAlerta()).isEqualToIgnoringCase("Escolha uma das opções disponiveis de alerta");
	    }
	    finally {
		    tearDown();
		}
	}




}
