package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class CreateNewLeadPage extends WebDriverUtility{
	
	@FindBy(name="salutationtype")
	private WebElement solotationdrop;
	
	@FindBy(name="firstname")
	private WebElement firstNameedt;
	
	@FindBy(name="lastname")
	private WebElement lastNameedt;
	
	@FindBy(name="company")
	private WebElement companyedt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	
	public CreateNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	/**
	 * @return the solotationdrop
	 */
	public WebElement getSolotationdrop() {
		return solotationdrop;
	}


	/**
	 * @return the firstNameedt
	 */
	public WebElement getFirstNameedt() {
		return firstNameedt;
	}


	/**
	 * @return the lastNameedt
	 */
	public WebElement getLastNameedt() {
		return lastNameedt;
	}
	


	/**
	 * @return the savebtn
	 */
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
	/**
	 * @return the companyedt
	 */
	public WebElement getCompanyedt() {
		return companyedt;
	}


	public void createLeadWithSoluFirstNameLastName(String solutation,String firstName,String lastName,String company)
	{
		handleDropdown(solutation, solotationdrop);
		firstNameedt.sendKeys(firstName);
		lastNameedt.sendKeys(lastName);
		companyedt.sendKeys(company);
		savebtn.click();
		
	}

}
