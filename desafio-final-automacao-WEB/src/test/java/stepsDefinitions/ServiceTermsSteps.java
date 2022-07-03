package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ServiceTermsPage;

public class ServiceTermsSteps {

	@Quando("clicar no cart")
	public void clicarNoCart() {
		Na(ServiceTermsPage.class).clicarCartCheckout();
	}

	@Quando("clicar em proceed to checkout primeira tela")
	public void clicarEmProceedToCheckoutPrimeiraTela() {
		Na(ServiceTermsPage.class).clicarBotaoProceedToCheckout1();
	}

	@Quando("clicar em proceed to checkout segunda tela")
	public void clicarEmProceedToCheckoutSegundaTela() {
		Na(ServiceTermsPage.class).clicarBotaoProceedToCheckout2();
	}

	@Quando("clicar em Read the Terms of Service")
	public void clicarEmReadTheTermsOfService() {
		Na(ServiceTermsPage.class).clicarLinkTermsOfService();
	}

	@Entao("aparece a tela TERMS AND CONDITIONS OF USE")
	public void apareceATelaTERMSANDCONDITIONSOFUSE() {
		System.out.println(driver.findElement(By.xpath("//div[@class=\"fancybox-outer\"]/div/iframe")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[@class=\"fancybox-outer\"]/div/iframe")).isDisplayed());
	}
	
	// Não aceita os termos 
	
	@Quando("clicar em proceed to checkout terceira tela")
	public void clicarEmProceedToCheckoutTerceiraTela() {
		Na(ServiceTermsPage.class).clicarBotaoProceedToCheckout3();
	}

	@Entao("aparece a mensagem {string}")
	public void apareceAMensagem(String erro) {
	    assertEquals(erro, driver.findElement(By.xpath("//p[@class=\"fancybox-error\"]")).getText());
	  
	}

	// Aceita os termos
	
	@Quando("aceitar os termos de servico")
	public void aceitarOsTermosDeServico() {
		Na(ServiceTermsPage.class).aceitarTermos();
	}
	
	@Entao("aparece a tela {string}")
	public void apareceATela(String string) {
		assertEquals(string, driver.findElement(By.xpath("//h1[@class=\"page-heading\"]")).getText());
	}


	
}
