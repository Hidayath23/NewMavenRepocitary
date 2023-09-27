package GeneralUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility
{
	Connection con=null;
	
	/**
	 * This method is used to connect with the database
	 * @throws Throwable
	 */
	public void connectToDB() throws Throwable
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection("");
	}
	/**
	 * This method is used to execute query and get the data
	 * @param query
	 * @param columnNo
	 * @param ExpDate
	 * @return
	 * @throws Throwable
	 */
	public String executeQueryAndGetData(String query,int columnNo, String ExpDate) throws Throwable
	{
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag = false;
		while(result.next())
		{
			String data = result.getString(columnNo);
			if(data.equalsIgnoreCase(ExpDate));
			{
				flag = true;
				break;
			}
		}
		if(flag=true)

		{
			System.out.println("Data is verified");
			return ExpDate;
		}
		else
		{
			System.out.println("DB is not there");
			return "";
		}

	}
	/**
	 * This method is used to close the DB
	 * @throws Throwable
	 */
	public void closeDB() throws Throwable
	{
		con.close();
	}

}
