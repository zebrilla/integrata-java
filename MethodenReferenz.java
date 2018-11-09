import java.util.Vector; 

public class MethodenReferenz {
	public static void main(String[] args) { 
		Vector<String> liste = new Vector<String>();
		liste.add("Clausen");
		liste.add("Meyer");
		liste.add("Schulz");
		liste.forEach(System.out::println); 
	}
}
