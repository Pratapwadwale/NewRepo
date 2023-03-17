package Practice;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelFileUtility;
import GenericUtility.JavaUtility;
import GenericUtility.ListenersImplementationClass;
import GenericUtility.PropertyFileUtility;
import ObjectRepository.ContactPage;
import ObjectRepository.CreateContactPage;
import ObjectRepository.CreateContactPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
@Listeners(ListenersImplementationClass.class)
public class Practice2Test extends BaseClass { 

	@Test
	public void createContact() throws EncryptedDocumentException, IOException
	{
		//eUtil.readDataFromExcel("contact", rn);
		HomePage hp=new HomePage(driver);
	
		hp.getContactBtn().click();
		Reporter.log("Click on contact ",true);
		ContactPage cp=new ContactPage(driver);
		cp.clickOnContactLookUpImg();
		Reporter.log("click on lookup img",true);
		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.selectGenderFirstNameLastName("Mr.","Pratap", "Wadwale");
		Reporter.log("Contact created",true);
		System.out.println("Test1");
	}

}
