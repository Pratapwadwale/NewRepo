package Practice;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.CreateLeadLookUpPage;
import ObjectRepository.CreateNewLeadPage;
import ObjectRepository.HomePage;

public class CreateLead extends BaseClass{
	
	@Test
	public void createLeadWithSolutationFirstNameLastName()
	{
		HomePage hp=new HomePage(driver);
		hp.getLeadBtn().click();
		
		CreateLeadLookUpPage cllimg=new CreateLeadLookUpPage(driver);
		cllimg.ClickOnCreateLookUpImg();
		
		CreateNewLeadPage cnlp=new CreateNewLeadPage(driver);
		cnlp.createLeadWithSoluFirstNameLastName("Mr.", "Pratap", "Patil","my Company");
		
	}
	

}
