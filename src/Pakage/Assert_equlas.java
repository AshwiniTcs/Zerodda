package Pakage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equlas {
	@Test
	public void Tc1()
	{
		Reporter.log("Running Tc1",true);
		String exp="Anky";
		String acp="Anky";
		Assert.assertEquals(exp,acp);
	}

}
