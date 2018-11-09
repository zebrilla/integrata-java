import java.time.LocalTime;
public class PerformanceString {

	public static void main(String[] args) {
		System.out.println("Performance String");
		
		LocalTime lt = LocalTime.now();
		long nano1 = lt.toNanoOfDay();
		
		String s = new String();
		for (int i=0;i<100000;i++)   // hunderttausend
			s+="A";
		
		lt = LocalTime.now();
		long nano2 = lt.toNanoOfDay();
		
		long duration = nano2-nano1;
		System.out.println("Duration="+duration/1000000+" Millisekunden");

		
	}
}
