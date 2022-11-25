package test;

import org.testng.annotations.Test;

public class AdditionalTestCases {

	@Test(priority = 0)
	public void boy() {
		System.out.println("boy");
	}

	// if no priority is given, it is understood as priority 0 by testng
	@Test(priority = -1)
	public void appler() {
		System.out.println("appler");
	}

	// when there is exact match between first set of alphabets of two or more
	// methods then numbers will take highest priority
	// and alphabetical order will take next priority
	@Test(enabled = false)
	public void apple1() {
		System.out.println("a1pple1");
	}

	@Test(timeOut = 20000) // before failing any step/line of code inside this testcase, wait for 20 secs
	public void appleb() {
		System.out.println("appleb");
	}

	@Test(priority = (int) 1.3)
	public void dog() {
		System.out.println("dog");
	}

	@Test(priority = 1)
	public void cat() {
		System.out.println("cat");
	}

	@Test
	public void ProductAdded() {
		System.out.println("ProductAdded");
	}

	@Test(dependsOnMethods = "ProductAdded")
	public void CheckProduct() {
		System.out.println("CheckProduct");
	}

}
