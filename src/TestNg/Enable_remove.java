package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable_remove {
	@Test(priority=1)
	public void Tc()
	{
		Reporter.log("Hii",true);
	}
	@Test(enabled=false)
	public void Tc1()
	{
		Reporter.log("Hii Hello",true);
	}

}
