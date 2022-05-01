package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebayadvsearch {
	
	WebDriver driver;
	
	@FindBy (css="input#_nkw") public WebElement search;
	
	@FindBy (css="input#_ex_kw") public WebElement exclude;
	
	@FindBy (css="input[title='Enter minimum price range value']") public WebElement MinimumPrize;
	
	@FindBy (css="input[title='Enter maximum price range value']") public WebElement MaximinuPrize;

	@FindBy (css="button#searchBtnLowerLnk") public WebElement srhBtn;
	
	public Ebayadvsearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
