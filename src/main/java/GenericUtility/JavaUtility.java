package GenericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method will generate new random number
	 * @return
	 */
	public int getRandomNumber()
	{
		Random r=new Random();
		int value = r.nextInt(1000);
		return value;
	}
	public String getSystemDate()
	{
		Date d=new Date();
		String value = d.toString();
		return value;
	}
	public String getSystemdateFormate()
	{
		Date d=new Date();
		String[] dArr = d.toString().split(" ");
		
		String date=dArr[2];
		String month=dArr[1];
		String year=dArr[5];
		String time=dArr[3].replace(":","-");
		String dateInFormat=date+month+year+time;
		return dateInFormat;
	}


}
