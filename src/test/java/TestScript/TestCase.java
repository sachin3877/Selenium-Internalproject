package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class TestCase extends BaseClass {
	@Test
	public void testCase1() {
		appLib().registerPage().getURL();
		
		appLib().registerPage().clickRegister();

		appLib().registerPage().firstName("sachin");

		appLib().registerPage().lastName("N");

		appLib().registerPage().phone("9908561200");

		appLib().registerPage().userName("sachin@gmail.com");

		appLib().registerPage().address("Bangalore");

		appLib().registerPage().city("ashoknagar");

		appLib().registerPage().state("karnataka");

		appLib().registerPage().postalCode("558964");

		appLib().registerPage().country("india");

		appLib().registerPage().email("sachin_N");

		appLib().registerPage().password("Qwerty");

		appLib().registerPage().confirmPassword("Qwerty");

		appLib().registerPage().submit();

		String actualTitle = appLib().flowLib_().gettitle();

		String expectedTitle = "Register: Mercury Tours";

		Assert.assertEquals(expectedTitle, actualTitle);
	
	}

}
