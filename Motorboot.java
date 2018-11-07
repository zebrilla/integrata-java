
class Motorboot extends Boot{
   private double leistung;
   public void geschw(){
      geschwindigkeit=100*Math.sqrt(leistung/gewicht);
   }
   public void eingeben(){
      System.out.println("Motorboot");
      super.eingeben();
      System.out.print("Leistung des Bootes = ");
      leistung=lies_double();
   }
   public void ausgeben(){
      System.out.println("\n\nAusgabe:");
      geschw();
      fkt_energie();
      super.ausgeben();
      System.out.println("Leistung des Bootes  = "+leistung+" PS");
      System.out.println("Hoechstgeschwindikeit des Bootes = "+geschwindigkeit+" kn");
      System.out.println("Energie des Bootes bei Hoechstgeschwindigkeit= "+energie+" kNm");
   }
}
