package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG1 {
	@BeforeSuite
	public void befSiuteConf()
	{
		System.out.println("Before Siute");
	}
	@BeforeClass
	public void befClassConf()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethodConf()
	{
		System.out.println("Before Method");
	}
	
	@BeforeTest
	public void beforeTestConf()
	{
		System.out.println("before Test");
	}

	@AfterSuite
	public void AfterSiuteConf()
	{
		System.out.println("After Siute");
	}
	@AfterClass
	public void AfterClassConf()
	{
		System.out.println("After Class");
	}
	
	@AfterMethod
	public void AfterMethodConf()
	{
		System.out.println("After Method");
	}
	
	@AfterTest
	public void AfterTestConf()
	{
		System.out.println("After Test");
	
	}

	
}
