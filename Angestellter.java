import java.io.*;

class  Angestellter  extends  Person{
   private String firma;
   private int nummer;
   public void eingeben(){ 
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      try{ 
    	 super.eingeben(); 
         System.out.print("Firma=");
         firma = in.readLine();
         System.out.print("Nummer=");
         nummer=Integer.parseInt(in.readLine());
      }
      catch(IOException e){
         //nichts
      }
   }   
   
   public void ausgeben(){ 
      super.ausgeben();
      System.out.println("Firma:"+firma);
      System.out.println("Nummer:"+nummer);
   }
}
