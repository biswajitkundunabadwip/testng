package learn_testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {

	
	@Test
	@Parameters({"status","env"})
	public void test1(String status,String env) {
		System.out.println("Status code is : "+status);
		System.out.println("Environment is : "+env);
	}
}
