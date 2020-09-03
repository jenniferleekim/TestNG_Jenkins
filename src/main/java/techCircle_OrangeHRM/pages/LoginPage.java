package techCircle_OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techCircle_OrangeHRM.testbase.ConfigurationReader;
import techCircle_OrangeHRM.testbase.Driver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"txtUsername\"]")
	public WebElement username;

	@FindBy(xpath = "//*[@id=\"txtPassword\"]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement loginBtn;
	
	@FindBy(id = "menu_admin_nationality")
	public WebElement nationalitiesTab;

	
	
	
	
	

	public void login_ValidCredentials() {

		LoginPage login = new LoginPage();
		login.username.sendKeys(ConfigurationReader.getProperty("validUsername"));
		login.password.sendKeys(ConfigurationReader.getProperty("validPassword"));
		login.loginBtn.click();
	}
	
	public void login_invalidCredentials() {

		LoginPage login = new LoginPage();
		login.password.sendKeys(ConfigurationReader.getProperty("invalidUsername"));
		login.password.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
		login.loginBtn.click();
	}

}
