package learn_testng.depend.on.method;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(dependsOnMethods = "test2")
	public void test1() {
		System.out.println("Last Executed method name is : "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test
	public void test2() {
		System.out.println("First Executed method name is : "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
