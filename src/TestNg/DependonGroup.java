package TestNg;

import org.testng.annotations.Test;

public class DependonGroup {
	@Test
	public void Test1() {

	}

	@Test (dependsOnMethods={"Test1"})
	public void Test2() {

	}

	@Test (dependsOnMethods={"Test2"})
	public void Test3() {

	}

}
