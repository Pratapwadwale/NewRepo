package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadLookUpPage {
	@FindBy(xpath="//img[@alt='Create Lead...']")
	private WebElement leadLookUpImgbtn;
	
	public CreateLeadLookUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the leadLookUpImgbtn
	 */
	public WebElement getLeadLookUpImgbtn() {
		return leadLookUpImgbtn;
	}
	/**
	 * This Method will click on lookupimg
	 */
	public void ClickOnCreateLookUpImg()
	{
		leadLookUpImgbtn.click();
	}


}
