import java.io.*;
import java.io.BufferedReader;
public class EingabeDouble {
   public static void main(String args[]){
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      double x;
      try{
         System.out.print("x=");
         x=Double.parseDouble(in.readLine());
         System.out.println("x="+x);
      }
      catch(IOException e){}
   }
}
