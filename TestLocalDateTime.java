import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDateTime {

	public static void main(String[] args) {
		System.out.println("Zeit");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime="+ldt.toString());
		LocalDate ld = ldt.toLocalDate();
		System.out.println("LocalDate="+ld.toString());
		LocalTime lt = ldt.toLocalTime();
		System.out.println("LocalTime="+lt.toString());
		System.out.println("Jahr="+ldt.getYear());
		System.out.println("Monat="+ldt.getMonth());
		System.out.println("Monat="+ldt.getMonthValue());
		System.out.println("Tag="+ldt.getDayOfMonth());
		System.out.println("Stunde="+ldt.getHour());
		System.out.println("Minute="+ldt.getMinute());
		System.out.println("Stunde="+ldt.getSecond());
		
		long nano = lt.toNanoOfDay();
		System.out.println("Nanosecond of Day="+nano);
		
	}
}


