package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class OrganizationPage extends WebDriverUtility {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement orgLookupImg;
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the orgLookupImg
	 */
	public WebElement getOrgLookupImg() {
		return orgLookupImg;
	}
	public void clickOnCreateOrg()
	{
		orgLookupImg.click();
	}

}
