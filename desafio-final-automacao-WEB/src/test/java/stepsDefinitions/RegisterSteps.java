package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.RegisterPage;

public class RegisterSteps {

	@Quando("escolher genero")
	public void escolher_genero() {
		Na(RegisterPage.class).clickGender();
	}

	@Quando("digitar First Name {string}")
	public void digitar_First_Name(String firstName) {
		Na(RegisterPage.class).typeFirstName(firstName);
	}

	@Quando("digitar Last Name {string}")
	public void digitar_Last_Name(String lastName) {
		Na(RegisterPage.class).typeLastName(lastName);
	}

	@Quando("digitar password {string}")
	public void digitar_password(String password) {
		Na(RegisterPage.class).typePassword(password);
	}

	@Quando("digitar adress {string}")
	public void digitar_adress(String adress) {
		Na(RegisterPage.class).typeAdress(adress);
	}

	@Quando("digitar city {string}")
	public void digitar_city(String city) {
		Na(RegisterPage.class).typeCity(city);
	}

	@Quando("digitar state {string}")
	public void digitar_state(String state) {
		Na(RegisterPage.class).chooseState(state);
	}
	
	@Quando("escolher country {string}")
	public void escolherCountry(String country) {
		Na(RegisterPage.class).chooseCountry(country);
	}

	@Quando("digitar zipcode {string}")
	public void digitar_zipcode(String zipCode) {
		Na(RegisterPage.class).typeZipCode(zipCode);
	}

	@Quando("digitar mobile phone {string}")
	public void digitar_mobile_phone(String phoneMobile) {
		Na(RegisterPage.class).typePhoneMobile(phoneMobile);
	}

	@Quando("clicar no botao Register")
	public void clicar_no_botao_Register() {
		Na(RegisterPage.class).clickBtnRegister();
	}	
	
	@Entao("erro por nao preencher first name")
	public void erroPorNaoPreencherFirstName() {
		String erroFirstName = "//div[@class=\"alert alert-danger\"]/ol/li/b[text() = \"firstname\"]";
		assertEquals("firstname", driver.findElement(By.xpath(erroFirstName)).getText());
	}

	@Entao("erro por nao preencher last name")
	public void erroPorNaoPreencherLastName() {
		String erroLastName = "//div[@class=\"alert alert-danger\"]/ol/li/b[text() = \"lastname\"]";
		assertEquals("lastname", driver.findElement(By.xpath(erroLastName)).getText());
	}

	@Entao("erro por nao preencher password")
	public void erroPorNaoPreencherPassword() {
		String erroPassword = "//div[@class=\"alert alert-danger\"]/ol/li/b[text() = \"passwd\"]";
		assertEquals("passwd", driver.findElement(By.xpath(erroPassword)).getText());
	}

	@Entao("erro por nao preencher adress")
	public void erroPorNaoPreencherAdress() {
		String erroAdress = "//div[@class=\"alert alert-danger\"]/ol/li/b[text() = \"address1\"]";
		assertEquals("address1", driver.findElement(By.xpath(erroAdress)).getText());
	}

	@Entao("erro por nao preencher city")
	public void erroPorNaoPreencherCity() {
		String erroCity = "//div[@class=\"alert alert-danger\"]/ol/li/b[text() = \"city\"]";
		assertEquals("city", driver.findElement(By.xpath(erroCity)).getText());
	}

	@Entao("erro por nao preencher state")
	public void erroPorNaoPreencherState() {
		String erroState = "//div[@class=\"alert alert-danger\"]/ol/li[text() = \"This country requires you to choose a State.\"]";
		assertEquals("This country requires you to choose a State.", driver.findElement(By.xpath(erroState)).getText());
	}
	
	@Entao("erro por nao preencher country")
	public void erroPorNaoPreencherCountry() {
		String erroCountry = "//div[@class=\"alert alert-danger\"]/ol/li/b[text() = \"id_country\"]";;
		assertEquals("id_country", driver.findElement(By.xpath(erroCountry)).getText());
	}
	
	@Entao("erro por preencher zipcode")
	public void erroPorPreencherZipcode() {
		String erroZipcode = "//div[@class=\"alert alert-danger\"]/ol/li[text() = \"The Zip/Postal code you've entered is invalid. It must follow this format: 00000\"]";
		assertEquals("The Zip/Postal code you've entered is invalid. It must follow this format: 00000",
				driver.findElement(By.xpath(erroZipcode)).getText());
	}

	@Entao("erro por nao preencher mobile phone")
	public void erroPorNaoPreencherMobilePhone() {
		String erroPhoneNumber = "//div[@class=\"alert alert-danger\"]/ol/li[text() = \"You must register at least one phone number.\"]";
		assertEquals("You must register at least one phone number.",
				driver.findElement(By.xpath(erroPhoneNumber)).getText());

	}

	@Entao("abrira a tela My Account")
	public void abrira_a_tela_My_Account() {
		assertEquals("MY ACCOUNT", driver.findElement(By.xpath("//div[@id=\"center_column\"]/h1")).getText());
	}
}
