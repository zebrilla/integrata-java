import java.util.List;
import java.util.Vector;

public class Streams {
	public static void main(String[] args) {
		List <String> v = new Vector<String>();
		v.add("Schulz");
		v.add("Clausen");
		v.add("Schulze");
		v.add("Jansen");
		v.add("Hansen");
		v.add("Meier");
		v.add("Sawlanski");
		v.add("Trede");
		
		v.stream()
		.filter(s->s.contains("ans"))
		.sorted()
		.forEach(x -> System.out.println(x));
		
	}
}