package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class CreateContactPage extends WebDriverUtility{
	
	@FindBy(name="salutationtype")
	private WebElement firstNamedd;
	
	@FindBy(name="firstname")
	private WebElement firstNameEdt;
	
	@FindBy(name="lastname")
	private WebElement lastNameEdt;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveBtn;
	
	
	public CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the firstNamedd
	 */
	public WebElement getFirstNamedd() {
		return firstNamedd;
	}
	
	/**
	 * @return the firstNameEdt
	 */
	public WebElement getFirstNameEdt() {
		return firstNameEdt;
	}

	/**
	 * @return the lastName
	 */
	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}
	
	
	

	/**
	 * @return the saveBtn
	 */
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void selectGenderAndFistName(String gender,String name)
	{
		handleDropdown(firstNamedd, gender);
		firstNameEdt.sendKeys(name);
		saveBtn.click();
	}
	
	public void selectGenderFirstNameLastName(String gender,String name,String lastName)
	{
		
		handleDropdown(firstNamedd, gender);
		firstNameEdt.sendKeys(name);
		lastNameEdt.sendKeys(lastName);
		saveBtn.click();
		
	}
	
	
	
	

}
