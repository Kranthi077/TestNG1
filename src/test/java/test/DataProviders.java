package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviders {

	@Parameters({ "url" })
	@Test
	public void launchURL(String urlval) {
		System.out.println("Enter URL : " + urlval);
	}

	@Parameters({ "username", "password" })
	@Test(dependsOnMethods = "launchURL")
	public void amazonLogin(String usernameval, String passwordval) {
		System.out.println("Enter username : " + usernameval);
		System.out.println("Enter password : " + passwordval);

	}

	@Parameters({ "product" })
	@Test(dependsOnMethods = "amazonLogin")
	public void searchProduct(String productName) {
		System.out.println("search product: " + productName);

	}

}
