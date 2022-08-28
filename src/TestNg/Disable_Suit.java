package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_Suit {
	@Test
	public void Tc1()
	{
		Reporter.log("Running Tc1",true);
	}
	@Test
	public void Tc2()
	{
		Reporter.log("Running Tc2",true);
	}
	@Test
	public void Tc3()
	{
		Reporter.log("Running Tc3",true);
	}

}
