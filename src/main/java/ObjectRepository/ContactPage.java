package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	@FindBy(xpath="//img[@alt='Create Contact...']")
	WebElement contactLookUpImg;
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	/**
	 * @return the cantactLookUpImg
	 */
	public WebElement getCantactLookUpImg() {
		return contactLookUpImg;
	}
	public void clickOnContactLookUpImg()
	{
		contactLookUpImg.click();
	}
	
}
