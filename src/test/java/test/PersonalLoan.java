package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalLoan {



	@BeforeClass
	public void deleteCookiesBeforePL() {
		System.out.println("This testcase deletes cookies before staring the personal loan testacse execution");

	}

	@BeforeMethod(groups = { "Smoke" })
	public void personalLoanMobileLogin() {
		System.out.println("I am in personal Loan Mobile Login testCase");
	}

	@AfterMethod(groups = { "Smoke" })
	public void personalLoanMobileLogout() {

		System.out.println("I am in personal Loan Mobile logout testCase");
	}

	@Test(groups = { "Smoke" })
	public void PersonalTest1() {
		System.out.println("PL testcase 1");
	}

	@Test
	public void PersonalTest2() {
		System.out.println("PL testcase 2");
	}

	@Test(groups = { "Smoke" })
	public void PersonalTest3() {
		System.out.println("PL testcase 3");
	}

	@AfterClass
	public void deleteCookiesAfterPL() {
		System.out.println("This testcase deletes cookies after running the personal loan testacse");

	}

	@AfterTest
	public void deleteHistoryAfterPL() {
		System.out.println("This testcase deletes History After PL");
	}

	/*
	 * @Test public void personalLoanWebLogin() {
	 * 
	 * System.out.println("I am in personal Loan Web Login testCase"); }
	 */

}
