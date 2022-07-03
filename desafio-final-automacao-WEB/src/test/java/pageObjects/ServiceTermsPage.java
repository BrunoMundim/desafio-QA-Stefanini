package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class ServiceTermsPage {

	Actions acao = new Actions(driver);
	
	@FindBy(xpath = "//a[@title=\"View my shopping cart\"]")
	private WebElement botaoCart;
	
	@FindBy(xpath = "//p[@class=\"cart_navigation clearfix\"]/a[@title=\"Proceed to checkout\"]")
	private WebElement botaoProceedToCheckout1;
	
	@FindBy(name = "processAddress")
	private WebElement botaoProceedToCheckout2;
	
	@FindBy(xpath = "//p[@class=\"checkbox\"]/a")
	private WebElement linkTermsOfService;
	
	@FindBy(xpath = "//p/button/span")
	private WebElement botaoProceedToCheckout3;
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	private WebElement checkboxTermos;
	
	public void clicarCartCheckout() {
		botaoCart.click();
	}
	
	public void clicarBotaoProceedToCheckout1() {
		botaoProceedToCheckout1.click();
	}
	
	public void clicarBotaoProceedToCheckout2() {
		botaoProceedToCheckout2.click();
	}
	
	public void clicarLinkTermsOfService() {
		linkTermsOfService.click();
	}
	
	public void clicarBotaoProceedToCheckout3() {
		botaoProceedToCheckout3.click();
	}
	
	public void aceitarTermos() {
		checkboxTermos.click();
	}
		
}
