package AshwiniTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng {
	@Test
	public void TC()
	{
		Reporter.log("I am fine",true);
	}

}