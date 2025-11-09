package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_Account_Registration extends BaseClass{



	@Test(groups= {"Regression","Master"})
	public void verify_account_registration()
	{
		logger.info("*****Starting TC001_Account_Registration*****");

		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link");
		hp.clickRegister();
		logger.info("Clicked on Register Link");

		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing customer details.");

		regpage.setFirstName(randomString().toUpperCase()); // purely string.
		regpage.setLastName("Automation");
		regpage.setEmail(randomString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomNumber()); // purly numbers.

		String password=randomAlphaNumberic(); 
		// to match pass and confirm pass we have to store in string otherwise if use method directly
		// then it'll generate another password.

		regpage.setPassword(password);
		regpage.setConfirmPassword(password);

		regpage.setPrivacyPolicy();
		regpage.clickContinue();

		

		logger.info("Validationg expected message.");
		String confmsg = regpage.getConfirmationMsg();
		if(confmsg.equals("Your Account Has Been Created!")){
			Assert.assertTrue(true);
		}else {
			logger.error("Test failed...");
			logger.debug("debug logs..");
			Assert.assertTrue(false);
		}
		// Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}catch(Exception e){
			
			Assert.fail();
		}


		logger.info("*****Finished the TC001_Account_Registration*****");

	}



}
