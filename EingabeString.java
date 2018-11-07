//import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class EingabeString{
   public static void main(String args[]){
      String name;
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      try{
         System.out.print("Name=");
         name = in.readLine();
         System.out.println("Name:"+name);
      }
      catch(IOException e){}
   }
}
