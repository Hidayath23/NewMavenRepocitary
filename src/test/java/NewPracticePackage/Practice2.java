package NewPracticePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.jdbc.Driver;


public class Practice2
{

	public static void main(String[] args) throws Throwable 
	{
		Driver driver = new Driver();
				DriverManager.registerDriver(driver);
		Connection con=DriverManager.getConnection("");
		Statement state = con.createStatement(0, 0);
		WebDriver driver1 = new ChromeDriver();
				driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//driver1.navigate().f
	}

}
