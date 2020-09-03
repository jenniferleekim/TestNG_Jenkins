package techCircle_OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techCircle_OrangeHRM.testbase.Driver;

public class LandingPage {

	
	public LandingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}



	@FindBy(xpath = "//*[@id=\"welcome\"]")
	public WebElement WelcomeDropDown;

	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	public WebElement logOutButton;

//	@FindBy (xpath = "//*[@id=\"btnLogin\"]")
//	public WebElement login;

	@FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]/b")
	public WebElement AdminTab;
	
	
	
	
	
	
	public void logout() {
		
		LandingPage landingPage = new LandingPage();

		landingPage.WelcomeDropDown.click();
		landingPage.logOutButton.click();

	}
	
	
}
