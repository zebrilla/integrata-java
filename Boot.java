import java.io.*;
// import static java.lang.Math.*;	// Bemerkung: statische Importe

public class Boot{
   
   protected double laenge, breite, gewicht;
   protected double geschwindigkeit, energie;
   
   public void fkt_energie(){
      //energie=0.5*gewicht*geschwindigkeit*geschwindigkeit;
      energie=0.5*gewicht*Math.pow(1.8/3.6*geschwindigkeit,2.0)/1000;
   }

   public double lies_double(){
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      double y=0;
      try{
         y=Double.parseDouble(in.readLine());
      }
      catch(IOException e){}
      return y;
   }

   public void eingeben(){
      System.out.print("Laenge des Bootes = ");
      laenge=lies_double();
      System.out.print("Breite des Bootes = ");
      breite=lies_double();					
      System.out.print("Gewicht des Bootes = ");
      gewicht=lies_double();
   }

   public void ausgeben(){
      System.out.println("Laenge des Bootes  = "+laenge+" m");
      System.out.println("Breite des Bootes = "+breite+" m");
      System.out.println("Gewicht des Bootes = "+gewicht+" kg");
   }
}
