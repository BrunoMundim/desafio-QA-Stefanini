package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SignInPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class SignInSteps {

	// Tela de cadatro email inválido
	@Quando("clicar em sign in")
	public void clicarEmSignIn() {
		Na(SignInPage.class).clickBtnSingIn();
	}

	@Quando("digitar um email {string}")
	public void digitarUmEmail(String email) {
		Na(SignInPage.class).enterEmail(email);
	}
	
	@Quando("clicar no botao Create an account")
	public void clicarNoBotaoCreateAnAccount() {
		Na(SignInPage.class).clickBtnSubmitCreate();
	}

	@Entao("mostrar mensagem de erro")
	public void mostrarMensagemDeErro() {
		assertEquals("Invalid email address.",
				driver.findElement(By.xpath("//div[@id=\"create_account_error\"]/ol/li")).getText());
	}
	
	// Tela de cadastro email valido
	@Entao("abre a tela de cadastro")
	public void abreATelaDeCadastro() {
		esperar(2000);
		assertEquals("YOUR PERSONAL INFORMATION", driver.findElement(By.xpath("//div[@class=\"account_creation\"]/h3[@class=\"page-subheading\"]")).getText());
	}

}
