package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open the browser",true);
	}
	@BeforeMethod
	public void loginpage()
	{
		Reporter.log("login to app",true);
	}
	@Test
	public void verifyuserid()
	{
		Reporter.log("verify the userid",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout the app",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close the browser",true);
	}
}
