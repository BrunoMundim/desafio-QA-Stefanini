package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SearchPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class SearchSteps {

	@Quando("digitar o produto {string} na barra de pesquisa")
	public void digitarOProdutoNaBarraDePesquisa(String item) {
	    Na(SearchPage.class).digitarPesquisa(item);
	}

	@Quando("clicar no botao para pesquisar")
	public void clicarNoBotaoParaPesquisar() {
	    Na(SearchPage.class).clicarBotaoBusca();
	}

	@Entao("deve mostrar quantos resultados para aquela pesquisa existem")
	public void deveMostrarQuantosResultadosParaAquelaPesquisaExistem() {
	    assertTrue(driver.findElement(By.xpath("//div[@class=\"product-count\"]")).getText().contains("Showing"));
	}

	
}
