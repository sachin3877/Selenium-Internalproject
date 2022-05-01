package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Elements.RegisterElement;

public class RegisterPage {

	WebDriver driver;
	RegisterElement registerElement;
	String URL = "https://demo.guru99.com/test/newtours/";

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		registerElement = new RegisterElement(driver);
	}

	// this method will click REGISTER link
	public void clickRegister() {
		driver.findElement(By.linkText("REGISTER")).click();
	}

	// this method will enter the specified string in firstName Box
	public void firstName(String str) {
		registerElement.firstName.sendKeys(str);
	}

	// this method will enter the specified string in lastName Box
	public void lastName(String str) {
		registerElement.lastName.sendKeys(str);
	}

	// this method will enter the specified string in phone Box
	public void phone(String str) {
		registerElement.phone.sendKeys(str);
	}

	// this method will enter the specified string in email Box
	public void email(String str) {
		registerElement.email.sendKeys(str);
	}

	// this method will enter the specified string in address Box
	public void address(String str) {
		registerElement.address1.sendKeys(str);
	}

	// this method will enter the specified string in city Box
	public void city(String str) {
		registerElement.city.sendKeys(str);
	}

	// this method will enter the specified string in state Box
	public void state(String str) {
		registerElement.state.sendKeys(str);
	}

	// this method will enter the specified string in postalCode Box
	public void postalCode(String str) {
		registerElement.postalCode.sendKeys(str);
	}

	// this method will enter the specified string in country Box
	public void country(String str) {
		List<WebElement> country1 = registerElement.country;

		for (WebElement count : country1) {
			if (count.getText().trim().equalsIgnoreCase(str)) {
				count.click();
			}
		}
	}

	// this method will enter the specified string in userName Box
	public void userName(String str) {
		registerElement.userName.sendKeys(str);
	}

	// this method will enter the specified string in password Box
	public void password(String str) {
		registerElement.password.sendKeys(str);
	}

	// this method will enter the specified string in confirmPassword Box
	public void confirmPassword(String str) {
		registerElement.confirmPassword.sendKeys(str);
	}

	// this method will click on the submit button
	public void submit() {
		registerElement.submit.click();
	}

	public void getURL() {
		driver.get(URL);
	}
}
