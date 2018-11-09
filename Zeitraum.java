import java.time.LocalDate;
import java.time.Period;

import java.time.LocalTime;
import java.time.Duration;

public class Zeitraum {
	public static void main(String[] args) {
		LocalDate datum1 = LocalDate.of(2016,10,25);
		LocalDate datum2 = LocalDate.of(2011,5,27);
		Period period = Period.between(datum2, datum1);
		int jahre = period.getYears();
		int monate = period.getMonths();
		int tage = period.getDays();
		System.out.println("Datumsdifferenz: " + jahre + " Jahre " + monate + " Monate " + tage + " Tage");

		LocalTime zeit1 = LocalTime.of(12,17,30);
		LocalTime zeit2 = LocalTime.of(11,15,27);
		Duration dauer = Duration.between(zeit2, zeit1);
		long stunden = dauer.toHours();
		long minuten = dauer.toMinutes();
		long sekunden = dauer.getSeconds();
		//long millisekunden = dauer.toMillis();
		//long sekunden = millisekunden / 1000;
		System.out.println("Zeitdifferenz: " + stunden + " Stunden " + minuten%60 + " Minuten " + sekunden%60 + " Sekunden");
	}
}
