package Pakage;

import org.testng.Assert;
import org.testng.Reporter;

public class False {
	
	public void Tc2()
	{
		Reporter.log("Running Tc2",true);
		boolean s1=false;
		Assert.assertFalse(s1);
	}

}
