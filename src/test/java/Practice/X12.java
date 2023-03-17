package Practice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
@Listeners(GenericUtility.ListenersImplementationClass.class)
public class X12 extends BaseClass{
	@Test
	public void demo()
	{
		System.out.println("demo");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}

}
