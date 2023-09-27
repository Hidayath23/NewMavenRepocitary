package GeneralUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.HRMProject.Object.HomePage;
import com.HRMProject.Object.LogIn_page;
import com.HRMProject_GenerialUtilities.DatabaseUtility;
import com.HRMProject_GenerialUtilities.ExcelUtility;
import com.HRMProject_GenerialUtilities.FileUtility;
import com.HRMProject_GenerialUtilities.JavaUtility;
import com.HRMProject_GenerialUtilities.WebDriverUtilities;

public class BaseClass
{
	public DatabaseUtility DliB  = new  DatabaseUtility();
	public ExcelUtility ExlB = new ExcelUtility();
	public FileUtility FliB = new FileUtility();
	public JavaUtility JliB = new JavaUtility();
	public WebDriverUtilities WliB= new WebDriverUtilities();	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite
	public void configBS() throws Throwable
	{

//		DliB.connectToDB();
		System.out.println("<-----Connecting to the DB is completed------>");
	}
	@Parameters("BROWSER")
	
	@BeforeClass(alwaysRun = true)
	public void configBC(String BROWSER) throws Throwable
	{
		//String BROWSER = FliB.readDataFromPropertyFile("browser");
		if(BROWSER.equals("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("<----Driver conneted to Chrome-------->");
		}
		else
		{
			System.out.println("<----- Chrome is not available so not able to connect------>");
		}
		
		sdriver=driver;
		System.out.println("<------- Launch the browser--------->");
	}
	@BeforeMethod
	public void configBM() throws Throwable
	{
		String URL = FliB.readDataFromPropertyFile("url");
		String USERNAME = FliB.readDataFromPropertyFile("username");
		String PASSWORD = FliB.readDataFromPropertyFile("password");
		driver.get(URL);
		WliB.implicitlyWait(driver, 10);
		
		LogIn_page log = new LogIn_page(driver);
		log.login(USERNAME, PASSWORD);
	}
	@AfterMethod
	public void configAM()
	{
		HomePage hm = new HomePage(driver);
		hm.getPowerOffDropDown();
		hm.getPowerOffButton();
	}
	@AfterMethod
	public void configAC()
	{
		driver.quit();
		System.out.println("Driver closed successfully");
	}
	@AfterSuite
	public void configAS() throws Throwable
	{
//		DliB.closeDB();
		System.out.println(" disconnecting DB ");
	}
}
