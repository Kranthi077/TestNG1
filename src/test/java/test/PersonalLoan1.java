package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalLoan1 {

	@BeforeTest
	public void deleteHistoryBeforePL() {
		System.out.println("This testcase deletes History Before PL");
	}

	@Test
	public void printdata() {

		System.out.println("Good Morning");
	}

	@Test
	public void testcase2() {
		System.out.println("Hello World");
	}

	@Test
	public void testcase3() {
		System.out.println("3rd testcase");

	}

	@AfterSuite
	public void generateExecutionResults() {

		System.out.println("This generates reports");
	}
}
