package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.BaseClass;


public class TestCase4 extends BaseClass {

	@Test
	public void Test4() {
		appLib().EbayadvsearchPage().URI();

		appLib().EbayadvsearchPage().serach("iphone");

		appLib().EbayadvsearchPage().exclude("6");

		appLib().EbayadvsearchPage().minimumPrize(5);

		appLib().EbayadvsearchPage().maximumPrize(50);

		appLib().EbayadvsearchPage().srhButton();
		
		String actulTitle=appLib().flowLib_().gettitle();
		
		String ExpectTitle ="iphone -6 for sale: Search Result | eBay";
		
		Assert.assertEquals(ExpectTitle, actulTitle);
	}

}
