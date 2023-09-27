package NewPracticePackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import GeneralUtilities.BaseClass;
import GeneralUtilities.DatabaseUtility;
import GeneralUtilities.ExcelUtility;
import GeneralUtilities.FileUtility;
import GeneralUtilities.JavaUtilities;
import GeneralUtilities.WebDriverUtilities;

public class LogInUsingTestNG 
{
@Test
public void logIn() throws Throwable
{
	BaseClass bcut = new BaseClass();
	DatabaseUtility dbut=new DatabaseUtility();
	ExcelUtility exut = new ExcelUtility();
	FileUtility flut = new FileUtility();
	JavaUtilities jaut = new JavaUtilities();
	WebDriverUtilities  wdut = new WebDriverUtilities();
	
	//Fetching the common data from the property file
	String BROWSER = flut.getPropertyKeyValue("browser");
	String URL = flut.getPropertyKeyValue("url");
	String USERNAME = flut.getPropertyKeyValue("username");
	String PASSWORD = flut.getPropertyKeyValue("password");
	System.out.println(BROWSER);
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
}
}
