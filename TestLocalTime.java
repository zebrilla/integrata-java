import java.time.LocalTime;

public class TestLocalTime {

	public static void main(String[] args) {
		System.out.println("Zeit");
		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime als String="+lt.toString());
		System.out.println("Stunde="+lt.getHour());
		System.out.println("Minute="+lt.getMinute());
		System.out.println("Stunde="+lt.getSecond());
		long nano = lt.toNanoOfDay();
		System.out.println("Nanosecond of Day="+nano);
	}
}

