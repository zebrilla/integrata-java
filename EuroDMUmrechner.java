import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EuroDMUmrechner {

	public static void main(String[] args) throws IOException{
		
		float euro, dm;
		final float faktor = 1.95583f;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Euro DM Umrechner");
		System.out.print("Betrag in Euro eingeben = ");
		euro = Float.parseFloat(bf.readLine());
		dm = faktor * euro;
		
		System.out.println(euro + " Euro sind " + dm + " DM");
	}
}
