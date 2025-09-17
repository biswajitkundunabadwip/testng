package learn_testng_groups;

import org.testng.annotations.Test;

public class HomeLoanApplications {

	@Test(groups = {"HomeLoan","mobile"})
	public void mobileHomeLoanLogin() {
		System.out.println("calling from : "+this.getClass().getName());
		System.out.println("calling method name: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test(groups = {"HomeLoan","netBanking"})
	public void netBankingHomeLoanLogin() {
		System.out.println("calling from : "+this.getClass().getName());
		System.out.println("calling method name: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
