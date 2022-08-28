package Pakage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Notequals {
	@Test
	public void Tc2()
	{
		Reporter.log("Running Tc2",true);
		String s="Ashwini";
		String s1="Ashwinii";
		Assert.assertNotEquals(s,s1);
	}

}
