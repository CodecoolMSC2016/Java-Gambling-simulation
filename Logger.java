import java.util.*;
import java.text.*;

public class Logger {

	public void log(String type, String message) {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		System.out.println(reportDate);
	}
}
