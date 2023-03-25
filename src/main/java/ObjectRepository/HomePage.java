package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	@FindBy(linkText="Calendar")
	private WebElement calendarBtn;
	
	@FindBy(linkText="Leads")
	private WebElement leadBtn;
	
	@FindBy(linkText="Organizations")
	private WebElement organizationBtn;
	
	@FindBy(linkText="Contacts")
	private WebElement contactBtn;
	
	@FindBy(linkText="Opportunities")
	private WebElement OpportunitiesBtn;
	
	@FindBy(linkText="Products")
	private WebElement ProductsBtn;
	
	@FindBy(linkText="Documents")
	private WebElement DocumentsBtn;
	
	@FindBy(linkText="Email")
	private WebElement EmailBtn;
	
	@FindBy(linkText="Trouble Tickets")
	private WebElement TroubleTicketsBtn;
	
	@FindBy(linkText="Dashboard")
	private WebElement DashboardBtn;
	
	@FindBy(linkText="More")
	private WebElement MoreDropDown;
	
	@FindBy(id="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstrationsBte;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutBtn;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/**
	 * @return the calendarBtn
	 */
	public WebElement getCalendarBtn() {
		return calendarBtn;
	}
	/**
	 * @return the leadBtn
	 */
	public WebElement getLeadBtn() {
		return leadBtn;
	}
	/**
	 * @return the organizationBtn
	 */
	public WebElement getOrganizationBtn() {
		return organizationBtn;
	}
	/**
	 * @return the contactBtn
	 */
	public WebElement getContactBtn() {
		return contactBtn;
	}
	/**
	 * @return the opportunitiesBtn
	 */
	public WebElement getOpportunitiesBtn() {
		return OpportunitiesBtn;
	}
	/**
	 * @return the productsBtn
	 */
	public WebElement getProductsBtn() {
		return ProductsBtn;
	}
	/**
	 * @return the documentsBtn
	 */
	public WebElement getDocumentsBtn() {
		return DocumentsBtn;
	}
	/**
	 * @return the emailBtn
	 */
	public WebElement getEmailBtn() {
		return EmailBtn;
	}
	/**
	 * @return the troubleTicketsBtn
	 */
	public WebElement getTroubleTicketsBtn() {
		return TroubleTicketsBtn;
	}
	/**
	 * @return the dashboardBtn
	 */
	public WebElement getDashboardBtn() {
		return DashboardBtn;
	}
	/**
	 * @return the moreDropDown
	 */
	public WebElement getMoreDropDown() {
		return MoreDropDown;
	}
	/**
	 * @return the adminstrationsBte
	 */
	public WebElement getAdminstrationsBte() {
		return adminstrationsBte;
	}
	/**
	 * @return the signoutBtn
	 */
	public WebElement getSignoutBtn() {
		return signoutBtn;
	}
	
	public void logout(WebDriver driver)
	{
		mouseHoverAction(driver, adminstrationsBte);
		signoutBtn.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
