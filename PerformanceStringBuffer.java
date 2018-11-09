import java.time.LocalTime;

public class PerformanceStringBuffer {
	public static void main(String[] args) {
		System.out.println("Performance StringBuffer");	// StringBuffer ist synchronisiert, d.h. Thread-sicher
		
		LocalTime lt = LocalTime.now();
		long nano1 = lt.toNanoOfDay();
		
		StringBuffer s = new StringBuffer();
		for (int i=0;i<10000000;i++)				// zehn Millionen
			s.append("A");
		
		lt = LocalTime.now();
		long nano2 = lt.toNanoOfDay();
		
		long duration = nano2-nano1;
		System.out.println("Duration="+duration/1000000+" Millisekunden");

		
	}
}
