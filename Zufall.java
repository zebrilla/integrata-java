import java.util.Random;

public class Zufall {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);			// MethodenReferenz  Consumer
		random.ints().limit(10).sorted().forEach(x -> System.out.println(x));	// Lambda Schreibweise
	}

}
