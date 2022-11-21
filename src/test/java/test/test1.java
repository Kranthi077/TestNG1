package test;

import org.testng.annotations.Test;

public class test1 {

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
		System.out.println("5rd testcase");
		int i = 1 / 0;
	}

}
