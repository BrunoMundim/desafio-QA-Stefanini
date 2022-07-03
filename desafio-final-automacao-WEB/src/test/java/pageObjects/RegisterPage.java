package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class RegisterPage {

	@FindBy(xpath = "//input[@name=\"id_gender\"][@value=\"1\"]")
	private WebElement Mr;
	
	@FindBy(name = "customer_firstname")
	private WebElement FirstName;
	
	@FindBy(name = "customer_lastname")
	private WebElement LastName;
	
	@FindBy(name = "passwd")
	private WebElement Password;
	
	@FindBy(name = "address1")
	private WebElement Adress;
	
	@FindBy(name = "city")
	private WebElement City;
	
	@FindBy(name = "id_country")
	private WebElement Country;
	
	@FindBy(name = "postcode")
	private WebElement ZipCode;
	
	@FindBy(name = "phone_mobile")
	private WebElement PhoneMobile;
	
	@FindBy (name = "submitAccount")
	private WebElement BtnRegister;
	
	public void clickGender () {
		Mr.click();
	}
	
	public void typeFirstName (String firstName) {
		FirstName.sendKeys(firstName);
	}
	
	public void typeLastName (String lastName) {
		LastName.sendKeys(lastName);
	}
	
	public void typePassword (String password) {
		Password.sendKeys(password);
	}
	
	public void typeAdress (String adress) {
		Adress.sendKeys(adress);
	}
	
	public void typeCity (String city) {
		City.sendKeys(city);
	}
	
	public void chooseState (String state) {
		driver.findElement(By.xpath("//select[@name=\"id_state\"]/option[text() =\"" + state + "\"]")).click();	
	}
	
	public void chooseCountry (String country) {
		driver.findElement(By.xpath("//select[@name=\"id_country\"]/option[text() =\"" + country + "\"]")).click();	
	}
	
	public void typeZipCode (String zipCode) {
		ZipCode.sendKeys(zipCode);		
	}
	
	public void typePhoneMobile (String phoneMobile) {
		PhoneMobile.sendKeys(phoneMobile);		
	}
	
	public void clickBtnRegister () {
		BtnRegister.click();
	}
	
}
