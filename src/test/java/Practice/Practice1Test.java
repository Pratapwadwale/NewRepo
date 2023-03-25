package Practice;

import java.io.IOException;

import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelFileUtility;
import GenericUtility.JavaUtility;
import GenericUtility.PropertyFileUtility;
import GenericUtility.WebDriverUtility;
import ObjectRepository.CreateNewOrganizations;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.OrganizationInfPage;
import ObjectRepository.OrganizationPage;
@Listeners(GenericUtility.ListenersImplementationClass.class)

public class Practice1Test extends BaseClass{
	@Test(groups="SmokeSuite")
	public void test1() throws EncryptedDocumentException, IOException 
	{
//		PropertyFileUtility pUtil=new PropertyFileUtility();
//		ExcelFileUtility eUtil=new ExcelFileUtility();
//		WebDriverUtility wUtil=new WebDriverUtility();
//		JavaUtility jUtil=new JavaUtility();
//		int rn = jUtil.getRandomNumber();
//		String URL = pUtil.readDataFromPropertyFile("url");
//		String username = pUtil.readDataFromPropertyFile("username");
//		String PASSWARD = pUtil.readDataFromPropertyFile("password");
		String ORGNAME = eUtil.readDataFromExcel("MultipleOrg", 1, 0);
		String INDUSTRY = eUtil.readDataFromExcel("MultipleOrg", 1, 1);
//
//		
//		
//		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get(URL);
//		
////		driver.findElement( By.name("user_name")).sendKeys("Admin");
////		driver.findElement( By.name("user_password")).sendKeys("Admin");
//		LoginPage lp=new LoginPage(driver);
//		lp.loginApp(username,PASSWARD );
		HomePage hp=new HomePage(driver);
		hp.getOrganizationBtn().click();
		OrganizationPage op=new OrganizationPage(driver);
		op.clickOnCreateOrg();
		CreateNewOrganizations cno=new CreateNewOrganizations(driver);
		cno.createNewOrganization(ORGNAME+rn);
		OrganizationInfPage oIp=new OrganizationInfPage(driver);
		
		Assert.assertTrue(false);
		 String orgHeader = oIp.getOrganizationHeader();
		System.out.println(orgHeader);
		Assert.assertTrue(orgHeader.contains(ORGNAME+rn));
			//hp.logout(driver);
		
	}

}
