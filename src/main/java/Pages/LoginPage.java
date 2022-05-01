package Pages;

import org.openqa.selenium.WebDriver;

import Elements.LoginElement;

public class LoginPage {

	String URl = "https://demo.guru99.com/test/newtours/login.php";
	WebDriver driver;
	LoginElement loginElement;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		loginElement = new LoginElement(driver);
	}

	// this method will enter the specified string in userName Box
	public void userName(String str) {
		loginElement.username.sendKeys(str);
	}

	// this method will enter the specified string in password Box
	public void password(String str) {
		loginElement.password.sendKeys(str);
	}

	// this methid will click on submit button
	public void submit() {
		loginElement.Submit.click();
	}

	public void URI() {
		driver.get(URl);
	}
}
