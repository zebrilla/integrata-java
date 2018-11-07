
/* Hello.java */
// import java.io.*;

public class Hello{
   public static void main(String args[]){
      int i=0;
      while(i<10){
         System.out.println(i+"  Hello, new java world");
         i++;
      }
      System.out.println("\n\n");
      i=0;
      do{
         System.out.println(i+"  Hello, new java world");
         i++;
      }while(i<10);
      
      System.out.println("\n\n");
      
      for(int j=0;j<10;j++)
         System.out.println(j+"  Hello, new java world");
      
      System.out.println("\n\n");
      
      int x[] = {4,6,9};
      for (int k : x) 
          System.out.println(k+"  Hello, new java world");
   }
}
