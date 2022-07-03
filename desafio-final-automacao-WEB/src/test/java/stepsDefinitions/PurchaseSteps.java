package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.PurchasePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class PurchaseSteps {

	// Contexto
	
	@Quando("eu digitar meu email {string}")
	public void euDigitarMeuEmail(String email) {
	    Na(PurchasePage.class).digitarEmail(email);
	}

	@Quando("eu digitar minha senha {string}")
	public void euDigitarMinhaSenha(String senha) {
		Na(PurchasePage.class).digitarSenha(senha);
	}

	@Quando("clicar no botao Sign In")
	public void clicarNoBotaoSignIn() {
		Na(PurchasePage.class).clicarBotaoLogin();
	}
	
	// Adicionar item a wishlist
	
	@Quando("clicar no menu Dresses")
	public void clicarNoMenuDresses() {
		esperar(2000);
	    Na(PurchasePage.class).clicarBotaoMenuDresses();
	}

	@Quando("clicar no item {string}")
	public void clicarNoItem(String item) {
	    Na(PurchasePage.class).clicarNoItem(item);
	}

	@Quando("clicar na opcao Add to wishlist")
	public void clicarNaOpcaoAddToWishlist() {
		Na(PurchasePage.class).adicionarWishlist();
	}

	@Quando("clicar no perfil")
	public void clicarNoPerfil() {
		Na(PurchasePage.class).abrirMenuConta();
	}

	@Quando("clicar em My Wishlists")
	public void clicarEmMyWishlists() {
		Na(PurchasePage.class).abrirMenuWishlist();
	}

	@Quando("clicar em view")
	public void clicarEmView() {
		Na(PurchasePage.class).clicarBotaoView();
	}

	@Entao("aparece o vestido {string}")
	public void apareceOVestido(String item) {
	    assertTrue(driver.findElement(By.xpath("//p[contains(text(),\"" + item + "\")]")).getText().contains(item));
	}
	
	// Adicionar item ao carrinho
	
	@Quando("clicar na opcao Add to cart")
	public void clicarNaOpcaoAddToCart() {
	    Na(PurchasePage.class).adicionarCarrinho();
	}

	@Entao("adiciona o item ao carrinho")
	public void adicionaOItemAoCarrinho() {
	    assertEquals("1", driver.findElement(By.xpath("//span[@class=\"ajax_cart_quantity unvisible\"]")).getText());
	}
	
	// Remover item do carrinho
	
	@Quando("excluir o item {string} do carrinho")
	public void excluirOItemDoCarrinho(String string) {
		Na(PurchasePage.class).removerItemCarrinho();
	}

	@Entao("o carrinho fica vazio")
	public void oCarrinhoFicaVazio() {
		esperar(2000);
		assertEquals("(empty)", driver.findElement(By.xpath("//span[@class=\"ajax_cart_no_product\"]")).getText());
	}


	
}
