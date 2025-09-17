package learn_testng_groups;

import org.testng.annotations.Test;

public class PersonalLoanApplications {

	
	@Test(groups = {"PersonalLoan","mobile"})
	public void mobilePersonalLoanLogin() {
		System.out.println("calling from : "+this.getClass().getName());
		System.out.println("calling method name: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test(groups = {"PersonalLoan","netBanking"})
	public void netBankingPersonalLoanLogin() {
		System.out.println("calling from : "+this.getClass().getName());
		System.out.println("calling method name: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
