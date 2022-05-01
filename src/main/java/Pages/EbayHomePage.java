package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Elements.EbayHome;

public class EbayHomePage {

	WebDriver driver;
	EbayHome ebayHome;
	String url = "https://www.ebay.com/";

	public EbayHomePage(WebDriver driver) {
		this.driver = driver;
		ebayHome = new EbayHome(driver);
	}

	// this method will click on the search button
	public void search(String str) {
		ebayHome.search.sendKeys(str);
	}

	// this method will select the specified category
	public void category(String str) {
		List<WebElement> cat = ebayHome.category;
		for (WebElement cate : cat) {
			if (cate.getText().trim().equalsIgnoreCase(str)) {
				cate.click();
			}
		}
	}

	// this method will click on the searchButton
	public void srhButton() {
		ebayHome.srhButton.click();
	}

	public void getURL() {
		driver.get(url);
	}

}
