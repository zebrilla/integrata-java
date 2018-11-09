import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zeitzonen {

	public static void main(String[] args) {
		ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
		ZoneId berlin = ZoneId.of("Europe/Berlin");
		ZoneId tokio = ZoneId.of("Asia/Tokyo");
		ZoneId sydney = ZoneId.of("Australia/Sydney");
		
		//LocalDateTime datumZeit = LocalDateTime.of(2016, 10, 24, 12, 0);
		LocalDateTime datumZeit = LocalDateTime.now();
		
		ZonedDateTime berlinDatumZeit = ZonedDateTime.of(datumZeit, berlin);
		ZonedDateTime losAngelesDatumZeit = berlinDatumZeit.withZoneSameInstant(losAngeles);
		ZonedDateTime tokioDatumZeit = berlinDatumZeit.withZoneSameInstant(tokio);
		ZonedDateTime sydneyDatumZeit = berlinDatumZeit.withZoneSameInstant(sydney);
		
		System.out.println(berlinDatumZeit.toString());
		System.out.println(losAngelesDatumZeit.toString());
		System.out.println(tokioDatumZeit.toString());
		System.out.println(sydneyDatumZeit.toString());
	}

}
