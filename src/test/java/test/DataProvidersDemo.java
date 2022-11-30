package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersDemo {

	@Test(dataProvider = "customerData")
	public void checkLoanCreditEligible(String userName, String password, int CIBILscore) {

		System.out.println(userName);
		System.out.println(password);
		System.out.println(CIBILscore);
		System.out.println("Check Loan Eligibility");

	}

	@DataProvider
	public Object[][] customerData() {
		Object[][] customer = new Object[3][3];

		customer[0][0] = "One";
		customer[0][1] = "Password1";
		customer[0][2] = 750;

		customer[1][0] = "Two";
		customer[1][1] = "Password2";
		customer[1][2] = 730;

		customer[2][0] = "Three";
		customer[2][1] = "Password3";
		customer[2][2] = 700;

		return customer;

	}

}
