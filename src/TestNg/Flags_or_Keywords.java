package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags_or_Keywords {
	@Test(invocationCount=5)
	public void TC()
	{
		Reporter.log("Hiii",true);
	}
	
	
	
	
}
