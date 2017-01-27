import java.util.*;
import java.text.*;

public class Logger {

	public void log(String message, Result result) {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		System.out.println(reportDate + " " +message);
		Map<Integer,Integer> valOcc = result.getValOcc();
		/*for(Map.Entry<Integer,Integer> entry: valOcc.entrySet()){
			System.out.println(entry.getKey().toString() + " " + entry.getValue().toString());
		}*/
		System.out.println("You should bet: " + result.adjMaxot());
	}
	
}
