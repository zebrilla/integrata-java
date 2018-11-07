
public class HaupKonto {
	   public static void main(String args[]){ 
		   double limit;
		    
		    
		   Girokonto gir1 = new Girokonto();
		   limit=gir1.tellDispo();
		   gir1.einzahlen(500.00);
		   gir1.auszahlen(900, limit);
		   gir1.applySoll();
		   gir1.auszahlen(900, limit);

		   System.out.println();
		   Sparkonto spa1 = new Sparkonto();
		   spa1.applyHaben();
		   spa1.einzahlen(500.00);
		   spa1.applyHaben();
		   spa1.auszahlen(900, 0);
		   }
}
