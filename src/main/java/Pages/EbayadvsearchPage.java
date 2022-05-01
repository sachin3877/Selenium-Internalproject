package Pages;

import org.openqa.selenium.WebDriver;

import Elements.Ebayadvsearch;

public class EbayadvsearchPage {
	WebDriver driver;
	Ebayadvsearch ebayadvsearch;
	String URI = "https://www.ebay.com/sch/ebayadvsearch";

	public EbayadvsearchPage(WebDriver driver) {
		this.driver = driver;
		ebayadvsearch = new Ebayadvsearch(driver);
	}

	// this method will enter the specified string in search Box
	public void serach(String str) {
		ebayadvsearch.search.sendKeys(str);
	}

	// this method will enter the specified string in exclude Box
	public void exclude(String str) {
		ebayadvsearch.exclude.sendKeys(str);
	}

	// this method will enter the specified string in minimumPrize Box
	public void minimumPrize(int i) {
		String s = String.valueOf(i);
		ebayadvsearch.MinimumPrize.sendKeys(s);
	}

	// this method will enter the specified string in maximumPrize Box
	public void maximumPrize(int i) {
		String s = String.valueOf(i);
		ebayadvsearch.MaximinuPrize.sendKeys(s);
	}

	// this method will click on the searchbutton
	public void srhButton() {
		ebayadvsearch.srhBtn.click();
	}

	public void URI() {
		driver.get(URI);
	}

}
