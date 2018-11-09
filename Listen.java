import java.util.List;
import java.util.Vector;

public class Listen {
	public static void main(String[] args) {
		List <Integer> v = new Vector<Integer>();
		v.add(2);
		v.add(6);
		v.add(12);
		v.add(27);
		v.add(54);
		v.replaceAll(x -> 2*x);
		v.forEach(x -> System.out.println(x));
	}
}
