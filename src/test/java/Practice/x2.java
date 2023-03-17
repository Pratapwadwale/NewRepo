package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class x2 {
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
	public void befTestConf()
	{
		System.out.println("Before Test");
	}
	
	@Test
	public void beforeTestConf()
	{
		System.out.println(" Test");
	}
	@AfterTest
	public void afterClass()
	{
		System.out.println("After test");
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
	
	


}
