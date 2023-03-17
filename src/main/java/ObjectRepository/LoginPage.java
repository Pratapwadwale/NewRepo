package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility{
	@FindBy(name="user_name")
	private WebElement usrnameedt;
	
	@FindBy(name="user_password")
	private WebElement passwordedt;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the usrnameedt
	 */
	public WebElement getUsrnameedt() {
		return usrnameedt;
	}

	/**
	 * @return the passwordedt
	 */
	public WebElement getPasswordedt() {
		return passwordedt;
	}

	/**
	 * @return the loginBtn
	 */
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void loginApp(String username,String password)
	{
		usrnameedt.sendKeys(username);
		passwordedt.sendKeys(password);
		loginBtn.click();
	}

}
