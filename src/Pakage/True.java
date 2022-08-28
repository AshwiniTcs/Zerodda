package Pakage;

import org.testng.Assert;
import org.testng.Reporter;

public class True {

	public void Tc1()

{
		Reporter.log("Running Tc1",true );
		boolean s=true;
		Assert.assertTrue(s);
		
}
}
