package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoan {

	@BeforeSuite
	public void setManagerAccess() {

		System.out.println("THis sets the manager level access before starting any testcase");
	}

	@Test(groups = { "Smoke" })
	public void HomeLoanMobileLogin() {

		System.out.println("I am in Home Loan Mobile Login testCase");
	}

	@Test
	public void HomeLoanWebLogin() {

		System.out.println("I am in Home Loan Web Login testCase");
	}

	@Test
	public void HomeLoanWebLogout() {

		System.out.println("I am in Home Loan Web Logout testCase");
	}

	@Test(groups = { "Smoke" })
	public void HomeLoanMobileLogout() {

		System.out.println("I am in Home Loan Web Logout testCase");
	}

	@Test
	public void testcase4() {

		System.out.println("I am in testcase 4");
	}

	@Test
	public void testcase5() {

		int a = 1 / 0;
		System.out.println("I am in testcase 5");
	}

}
