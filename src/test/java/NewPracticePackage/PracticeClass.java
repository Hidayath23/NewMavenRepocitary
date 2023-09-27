package NewPracticePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GeneralUtilities.WebDriverUtilities;

public class PracticeClass extends WebDriverUtilities
{
	@Test
	public void practice() throws Throwable 
	{
		FileInputStream file = new FileInputStream("./src/test/resources/NewComponents.properties");
		Properties prop = new Properties();
		prop.load(file);
		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		WebDriverUtilities webd = new WebDriverUtilities();
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		webd.maximizeTheBrowser(driver);
	    driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
	}

}
