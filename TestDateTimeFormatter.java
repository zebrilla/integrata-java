import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class TestDateTimeFormatter {

	public static void main(String[] args) {
		System.out.println("DatumZeitFormatierer");
		LocalDateTime datumZeit = LocalDateTime.now();
		System.out.println(datumZeit .toString());
	
		String isoWeekDate = datumZeit.format(DateTimeFormatter.ISO_WEEK_DATE);
		System.out.println(isoWeekDate);
		
		String isoDateTime = datumZeit.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(isoDateTime);
		
		String isoDate = datumZeit.format(DateTimeFormatter.ISO_DATE);
		System.out.println(isoDate);
		
		String isoTime = datumZeit.format(DateTimeFormatter.ISO_TIME);
		System.out.println(isoTime);
		
		String pattern = datumZeit.format(DateTimeFormatter.ofPattern("dd/MMMM/yyy"));
		System.out.println(pattern);
		
		String deutsch1 = datumZeit.format(DateTimeFormatter.ofPattern("dd.MM.yyy", new Locale("de")));
		System.out.println(deutsch1);
		
		String deutsch2 = datumZeit.format(DateTimeFormatter.ofPattern("dd. MMMM yyy", new Locale("de")));
		System.out.println(deutsch2);
	}
	
}
