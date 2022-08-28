package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_using_class {
	@Test
	public void Tc1()
	{
		Reporter.log("Running tc1",true);
	}
	@Test
	public void Tc2()
	{
		Reporter.log("Running Tc2",true);
	}
	@Test(enabled=false)
	public void Tc3()
	{
		Reporter.log("Running Tc3",true);
	}
	

}
