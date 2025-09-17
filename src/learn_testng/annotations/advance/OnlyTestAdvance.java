package learn_testng.annotations.advance;

import org.testng.annotations.Test;

public class OnlyTestAdvance {

	@Test
	public void test3() {
		System.out.println("@Test1 execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName()+" annotation is @Test1");
		System.out.println("Real test scenario goes into @Test this block");
		System.out.println("@Test1 execution ended");
		System.err.println(" ");
	}
	
	@Test
	public void test4() {
		System.out.println("@Test1 execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName()+" annotation is @Test1");
		System.out.println("Real test scenario goes into @Test this block");
		System.out.println("@Test1 execution ended");
		System.err.println(" ");
	}
}
