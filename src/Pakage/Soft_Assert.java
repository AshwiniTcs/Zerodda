package Pakage;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	public void Tc1()
	{
		Reporter.log("Running Tc1",true);
		String S1="Hii";
		String S2="Bye";
		//create the object of SoftAssert
		
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(S1, S2);//varification
		System.out.println("I am after failed vaerification");
		//mandatory
		soft.assertAll();
		
		
	}
	@Test
	public void Tc2()
	{
		Reporter.log("hii hello");
	}
	
	
	
	
	
	
	
	

}
