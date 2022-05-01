package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Lib.appLib;

public class BaseClass {
	WebDriver driver;
	appLib applib;

	// this method will create the instance of the WebDriver
	@BeforeMethod(alwaysRun = true)
	public void setUp() throws IOException {
		FileInputStream fil = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\Resource\\global.properties");
		Properties prop = new Properties();
		prop.load(fil);
		String Browser = prop.getProperty("browser");

		if (Browser.equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\Resource\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));

		} else if (Browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\src\\test\\Resource\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));

		} else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\Resource\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));

		}
		applib = new appLib(driver);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	public appLib appLib() {
		return applib;
	}

}
