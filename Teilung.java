
//Exceptions verursachen und auffangen
import java.io.*;
public class Teilung{
   public static void main(String args[]){
      int a,b,c;
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      try{
         System.out.println("Es wird a durch b geteilt in ganzen Zahlen:");
         System.out.print("a= ");
         a=Integer.parseInt(in.readLine());
         System.out.print("b= ");
         b=Integer.parseInt(in.readLine());
         c=a/b;
         System.out.println("c= "+c);
      }
      catch(IOException e){}
      catch(NumberFormatException n){
         System.out.println("nur ganze Zahlen");
      }
      catch(ArithmeticException arith){
         System.out.println("durch 0 geteilt?");
      }
   }
}