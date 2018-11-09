import java.time.LocalDate;

public class TestLocalDate {

	public static void main(String[] args) {
		System.out.println("Zeit");
		LocalDate ld = LocalDate.now();
		System.out.println("LocalTime als String="+ld.toString());
		System.out.println("Jahr="+ld.getYear());
		System.out.println("Monat="+ld.getMonth());
		System.out.println("Tag="+ld.getDayOfMonth());
	}
}

