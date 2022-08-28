package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fail_tc_Assert {
 @Test
 public void TC1() {
	 Reporter.log("Running tc1",true);
 }
 @Test
 public void Tc2()
 {
	 Reporter.log("Running tc2",true);
 }
 @Test
 public void Tc3()
 {
	 Reporter.log("Running tc3",true);
	 Assert.fail();
 }
}
