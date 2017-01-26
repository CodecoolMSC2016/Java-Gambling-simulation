import java.util.*;
public class Logger {

	public void log(String type, String message) {
		Date exactTime = Calendar.getInstance().getTime();
		System.out.println(exactTime + type + message);
	}
}
