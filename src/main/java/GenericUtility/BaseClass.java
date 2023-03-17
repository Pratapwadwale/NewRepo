package GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public PropertyFileUtility pUtil=new PropertyFileUtility();
	public ExcelFileUtility eUtil=new ExcelFileUtility();
	public WebDriverUtility wUtil=new WebDriverUtility();
	public JavaUtility jUtil=new JavaUtility();
	public int rn = jUtil.getRandomNumber();
	
	public WebDriver driver=null;
	public static WebDriver sdriver;
	
	@BeforeSuite
	public void befSuiteConf()
	{
		System.out.println("Databse connection is succesfull");
	}
	
	
	@BeforeClass
	public void befClassConf() throws IOException
	{
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String URL = pUtil.readDataFromPropertyFile("url");
		System.out.println("Url");
		if(BROWSER.equalsIgnoreCase("Edge"))
		{
			System.out.println("Browser launch ");
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
			System.out.println("Browser launch ");
			sdriver=driver;
			System.out.println("===="+BROWSER+"Launch Succesfuly");
			
		}
		else if(BROWSER.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
			System.out.println("===="+BROWSER+"Launch Succesfuly");
			sdriver=driver;
		}
		else
		{
			System.out.println("Invalid browsername");
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get(URL);
		
//		wUtil.maximizeWindow(driver);
//		System.out.println("Maximized");
//		wUtil.waitForPageLoad(driver);
//		driver.get(URL);
		
		
		System.out.println("Before Class");
		
	}
	@BeforeMethod
	public void befMethodConf() throws IOException
	{
		String username = pUtil.readDataFromPropertyFile("username");
		String PASSWARD = pUtil.readDataFromPropertyFile("password");
		
		LoginPage lp=new LoginPage(driver);
		lp.loginApp(username,PASSWARD );
		
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aftMethodConf()
	{
		HomePage hp=new HomePage(driver);
		hp.logout(driver);
		System.out.println("After Method");
	}
	@AfterClass
	public void aftClassconf()
	{
		driver.quit();
		System.out.println("Afte class");
	}
	@AfterSuite
	public void aftSuiteConf()
	{
		System.out.println("After Suite");
	}

}
