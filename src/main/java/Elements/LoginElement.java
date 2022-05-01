package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElement {
	WebDriver driver;
	@FindBy (css="input[name='userName']") public WebElement username;
	
	@FindBy (css="input[name='password']") public WebElement password;
	
	@FindBy (css="input[value='Submit']") public WebElement Submit;
	
	 public LoginElement(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
}
