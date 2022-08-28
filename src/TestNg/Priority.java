package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=-3)																	
	public void TC1()
	{
		Reporter.log("I am fine",true);
	}
	@Test(priority=0)
	public void Tc2()
	{
		Reporter.log("Good byee",true);
	}
	@Test(priority=1)
	public void Tc3()
	{
		Reporter.log("Hii",true);
	}
	@Test(priority=3)
	public void Tc4()
	{
		Reporter.log("How are you",true);
	}

}
