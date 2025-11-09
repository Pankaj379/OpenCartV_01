package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;


public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class , groups="DataDriver")// for single group no need to add {}.
	// getting data provider from different class that why dataProviderClass is used here.
	public void verify_loginDDT(String email, String pwd, String exp) throws InterruptedException
	{
		logger.info("***** stating TC_003_LoginDDT ******");

		try
		{
			//HomePage
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			//Login
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(pwd);
			lp.clickLogin();

			//MyAccount
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountPageExists();

			/*Data is valid  - login success - test pass  - logout
							   login failed - test fail

			Data is invalid - login success - test fail  - logout
							  login failed - test pass
			 */

			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true) // Data is valid  - login success - test pass  - logout
				{			
					macc.clickLogout();
					Assert.assertTrue(true);

				}
				else
				{
					Assert.assertTrue(false); // login failed - test fail
				}
			}

			if(exp.equalsIgnoreCase("Invalid")) // getting valid/invalid from excel sheet.
			{
				if(targetPage==true) // login success - test fail  - logout
				{
					macc.clickLogout();
					Assert.assertTrue(false);

				}
				else
				{
					Assert.assertTrue(true); // login failed - test pass
				}
			}

		}catch(Exception e)
		{
			Assert.fail();
		}
		Thread.sleep(3000);
		logger.info("***** Finished TC_003_LoginDDT ******");

	}

}