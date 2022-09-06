package testCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;
import pages.CreateNewAccount;

public class CreateNewAccounTest extends TestBase{

	CreateNewAccount acc;
	
	@BeforeMethod
	public void before() throws Exception
	{
		initialization();
		acc=new CreateNewAccount();
	}

	@Test(priority=1)
	public void verifyCreateNewAccTest()
	{
		acc.verifyCreateNewAcc();
	}
	
	@Test
	public void NewAccountCreationTest() throws Exception
	{
		acc.verifyCreateNewAcc();
		acc.NewAccountCreation();
	}
	
	@AfterMethod
	public void after(ITestResult screenshot) throws Exception
	{
		if(ITestResult.SUCCESS==screenshot.getStatus())
		{
			utility.TakesScreenShot.ScreenShot(driver, screenshot.getName());
		}
		
		driver.close();
	}
}
