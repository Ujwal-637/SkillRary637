package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class contains reusable java methods
 * @author Admin
 *
 */
public class JavaUtility {
	
	/**
	 * This methods generates random number within the limit
	 * @param limit
	 * @return
	 */
	
	public int generateRandomNum(int limit) {
		Random random = new Random();
		int randomNum = random.nextInt(limit);
		return randomNum;
	}
	
	/**
	 * This method returns current time in specified format
	 * 
	 * @return
	 */
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy_hh_mm_sss");
		String currentTime = sdf.format(date);
		return currentTime;
	}

}
