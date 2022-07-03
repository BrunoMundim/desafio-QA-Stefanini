package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	@FindBy(name = "search_query")
	private WebElement searchBar;
	
	@FindBy(name = "submit_search")
	private WebElement searchButton;
	
	public void digitarPesquisa(String item) {
		searchBar.sendKeys(item);
	}
	
	public void clicarBotaoBusca() {
		searchButton.click();
	}
	
}
