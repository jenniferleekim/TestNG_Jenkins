package techCircle_OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techCircle_OrangeHRM.testbase.Driver;

public class MyInfoPage {

	public MyInfoPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "menu_pim_viewMyDetails")
	public WebElement myInfoTab;
	
	@FindBy(xpath = "//*[@id=\"btnSave\"]")
	public WebElement editBtn;

	@FindBy(xpath = "//*[@id=\"btnSave\"]")
	public WebElement saveBtn;

	@FindBy(id = "personal_txtEmpFirstName")
	public WebElement firstName;

	@FindBy(id = "personal_txtEmpLastName")
	public WebElement lastName;

	@FindBy (id = "btnAddAttachment")
	public WebElement attachmentBtn;
	
	@FindBy (id = "cancelButton")
	public WebElement cancelBtn;
	
}
