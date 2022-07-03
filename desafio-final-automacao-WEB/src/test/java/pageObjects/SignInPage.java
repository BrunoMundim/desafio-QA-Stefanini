package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class SignInPage {

	@FindBy(xpath = "//a[@class=\"login\"]")
	private WebElement btnSignIn;
	
	@FindBy(id = "email_create")
	private WebElement emailInput;
	
	@FindBy(name = "SubmitCreate")
	private WebElement submitCreate;
	
	public void clickBtnSingIn () {
		esperar(2000);
		btnSignIn.click();
	}
	
	public void enterEmail (String email) {
		emailInput.sendKeys(email);;
	}
	
	public void clickBtnSubmitCreate () {
		submitCreate.click();
	}	
	
}
