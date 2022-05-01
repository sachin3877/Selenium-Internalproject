package Lib;

import org.openqa.selenium.WebDriver;

public class flowLib {
	WebDriver driver;
	
	public flowLib(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// this method will return the URL of the page 
	public void getUrl(String url)
	{
		this.driver.get(url);
	}
	// this method will return the title of the page
	public String gettitle()
	{
		return this.driver.getTitle();
	}
	
	// this method will return the URL of the page
	public String getCurrentURl()
	{
		return this.driver.getCurrentUrl();
	}

}