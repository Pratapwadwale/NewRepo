package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class X23 extends BaseClass {
//	public static void main(String[] args) {
//		WebDriver driver=null;
//		String BROWSER="chrome";
//		if(BROWSER.equalsIgnoreCase("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			//sdriver=driver;
//			System.out.println("===="+BROWSER+"Launch Succesfuly");
//			
//		}
//		else if(BROWSER.equalsIgnoreCase("FireFox"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver=new FirefoxDriver();
//			System.out.println("===="+BROWSER+"Launch Succesfuly");
//			//sdriver=driver;
//		}
//		else
//		{
//			System.out.println("Invalid browsername");
//		}
//		 
//		wUtil.maximizeWindow(driver);
//		wUtil.waitForPageLoad(driver);
//		driver.get(URL);
//		
//		
//		
//		//WebDriver driver=new ChromeDriver();
//	}

	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
}
