
//Exceptions verursachen und auffangen
import java.io.*;
public class Ausnahme{
   public static void main(String args[]){
      int x[]=new int[5];
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      try{
         for(int i=0;i<5;i++){
            System.out.print("x["+i+"]= ");
            x[i]=Integer.parseInt(in.readLine());
         }
         System.out.println("Ausgabe:");
         for(int i=0;i<=5;i++)
            System.out.println("x["+i+"]= "+x[i]);
      }
      catch(IOException e){}
      catch(NumberFormatException n){
         System.out.println("nur ganze Zahlen");
         System.out.println(n.getMessage());
      }
      catch(ArrayIndexOutOfBoundsException a){
         System.out.println("Ihr Array ist zu klein");
         System.out.println(a.getMessage());
      }
      System.out.println("Ende");
   }
}