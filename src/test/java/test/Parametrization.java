package test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {

	@Parameters({ "url" })
	@Test
	public void launchURL(@Optional("www.CommonUrl.in") String urlval) {
		System.out.println("Enter URL : " + urlval);
	}

	@Parameters({ "username", "password" })
	@Test(dependsOnMethods = "launchURL")
	public void amazonLogin(@Optional("Common User") String usernameval,
			@Optional("Common Passow0rd") String passwordval) {
		System.out.println("Enter username : " + usernameval);
		System.out.println("Enter password : " + passwordval);

	}

	@Parameters({ "product" })
	@Test(dependsOnMethods = "amazonLogin")
	public void searchProduct(@Optional("commonProduct") String productName) {
		System.out.println("search product: " + productName);

	}

}
