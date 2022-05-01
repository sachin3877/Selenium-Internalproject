package Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome {
	
	WebDriver driver;
	
	@FindBy (css="input.gh-tb.ui-autocomplete-input") public WebElement search;
	
	@FindBy (css="select>option") public List<WebElement> category;
	
	@FindBy (css="input.btn.btn-prim.gh-spr") public WebElement srhButton;
	
	public EbayHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}
