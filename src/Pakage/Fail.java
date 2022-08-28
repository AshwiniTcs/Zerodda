package Pakage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fail {
	@Test
	public void Tc3(){
		Reporter.log("Running Tc3",true);
		Assert.fail();                   // verification
		System.out.println("I am After the Fail"); //verification2
	}
	@Test
	public void Tc4()
	{
		Reporter.log("Running Tc4",true);
	}
}
