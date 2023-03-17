package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfPage {
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement orgHeaderText;
	
	public OrganizationInfPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the orgHeaderText
	 */
	public WebElement getOrgHeaderText() {
		return orgHeaderText;
	}
	//
	public String getOrganizationHeader()
	{
		return orgHeaderText.getText();
	}

}
