
abstract public class Konto {

	   protected double kontostand;
	   
	   public void einzahlen(double einz){
	      this.kontostand += einz;
	      System.out.println("Es wurden "+einz+" € eingezahlt.");
	      getKontostand();
	   }

	   abstract public void kontoID();
	   
	   public void auszahlen(double aus, double dispo){

		   kontoID();
		   System.out.println("Es sollen "+aus+" € bei einem Kontostand von "+kontostand+" € ausgezahlt werden");
		   if (this.kontostand - aus >= -1 * dispo) {
		    	  System.out.println("Die angeforderte Auszahlung wird genehmigt");
		    	  System.out.println();
		          }
		      else  {
		    	aus = this.kontostand + dispo;  
		    	  System.out.println("Die angeforderte Auszahlung kann nur bis zu einem");
		          System.out.println("Betrag "+aus+" € genehmigt werden.");
		    	  System.out.println();
		          }
		      this.kontostand -= aus;
		      System.out.println("Es wurden "+aus+" € ausgezahlt.");
		      getKontostand();
	   }

	   public void getKontostand(){

		      kontoID();
		      System.out.println("Der Kontostand beträgt "+kontostand+" €.");
		      System.out.println();
	   }
	   
	   public Konto(){
		 System.out.println("ein neues Konto wurde eröffnet");
	     kontostand=0;
	   }
}
