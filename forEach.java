import java.util.Vector; 

public class forEach {
	public static void main(String[] args) { 
		Vector<String> liste = new Vector<String>();
		liste.add("Clausen");
		liste.add("Meyer");
		liste.add("Schulz");
		
		for(int i=0;i<liste.size();i++)					// seit Java 1.0
			System.out.println(liste.get(i));
		
		for(String list :liste)							// seit Java 5.0	
			System.out.println(list);
		
		liste.forEach( x -> System.out.println(x) );  	// seit Java 8.0	Lambda Ausdruck
		
		liste.forEach(System.out::println);				// seit Java 8.0	Methodenreferenz
	} 
}


