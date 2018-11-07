
public class Sparkonto extends Konto{
	

	   protected double habenZinssatz;
	   
	   public void getHabenZinssatz(){
		      System.out.println("Der Zinssatz beträgt "+habenZinssatz+" €.");
	   }
	   
	   public void applyHaben() {
		      System.out.println();
		      kontoID();
		      System.out.println("Der Zinssatz beträgt "+habenZinssatz+" €.");
			  if (kontostand == 0) {
			    	  System.out.println("Das Konto enthält kein Guthaben - es werden keine Zinsen fällig");
			    	  System.out.println();
			          }
			  else  {
			    	  System.out.println("Auf den Kontostand "+kontostand+" € werden");
			    	  System.out.println(habenZinssatz * 100 +" % Habenzinsen angewendet");
			    	  kontostand = kontostand * (1 + this.habenZinssatz);  
			    	  System.out.println();
				      getKontostand();
			          }
		      
	   }
	   
	   public void kontoID(){
		   System.out.println("Sparkonto");
		   }
   
	   public Sparkonto(){
				 System.out.println("es handelt sich um ein Sparkonto");
				 
				   habenZinssatz = 0.003;
				   System.out.println();
				   getHabenZinssatz();
				   getKontostand();
				   
				   
	   } 
}

