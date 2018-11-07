
public class Girokonto extends Konto{
	

	   protected double sollZinssatz;
	   protected double dispo;
	   
	   public void getSollZinssatz(){
		      System.out.println("Der Zinssatz beträgt "+sollZinssatz+" €.");
	   }
	   
	   public void applySoll() {
		      kontoID();
			  System.out.println("Girokonto");
		      System.out.println("Der Zinssatz beträgt "+sollZinssatz+" €.");
			   if (this.kontostand >= 0) {
			    	  System.out.println("Das Konto ist im Haben - es werden keine Zinsen fällig");
			    	  System.out.println();
			          }
			      else  {
			    	  System.out.println("Auf den Kontostand "+this.kontostand+" € werden");
			    	  System.out.println(sollZinssatz * 100 +" % Sollzinsen angewendet");
			    	  this.kontostand = this.kontostand * (1 - this.sollZinssatz);  
			    	  System.out.println();
				      getKontostand();
			          }
		      
	   }
	   
	   public void kontoID(){
		   System.out.println("Girokonto");
		   }

	   public void getDispo(){
		      System.out.println("Das Dispolimit beträgt "+dispo+" €.");
	   }
	   
	   public double tellDispo(){
		      return dispo;
	   }
	   
	   public Girokonto(){
				 System.out.println("es handelt sich um ein Girokonto");
				 
				   sollZinssatz = 0.105;
				   dispo = 1000;
				   System.out.println();
				   getSollZinssatz();
				   getDispo();
				   getKontostand();
				   
				   
	   } 
}
