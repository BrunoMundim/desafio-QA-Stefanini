package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class PurchasePage {
	
	Actions acao = new Actions(driver);

	@FindBy(name = "email")
	private WebElement campoEmail;
	
	@FindBy(name = "passwd")
	private WebElement campoSenha;
	
	@FindBy(name = "SubmitLogin")
	private WebElement botaoLogin;
	
	@FindBy(xpath = "//a[@title=\"Women\"]")
	private WebElement botaoMenuWomen;
	
	@FindBy(xpath = "//a[@title=\"Dresses\"]")
	private WebElement botaoMenuDresses;
	
	@FindBy(id = "wishlist_button")
	private WebElement botaoWishlist;
	
	@FindBy(xpath = "//a[@class=\"fancybox-item fancybox-close\"][@title=\"Close\"]")
	private WebElement fecharSucessoAdicionarWishlist;
	
	@FindBy(xpath = "//a[@title=\"View my customer account\"]")
	private WebElement botaoMenuConta;
	
	@FindBy(xpath = "//a[@title=\"My wishlists\"]")
	private WebElement botaoMenuWishlist;
	
	@FindBy(xpath = "//a[contains(text(),\"View\")]")
	private WebElement botaoView;	
	
	@FindBy(xpath = "//button[@name=\"Submit\"]")
	private WebElement botaoAddCart;
	
	@FindBy(xpath = "//span[@title=\"Continue shopping\"]")
	private WebElement botaoContinueShopping;
	
	@FindBy(xpath = "//div[@class=\"shopping_cart\"]/a")
	private WebElement botaoCart;
	
	@FindBy(xpath = "//a[@class=\"ajax_cart_block_remove_link\"]")
	private WebElement botaoExcluirItemCarrinho;
	
	public void digitarEmail(String email) {
		campoEmail.sendKeys(email);
	}
	
	public void digitarSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void clicarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void clicarBotaoMenuDresses() {
		acao.moveToElement(botaoMenuWomen).build().perform();
		acao.moveToElement(botaoMenuDresses).click().build().perform();
		esperar(2000);
	}
	
	public void clicarNoItem(String item) {
		driver.findElement(By.xpath("//h5[@itemprop=\"name\"]/a[@title=\"" + item + "\"]")).click();
	}
	
	public void adicionarWishlist() {
		botaoWishlist.click();
		fecharSucessoAdicionarWishlist.click();
	}
	
	public void abrirMenuConta() {
		botaoMenuConta.click();
	}
	
	public void abrirMenuWishlist() {
		botaoMenuWishlist.click();
	}
	
	public void clicarBotaoView() {
		botaoView.click();
		esperar(2000);
	}
	
	public void adicionarCarrinho() {
		botaoAddCart.click();
		botaoContinueShopping.click();
	}
	
	public void removerItemCarrinho() {
		acao.moveToElement(botaoCart).build().perform();
		acao.moveToElement(botaoExcluirItemCarrinho).click().build().perform();
	}
}
