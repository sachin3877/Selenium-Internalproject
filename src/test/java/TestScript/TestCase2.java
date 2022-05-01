package TestScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class TestCase2 extends BaseClass {
	@Test(dataProvider="data12")
	public void test(String UserName,String Password)
	{
	appLib().LoginPage().URI();
		
	appLib().LoginPage().userName(UserName);	
	
	appLib().LoginPage().password(Password);
	
	appLib().LoginPage().submit();
		
	}
	
	@DataProvider(name="data12")
	public Object[][] Data() throws IOException
	{
		DataFormatter format = new DataFormatter();
		FileInputStream fil=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Resource\\TestData.xlsx");
		XSSFWorkbook xs=new XSSFWorkbook(fil);
		XSSFSheet sheet=xs.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int columcount=row.getLastCellNum();
		Object data[][] = new Object[rowcount - 1][columcount];
		for(int i=0;i<rowcount-1;i++)
		{
			row=sheet.getRow(i+1);
			for(int j=0;j<columcount;j++)
			{
				XSSFCell cell = row.getCell(j);
				data[i][j] = format.formatCellValue(cell);	
			}
			
		}
		return data;
		
	}

}
