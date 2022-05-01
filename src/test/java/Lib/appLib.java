package Lib;

import org.openqa.selenium.WebDriver;

import Pages.EbayHomePage;
import Pages.EbayadvsearchPage;
import Pages.LoginPage;
import Pages.RegisterPage;

public class appLib {
	WebDriver driver;
	RegisterPage registerPage;
	flowLib FlowLib;
	LoginPage loginPage;
	EbayHomePage ebayHomePage;
	EbayadvsearchPage ebayadvsearchPage;
	public appLib(WebDriver driver)
	{
		this.driver=driver;
		registerPage =new RegisterPage(driver);
		FlowLib = new flowLib(driver);
		loginPage =new LoginPage(driver);
		ebayHomePage=new EbayHomePage(driver);
		ebayadvsearchPage=new EbayadvsearchPage(driver);
	}
	
	//this will return the instance of registerPage
	public RegisterPage registerPage()
	{
		return registerPage;
	}
	//this will return the instance of flowLib_
	public flowLib flowLib_()
	{
		return FlowLib;
	}
	
	//this will return the instance of LoginPage
	public LoginPage LoginPage()
	{
		return loginPage;
	}
	
	//this will return the instance of ebayHomePage
	public EbayHomePage ebayHomePage()
	{
		return ebayHomePage;
	}
	
	//this will return the instance of EbayadvsearchPage
	public EbayadvsearchPage EbayadvsearchPage()
	{
		return ebayadvsearchPage;
	}
}
