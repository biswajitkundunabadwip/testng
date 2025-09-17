package learn_testng.annotations.advance;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClasslevelAnnotationAdvance {

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("this method will execute only once before all test executed");
		System.out.println("@BeforeClass execution ended");
		System.out.println(" ");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName() );
		System.out.println("this method will execute only once after all test executed");
		System.out.println("@AfterClass execution ended");
		System.out.println(" ");
	}
	
	@Test
	public void test1() {
		System.out.println("@Test1 execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName()+" annotation is @Test1");
		System.out.println("Real test scenario goes into @Test this block");
		System.out.println("@Test1 execution ended");
		System.out.println(" ");
	}
	
	@Test
	public void test2() {
		System.out.println(" ");
		System.out.println("@Test1 execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName()+" annotation is @Test1");
		System.out.println("Real test scenario goes into @Test this block");
		System.out.println("@Test1 execution ended");
		System.out.println(" ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("This block will execute before each @Test1");
		System.err.println(" ");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@afterMethod execution started");
		System.out.println("method executing is : "+Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("This block will execute after each @Test1");
		System.out.println("@afterMethod execution end");
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
