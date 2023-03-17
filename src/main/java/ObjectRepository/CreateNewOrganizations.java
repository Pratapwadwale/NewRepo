package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class CreateNewOrganizations extends WebDriverUtility {
	@FindBy(name="accountname")
	private WebElement organizationedt;
	
	@FindBy(name="industry")
	private WebElement industryedt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public CreateNewOrganizations(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the organizationName
	 */
	public WebElement getOrganizationedt() {
		return organizationedt;
	}

	/**
	 * @return the industry
	 */
	public WebElement getIndustryedt() {
		return industryedt;
	}

	/**
	 * @return the saveBtn
	 */
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//Business Library
	
	public void createNewOrganization(String orgName)
	{
		organizationedt.sendKeys(orgName);
		saveBtn.click();
	}
	public void createNewOrganization(String orgName,String industry)
	{
		organizationedt.sendKeys(orgName);
		industryedt.sendKeys(industry);
		saveBtn.click();
		
	}
	
	
}
