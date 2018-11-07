		
// import static java.lang.Math.*;
class Segelboot extends Boot{
   private double masthoehe, segelflaeche;
   public void geschw(){
      geschwindigkeit=2*Math.sqrt(laenge);
   }
   public void eingeben(){
      System.out.println("Segelboot");
      super.eingeben();
      System.out.print("Masthoehe des Bootes = ");
      masthoehe=lies_double();
      System.out.print("Segelflaeche des Bootes = ");
      segelflaeche=lies_double();
   }
   public void ausgeben(){
      System.out.println("\n\nAusgabe:");
      geschw();
      fkt_energie();
      super.ausgeben();
      System.out.println("Masthoehe des Bootes  = "+masthoehe+" m");
      System.out.println("Segelflaeche des Bootes = "+segelflaeche+" qm");
      System.out.println("Rumpfgeschwindikeit des Bootes = "+geschwindigkeit+" kn");
      System.out.println("Energie des Bootes bei Rumpfgeschwindigkeit= "+energie+" kJ\n\n");
   }
}
