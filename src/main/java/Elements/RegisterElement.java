package Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterElement {
	WebDriver driver;
	@FindBy(css = "input[name='firstName']")
	public WebElement firstName;

	@FindBy(css = "input[name='lastName']")
	public WebElement lastName;

	@FindBy(css = "input[name='phone']")
	public WebElement phone;

	@FindBy(css = "#userName")
	public WebElement userName;

	@FindBy(css = "input[name='address1']")
	public WebElement address1;

	@FindBy(css = "input[name='city']")
	public WebElement city;

	@FindBy(css = "input[name='state']")
	public WebElement state;

	@FindBy(css = "input[name='postalCode']")
	public WebElement postalCode;

	@FindBy(css = "select>option")
	public List<WebElement> country;

	@FindBy(css = "#email")
	public WebElement email;

	@FindBy(css = "input[name='password']")
	public WebElement password;

	@FindBy(css = "input[name='confirmPassword']")
	public WebElement confirmPassword;
	
	@FindBy (css="input[name='submit']")
	public WebElement submit;

	public RegisterElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
