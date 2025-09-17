package learn_testng.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnlyTest {

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
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("this method will execute only once before all test executed in current class where its is implemented");
		System.out.println("@BeforeTest execution ended");
		System.err.println(" ");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("this method will execute only once after all test executed in current class where its is implemented");
		System.out.println("@AfterTest execution ended");
		System.err.println(" ");
	}
}
