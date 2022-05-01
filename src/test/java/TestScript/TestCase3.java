package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.BaseClass;


public class TestCase3 extends BaseClass{
	
	@Test
	public void Test3()
	{
		appLib().ebayHomePage().getURL();
		
		appLib().ebayHomePage().search("Doll");
		
		appLib().ebayHomePage().category("Baby");
		
		appLib().ebayHomePage().srhButton();
		
		String actulTitle=appLib().flowLib_().gettitle();
		
		String ExpectedTitle="doll in Baby: Search Result | eBay";
		
		Assert.assertEquals(ExpectedTitle, actulTitle);
	}

}
