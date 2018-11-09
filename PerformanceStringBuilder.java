import java.time.LocalTime;

public class PerformanceStringBuilder {
	public static void main(String[] args) {
		System.out.println("Performance StringBuilder");	// StringBuilder ist nicht synchronisiert
		
		LocalTime lt = LocalTime.now();
		long nano1 = lt.toNanoOfDay();
		
		StringBuilder s = new StringBuilder();
		for (int i=0;i<10000000;i++)				// zehn Millionen
			s.append("A");
		
		lt = LocalTime.now();
		long nano2 = lt.toNanoOfDay();
		
		long duration = nano2-nano1;
		System.out.println("Duration="+duration/1000000+" Millisekunden");

		
	}
}
