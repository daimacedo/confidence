package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.GenericMethods;

public class AlertaDeCambioPage extends GenericMethods {

	WebDriver driver;

	@FindBy(xpath = "//span[text()='Outros Serviços'][2]")
	WebElement menuSelecionarServiço;

	@FindBy(xpath = "//a[text()='moeda em espécie ']")
	WebElement servicoMoedaEmEspecie;

	@FindBy(name = "search")
	WebElement textBuscaMoedas;

	@FindBy(xpath = "//li[text()='Dólar']")
	WebElement moedaDolar;

	@FindBy(xpath = "//input[@value='Diário']")
	WebElement checkboxEmailDiarioTaxaDolar;

	@FindBy(xpath = "//input[@value='Condicional']")
	WebElement checkboxValorDoDolar;

	@FindBy(xpath = "//input[@value='Semanais']")
	WebElement checkboxMenorValorEm7Dias;

	@FindBy(xpath = "//input[@type='email']")
	WebElement textDigiteSeuEmail;

	@FindBy(xpath = "//button[text()='Cadastrar']	")
	WebElement btnCadastrar;

	@FindBy(xpath = "//button[text()='Não Receber']")
	WebElement btnNaoReceberInformacoes;

	public AlertaDeCambioPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isElementClickable(WebElement elemento) {
		//WebDriverWait wait = new WebDriverWait(driver, 1);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		WebElement element1 = waitUntilElementIsClickable(elemento);
		if (element1 != null) {
			return true;
		} else
			return false;
	}

	public void selecionarServicoMoedaEspecie() throws Exception {

		try {
			if (isElementClickable(btnNaoReceberInformacoes)) {
				btnNaoReceberInformacoes.click();
			}
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			menuSelecionarServiço.click();
			servicoMoedaEmEspecie.click();
		}
	}

	public void selecionarMoedaDolar() throws Exception {

			waitUntilElementIsVisible(textBuscaMoedas);
			textBuscaMoedas.clear();
			textBuscaMoedas.sendKeys("Dolar");
			waitUntilElementIsVisible(moedaDolar);
			moedaDolar.click();

	}

	public void selecionarTodosAlertas() {

		checkboxEmailDiarioTaxaDolar.click();
		checkboxValorDoDolar.click();
		checkboxMenorValorEm7Dias.click();
	}

	public void preencherEmail(String email) {
		textDigiteSeuEmail.sendKeys(email);
	}

	public void clicarEmCadastrar() {
		btnCadastrar.click();
	}

	public String getMensagemDeCadastroComSucesso() {
		String cadastroComSucesso = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			cadastroComSucesso = alert.getText();
			alert.accept();

		} catch (Exception e) {
			// exception handling
		}
		return cadastroComSucesso;
	}

	public String getMensagemDeEmailVazio() {
		String msgEmailVazio = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			msgEmailVazio = alert.getText();
			alert.accept();

		} catch (Exception e) {
			// exception handling
		}
		return msgEmailVazio;
	}

	public String getMensagemSelecionarAlerta() {
		String msgSelecioneAlerta = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Thread.sleep(5000);
			msgSelecioneAlerta = alert.getText();
			alert.accept();

		} catch (Exception e) {
			// exception handling
		}
		return msgSelecioneAlerta;
	}

}
