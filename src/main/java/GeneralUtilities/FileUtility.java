package GeneralUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.HRMProject_GenerialUtilities.IPathConstants;

public class FileUtility
{
 public String getPropertyKeyValue(String key) throws Throwable
 {
	 FileInputStream file = new FileInputStream(IPathConstants.properties);
	 Properties prop = new Properties();
	 prop.load(file);
	 return prop.getProperty(key);
 }
 /**
  * This method is used to read the data from the json file
  * @throws Throwable
  */
 public void jsonFileDataReader() throws Throwable
 {
	 JSONParser par = new JSONParser();
	 Object object = par.parse(IPathConstants.jsonproperties);
	 JSONObject obj = (JSONObject)object;
	 System.out.println("username");
	 System.out.println("password");
	 System.out.println("url");
	 System.out.println("browser");
 }
 /**
  * This method is used to read the data from the property file
  * @param string
  * @return
  * @throws Throwable
  */
	public String readDataFromPropertyFile(String string) throws Throwable
	{
		
		FileInputStream File1= new FileInputStream("./src/test/resources/Components.Properties");
		Properties prop1 = new Properties();
		prop1.load(File1);
		String USERNAME = prop1.getProperty("username");
		String BROWSER = prop1.getProperty("browser");
		String URL = prop1.getProperty("url");
		String PASSWORD = prop1.getProperty("password");
		return string;
		
	}
}

