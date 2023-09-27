package GeneralUtilities;

import java.util.Date;
import java.util.Random;

public class JavaUtilities 
{
	/**
	 * This method is used to get the random number
	 * @return
	 */
	public int getRandomNumber()
	{
		Random ran = new Random();
		int randNum = ran.nextInt(100);
		return randNum;
	}
	/**
	 * This method is used to get the date in as it is format no change
	 * @return
	 */
	public String getSystemDate()
	{
		Date date = new Date();
		return date.toString();
	}
	/**
	 * This method is used to get the date according to our requirement format
	 */
	public void systemDaeInFormat()
	{
		Date dateTime = new Date(0);
		String[] d = dateTime.toString().split(" ");
		String day = d[0];
		String month = d[1];
		String date = d[2];
		String year = d[5];
		String finalFormat = day+" "+month+" "+date+" "+year+" ";
	}
}
