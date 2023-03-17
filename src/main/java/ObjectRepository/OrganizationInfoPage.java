package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement orgHeader;
	
	public OrganizationInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the orgHeader
	 */
	public WebElement getOrgHeader() 
	{
		return orgHeader;
	}
	public String getOrgHeaderText()
	{
		
	  return orgHeader.getText();
	}

}
