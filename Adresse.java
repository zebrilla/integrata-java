import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adresse {
	private String strasse;
	private String wohnort;
	
	public void eingeben() {
	     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      try{ 
	         System.out.print("Strasse = ");
	         strasse = in.readLine();
	         System.out.print("Wohnort = ");
	         wohnort = in.readLine();
	      }
	      catch(IOException e){}
	}
	
	public void ausgeben(){
	      System.out.println("Strasse = " + strasse);
	      System.out.println("Wohnort = " + wohnort);
	}
}
